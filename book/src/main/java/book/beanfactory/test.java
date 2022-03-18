package book.beanfactory;

/**
 * @Author chey
 * @Date 2021-12-06 19:21
 * @Describe
 */
public class test {
    public String str;


    public test() {
    }

    public test(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "test{" +
                "str='" + str + '\'' +
                '}';
    }

    public String gitTest(){
        return "git test";
    }

    public String branchModify(){
        return "modify1";
    }

    public String masterModify(){
        return "master modify";
    }
}
