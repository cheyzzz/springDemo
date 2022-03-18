package book.beanfactory.strengthcode;

/**
 * @Author chey
 * @Date 2021-11-17 15:18
 * @Describe javabean  业务对象
 */
public class FXNewsProvider {
    //要依赖的对象
    DowJonesNewsListener listener;
    DowJonesNewsPersister persister;

    //传统方法
//    public FXNewsProvider(){
//        this.listener=new DowJonesNewsListener();
//        this.persister=new DowJonesNewsPersister();
//    }
    //构造器注入
    public FXNewsProvider(DowJonesNewsListener listener,DowJonesNewsPersister persister){
        this.listener=listener;
        this.persister=persister;
    }
    //set注入
    public void setListener(DowJonesNewsListener listener) {
        this.listener = listener;
    }

    public void setPersister(DowJonesNewsPersister persister) {
        this.persister = persister;
    }
    public void getAndPersistNews(){
        System.out.println("ProviderMethod");
    }
}
