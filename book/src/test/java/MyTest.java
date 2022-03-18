import book.beanfactory.factorymethod.MockNewsPersisterBeanFactory;
import book.beanfactory.factorymethod.MockNewsPersisterObjectFactory;
import book.beanfactory.strengthcode.FXNewsProvider;
import book.beanfactory.test;
import book.beanfactory.test2;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author chey
 * @Date 2021-12-01 14:36
 * @Describe
 */
public class MyTest {
    @Test
    public void test1() {
        //传统工厂方式  创建对象
        //xml获取bean  创建业务对象  实例化容器ApplicationContext、BeanFactory
//        法一
        ApplicationContext context = new ClassPathXmlApplicationContext("beanfactory.xml");
//        法二
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanfactory.xml"));
//        法三  继承ApplicationContext
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanfactory.xml");
//        法四  继承BeanFactory
//        ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanfactory.xml"));

        //        手动装配BeanFactory使用的BeanFactoryPostProcessor
//        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
//        propertyPlaceholderConfigurer.setLocation(new ClassPathResource("prop.properties"));
//        propertyPlaceholderConfigurer.postProcessBeanFactory(beanFactory);

        //获取业务对象   ClassPathXmlApplicationContext为ApplicationContext的后代
//        法一
        test2 contextBean = (test2)context.getBean("test2");
//        法二
//        MockNewsPersister contextBean = context.getBean("mockpersister", MockNewsPersister.class);//法二 传入id或name别名和类型

        //java配置类获取bean
//        ApplicationContext context = new AnnotationConfigApplicationContext(Foo.class);

        //操作对象的方法
//         contextBean.toString();
        System.out.println(contextBean.toString());
//        contextBean.persistNews();






    }


}
class aa{

}

