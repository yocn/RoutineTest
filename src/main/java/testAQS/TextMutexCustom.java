package testAQS;

import algorithm.ITestInterface;
import util.LogUtil;

import java.util.concurrent.locks.Condition;

public class TextMutexCustom implements ITestInterface {
    private MutexCustom mutexCustom = new MutexCustom();
    Condition condition1 = mutexCustom.newCondition();
    Condition condition2 = mutexCustom.newCondition();

    @Override
    public void test() {
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }

    Runnable runnable1 = () -> {
        while (true) {
            mutexCustom.lock();
            try {
                LogUtil.d(Thread.currentThread().getName() + "   " + mutexCustom.getState());
                Thread.sleep(1000);
                condition2.signal();
                condition1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mutexCustom.unlock();
            }
        }
    };

    Runnable runnable2 = () -> {
        while (true) {
            mutexCustom.lock();
            try {
                LogUtil.d(Thread.currentThread().getName() + "   " + mutexCustom.getState());
                Thread.sleep(1000);
                condition1.signal();
                condition2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mutexCustom.unlock();
            }
        }
    };

}
