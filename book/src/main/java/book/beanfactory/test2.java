package book.beanfactory;

import java.util.Date;

/**
 * @Author chey
 * @Date 2021-12-06 21:52
 * @Describe
 */
public class test2 {
    public Date date;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "test2{" +
                "date=" + date +
                '}';
    }
}
