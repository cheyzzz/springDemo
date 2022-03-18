package book.beanfactory.factorymethod;

import book.beanfactory.strengthcode.FXNewsBean;
import book.beanfactory.strengthcode.IFXNewsPersister;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @Author chey
 * @Date 2021-12-03 16:59
 * @Describe  实现BeanFactoryAware接口    使得该bean持有BeanFactory的引用
 */
public class MockNewsPersisterBeanFactory implements IFXNewsPersister, BeanFactoryAware {
    private BeanFactory beanFactory;

    //实例化容器时自动向容器注入这个bean
    public void setBeanFactory(BeanFactory bf) throws BeansException {
        this.beanFactory = bf;
    }

    public void persistNews(FXNewsBean bean) {
        persistNews();
    }
    public void persistNews() {
        System.out.println("persist bean:" + getNewsBean());
    }
    public FXNewsBean getNewsBean() {
        return (FXNewsBean)beanFactory.getBean("bean");
    }
}
