package testAQS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class MutexCustom implements Lock {

    public static final int STATUS_ORIGIN = 0;
    public static final int STATUS_TARGET = 2;
    private Sync sync;

    public MutexCustom() {
        sync = new Sync();
    }

    public static class Sync extends AbstractQueuedSynchronizer {
        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(STATUS_ORIGIN, STATUS_TARGET)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            setState(STATUS_ORIGIN);
            setExclusiveOwnerThread(null);
            return true;
        }

        @Override
        protected boolean isHeldExclusively() {
            return true;
        }

        public Condition newCondition() {
            return new ConditionObject();
        }

        public int getCurrState() {
            return getState();
        }
    }

    @Override
    public void lock() {
        sync.acquire(STATUS_TARGET);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(STATUS_TARGET);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(STATUS_TARGET);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.release(STATUS_TARGET);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }


    public int getState() {
        return sync.getCurrState();
    }
}
