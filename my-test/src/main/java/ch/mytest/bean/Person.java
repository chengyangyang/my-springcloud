package ch.mytest.bean;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月30日 10:25
 * version 1.0
 */
//@PropertySource(value = "classpath:person.yml",encoding="UTF-8")  //文件加载先从application中加载，再从person中加载，这个注解省略默认映射使用application，这个注解和value注解对应
@Component
@Validated
@ConfigurationProperties(prefix = "person")
public class Person {

    //@Value(value = "${person.mail}")
    @Email(message = "邮箱校验失败!")
    private String mail;
    private String name;
    private int age;
    private Date createDate;
    private Map<String,String> map;
    private List<String> list;
    private boolean bl;


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public boolean isBl() {
        return bl;
    }

    public void setBl(boolean bl) {
        this.bl = bl;
    }

    @Override
    public String toString() {
        return "Person{" +
                "mail='" + mail + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", createDate=" + createDate +
                ", map=" + map +
                ", list=" + list +
                ", bl=" + bl +
                '}';
    }
}
