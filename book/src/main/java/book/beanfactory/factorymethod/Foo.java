package book.beanfactory.factorymethod;

/**
 * @Author chey
 * @Date 2021-11-29 19:08
 * @Describe  javabean业务对象
 */
public class Foo {
    public FooInterface fooInterface;//要依赖的对象  接口

    //无参  带参  xml法绑定fooInterface


    //传统不用xml法绑定fooInterface
    //无参
//    public Foo(){
//        fooInterface = StaticFactory.getInstance();//静态工厂方法  直接获得接口实现类  实现间接关联 如果更新业务逻辑 不需要修改业务对象
//    }
    //带参
//    public Foo(Fooxx fooxx){
//        fooInterface = StaticFactory.getInstance(fooxx);//静态工厂方法  直接获得接口实现类  实现间接关联 如果更新业务逻辑 不需要修改业务对象
//    }

    @Override
    public String toString() {
        return "Foo{" +
                "fooInterface=" + fooInterface +
                '}';
    }

    public FooInterface getFooInterface() {
        return fooInterface;
    }

    public void setFooInterface(FooInterface fooInterface) {
        this.fooInterface = fooInterface;
    }
}
