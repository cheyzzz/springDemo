package book.beanfactory.factorymethod;

import book.beanfactory.strengthcode.FXNewsBean;
import book.beanfactory.strengthcode.IFXNewsPersister;
import org.springframework.beans.factory.ObjectFactory;

/**
 * @Author chey
 * @Date 2021-12-06 15:13
 * @Describe
 */
public class MockNewsPersisterObjectFactory implements IFXNewsPersister {
    private ObjectFactory newsBeanFactory;

    public void setNewsBeanFactory(ObjectFactory newsBeanFactory) {
        this.newsBeanFactory = newsBeanFactory;
    }

    public void persistNews(FXNewsBean bean) {
        persistNews();
    }
    public void persistNews()
    {
        System.out.println("persist bean:"+getNewsBean());
    }

    public FXNewsBean getNewsBean() {
        return (FXNewsBean)newsBeanFactory.getObject();
    }

}
