package book.beanfactory.strengthcode;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @Author chey
 * @Date 2021-11-17 15:14
 * @Describe 对象注册与依赖绑定  直接编码方式
 */
public class BeanFactoryDemo {
//    public static void main(String[] args)
//    {
//        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
////        SpringBeanFactory container = (SpringBeanFactory)bindViaCode(beanRegistry);//
//
//        FXNewsProvider newsProvider = (FXNewsProvider)container.getBean("djNewsProvider");
//        newsProvider.getAndPersistNews();
//    }
//    public static SpringBeanFactory bindViaCode(BeanDefinitionRegistry registry){
//        //用BeanDefinition获得对应对象的bean
//        AbstractBeanDefinition newsProvider = new RootBeanDefinition(FXNewsProvider.class,true);
//        AbstractBeanDefinition newsListener = new RootBeanDefinition(DowJonesNewsListener.class,true);
//        AbstractBeanDefinition newsPersister = new RootBeanDefinition(DowJonesNewsPersister.class,true);
//        // 将bean对象定义注册到容器中
//        registry.registerBeanDefinition("djNewsProvider", newsProvider);
//        registry.registerBeanDefinition("djListener", newsListener);
//        registry.registerBeanDefinition("djPersister", newsPersister);
//        // 指定依赖关系绑定
//        // 1. 可以通过构造方法注入方式
//        ConstructorArgumentValues argValues = new ConstructorArgumentValues();
//        argValues.addIndexedArgumentValue(0, newsListener);
//        argValues.addIndexedArgumentValue(1, newsPersister);
//        newsProvider.setConstructorArgumentValues(argValues);
//        // 2. 或者通过setter方法注入方式
////        MutablePropertyValues propertyValues = new MutablePropertyValues();
////        propertyValues.addPropertyValue(new ropertyValue("newsListener",newsListener));
////        propertyValues.addPropertyValue(new PropertyValue("newPersistener",newsPersister));
////        newsProvider.setPropertyValues(propertyValues);
//        // 绑定完成
//        return (SpringBeanFactory)registry;
//}
}
