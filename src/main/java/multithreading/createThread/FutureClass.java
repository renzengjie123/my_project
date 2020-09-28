package multithreading.createThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Future就是对于具体的Runnable或者Callable任务的执行结果进行取消、查询是否完成、获取结果。
 * 必要时可以通过get方法获取执行结果，该方法会阻塞直到任务返回结果。
 */
public class FutureClass implements Future {

    /**
     * cancel 方法用来取消任务，如果取消任务成功则返回true，如果取消任务失败则返回false。
     * 参数mayInterruptIfRunning表示是否允许取消正在执行却没有执行完毕的任务，如果设置true，
     * 则表示可以取消正在执行过程中的任务。如果任务已经完成，则无论mayInterruptIfRunning为true还是false，
     * 此方法肯定返回false，即如果取消已经完成的任务会返回false；如果任务正在执行，若mayInterruptIfRunning设置为true，
     * 则返回true，若mayInterruptIfRunning设置为false，则返回false；如果任务还没有执行，
     * 则无论mayInterruptIfRunning为true还是false，肯定返回true。
     * @param mayInterruptIfRunning
     * @return
     */
    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    /**
     * isCancelled 方法表示任务是否被取消成功，如果在任务正常完成前被取消成功，则返回 true。
     * @return
     */
    @Override
    public boolean isCancelled() {
        return false;
    }

    /**
     * isDone 方法表示任务是否已经完成，若任务完成，则返回true；
     * @return
     */
    @Override
    public boolean isDone() {
        return false;
    }

    /**
     * get() 方法用来获取执行结果，这个方法会产生阻塞，会一直等到任务执行完毕才返回；
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @Override
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    /**
     * get(long timeout, TimeUnit unit) 用来获取执行结果，如果在指定时间内，还没获取到结果，就直接返回null。
     * @param timeout
     * @param unit
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     * @throws TimeoutException
     */
    @Override
    public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
