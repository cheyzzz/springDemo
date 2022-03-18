package book.beanfactory.factorymethod;

/**
 * @Author chey
 * @Date 2021-12-01 10:03
 * @Describe  接口实现类  包含业务逻辑
 */
public class FooInterfaceImpl implements FooInterface {
    public FooInterfaceImpl() {
        System.out.println("no parm");
    }

    public FooInterfaceImpl(Fooxx fooxx) {
        System.out.println("parm");
    }
}
class Fooxx{

}
