package ch.goods;

import ch.goods.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

    @Test
    public void content(){
        System.out.println(person.toString());
    }
}
