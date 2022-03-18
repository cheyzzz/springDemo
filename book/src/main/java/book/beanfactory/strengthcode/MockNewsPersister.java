package book.beanfactory.strengthcode;

/**
 * @Author chey
 * @Date 2021-12-02 10:58
 * @Describe  接口实现类  业务对象
 */
public class MockNewsPersister implements IFXNewsPersister {
    private FXNewsBean newsBean;
    public void persistNews(FXNewsBean bean) {
        persistNews();
    }
    public void persistNews() {
        System.out.println("persist bean:"+getNewsBean());
    }
    public FXNewsBean getNewsBean() {
        return newsBean;
    }
    public void setNewsBean(FXNewsBean newsBean) {
        System.out.println(newsBean);
        this.newsBean = newsBean;
    }
}
