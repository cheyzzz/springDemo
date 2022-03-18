import com.aop.service.UserService;

//import com.chey.pojo.User;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author chey
 * @Date 2021-10-18 14:11
 * @Describe springtest
 */
public class MyTest {
    @Test
    public void test1() {
        //xml获取bean
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PersonDao contextBean = (PersonDao) context.getBean("human");//法一获取对象 强转
//        PersonDao contextBean = context.getBean("person", PersonDao.class);//法二获取对象 传入id或name别名和类型
        //java获取bean
//        ApplicationContext context = new AnnotationConfigApplicationContext(User.class);
//
//        User contextBean = context.getBean("user", User.class);//法二获取对象 传入id或name别名和类型
//
//        System.out.println(contextBean.toString());

    }

    //aop
    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-AOP.xml");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //代理的是接口
        UserService userService = (UserService) context.getBean("userservice");
        userService.add();
    }
}
