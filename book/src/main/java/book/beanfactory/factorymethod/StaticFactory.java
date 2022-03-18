package book.beanfactory.factorymethod;

/**
 * @Author chey
 * @Date 2021-11-29 19:10
 * @Describe  静态工厂类  包含静态工厂方法
 */
public class StaticFactory {
    //无参
    public static FooInterface getInstance(){
        //静态工厂方法 直接返回接口实现类  如果更改逻辑 只需要修改实现类
        return new FooInterfaceImpl();
    }

    //带参
    public static FooInterface getInstance(Fooxx fooxx){
        //静态工厂方法 直接返回接口实现类  如果更改逻辑 只需要修改实现类
        return new FooInterfaceImpl(fooxx);
    }
}
