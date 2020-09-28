package agent;

/**
 * 测试类
 */
public class ProxyTest {

    public static void main(String[] args) {

        //区别：JDK代理只能对实现接口的类生成代理；CGlib是针对类实现代理，对指定的类生成一个子类，并覆盖其中的方法，这种通过继承类的实现方式，
        // 不能代理final修饰的类。

        //总结：1.JDK代理使用的是反射机制实现aop的动态代理，CGLIB代理使用字节码处理框架asm，通过修改字节码生成子类。
        // 所以jdk动态代理的方式创建代理对象效率较高，执行效率较低，cglib创建效率较低，执行效率高；
        // 2.JDK动态代理机制是委托机制，具体说动态实现接口类，在动态生成的实现类里面委托hanlder去调用原始实现类方法，CGLIB则使用的继承机制，
        // 具体说被代理类和代理类是继承关系，所以代理类是可以赋值给被代理类的，如果被代理类有接口，那么代理类也可以赋值给接口。
        UserManager userManager = (UserManager)new CGLibProxy().createProxyObject(new UserManagerImpl());
        System.out.println("CGLibProxy：");
        userManager.addUser("tom", "root");
        System.out.println("JDKProxy：");
        JDKProxy jdkProxy = new JDKProxy();
        UserManager userManagerJDK = (UserManager)jdkProxy.newProxy(new UserManagerImpl());
        userManagerJDK.addUser("tom", "root");
    }
}
