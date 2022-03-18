package book.beanfactory.factorymethod;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author chey
 * @Date 2021-12-01 17:24
 * @Describe spring自带factorybean工厂类  注入业务对象的时候传入的对象是getObject返回的对象  类型是getObjectType返回的类型
 */
public class SpringBeanFactory implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new FooInterfaceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return FooInterface.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
