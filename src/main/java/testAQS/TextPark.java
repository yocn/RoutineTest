package testAQS;

import algorithm.ITestInterface;
import util.LogUtil;

import java.util.concurrent.locks.LockSupport;

public class TextPark implements ITestInterface {

    private Thread thread1;
    private Thread thread2;

    private int index = 0;

    @Override
    public void test() {
        thread1 = new Thread(() -> {
            while (true) {
                if (thread2.isAlive()) {
                    LockSupport.unpark(thread1);
                    LockSupport.parkNanos(1000000);
                    LogUtil.d("thread1::" + ++index);
                } else {
                    thread2.start();
                }
            }
        });
        thread2 = new Thread(() -> {
            while (true) {
                LockSupport.parkNanos(1000000);
                LockSupport.unpark(thread1);
                LogUtil.d("thread2::" + ++index);
            }
        });
        thread1.start();
    }

}
