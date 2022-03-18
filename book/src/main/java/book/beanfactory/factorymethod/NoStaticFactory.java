package book.beanfactory.factorymethod;

/**
 * @Author chey
 * @Date 2021-12-01 16:25
 * @Describe  非静态工厂类  包含非静态工厂方法
 */
public class NoStaticFactory {
    public FooInterface getInstance(){
        return new FooInterfaceImpl();
    }
    public FooInterface getInstance(Fooxx fooxx){
        return new FooInterfaceImpl(fooxx);
    }
}
