package testAQS;

import algorithm.ITestInterface;
import util.LogUtil;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;

public class ProduceAndConsume implements ITestInterface {
    private Queue<Integer> pool = new ArrayDeque<>();
    private MutexCustom mutex = new MutexCustom();
    private Condition produceCondition = mutex.newCondition();
    private Condition customCondition = mutex.newCondition();
    private int index = 0;
    private int produceTime = 1000;
    private int MAX = 5;

    @Override
    public void test() {
        Thread produceThread = new Thread(() -> {
            mutex.lock();
            try {
                if (pool.size() < MAX) {
                    pool.add(index++);
                    LogUtil.d("生产::" + pool.toString());
                    Thread.sleep(produceTime);
                    produceCondition.signal();
                    produceCondition.await();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mutex.unlock();
            }
        });
        Thread consumeThread = new Thread(() -> {
            mutex.lock();
            try {
                Thread.sleep(100);
                Integer curr = pool.poll();
                LogUtil.d("消费::" + curr + " 消费之后::" + pool.toString());
                customCondition.signal();
                customCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mutex.unlock();
            }
        });
        produceThread.start();
        consumeThread.start();
    }

}
