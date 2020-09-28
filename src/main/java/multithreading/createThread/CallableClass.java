package multithreading.createThread;

import java.util.concurrent.Callable;

public class CallableClass implements Callable {

    /**
     * 接口有返回值
     * @return
     * @throws Exception
     */
    @Override
    public Object call() throws Exception {
        System.out.println("创建线程方法3实现Callable接口");
        return null;
    }
}
