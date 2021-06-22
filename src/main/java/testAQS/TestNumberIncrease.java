package testAQS;

import algorithm.ITestInterface;
import util.LogUtil;

public class TestNumberIncrease implements ITestInterface {
    private int index = 0;

    @Override
    public void test() {
        useWait();
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

    }

    private void usePark() {

    }
}
