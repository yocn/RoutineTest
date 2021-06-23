package testAQS;

import algorithm.ITestInterface;
import util.LogUtil;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;

public class TestNumberIncrease implements ITestInterface {
    private int index = 0;

    @Override
    public void test() {
//        useWait();
//        useLock();
        usePark();
    }

    private void useWait() {
        Object sync = new Object();

        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (sync) {
                    LogUtil.d("thread1: " + ++index);
                    try {
                        Thread.sleep(1000);
                        sync.notify();
                        sync.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (sync) {
                    LogUtil.d("thread2: " + ++index);
                    try {
                        Thread.sleep(1000);
                        sync.notify();
                        sync.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }

    private void useLock() {
        MutexCustom mutexSimple = new MutexCustom();
        Condition condition1 = mutexSimple.newCondition();
        Condition condition2 = mutexSimple.newCondition();

        Thread thread1 = new Thread(() -> {
            while (true) {
                LogUtil.d("thread1: " + ++index);
                try {
                    mutexSimple.lock();
                    Thread.sleep(1000);
                    condition2.signal();
                    condition1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    mutexSimple.unlock();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true) {
                LogUtil.d("thread2: " + ++index);
                try {
                    mutexSimple.lock();
                    Thread.sleep(1000);
                    condition1.signal();
                    condition2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    mutexSimple.unlock();
                }
            }
        });
        thread1.start();
        thread2.start();
    }

    private Thread thread1;
    private Thread thread2;

    private void usePark() {
        Runnable runnable1 = () -> {
            while (true) {
                try {
                    LogUtil.d("thread1: " + ++index);
                    LockSupport.park();
                    Thread.sleep(1000);
                    LockSupport.unpark(thread2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable runnable2 = () -> {
            while (true) {
                try {
                    LogUtil.d("thread2: " + ++index);
                    LockSupport.unpark(thread1);
                    LockSupport.park();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1 = new Thread(runnable1);
        thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
