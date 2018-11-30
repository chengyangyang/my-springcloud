package ch.mytest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import ch.mytest.bean.Person;

/**
 * Description:添加测试
 *
 * @author cy
 * @date 2018年11月30日 10:34
 * version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {

    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void content(){
        Object person1 = applicationContext.getBean("person1");
        System.out.println(person1);
        //System.out.println(person);
    }
}
