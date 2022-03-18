package book.beanfactory.factorymethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Author chey
 * @Date 2021-12-06 15:42
 * @Describe
 */
public class ProviderMethodReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("MethodReplace");
        return null;
    }
}
