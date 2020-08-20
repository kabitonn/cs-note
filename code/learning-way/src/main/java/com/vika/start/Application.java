package com.vika.start;

import mapstruct.Person;
import mapstruct.PersonMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：chenwei.tjw
 * @date ：2020/7/22 11:06 上午
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Person person=new Person();
        PersonMapper.INSTANCE.toUser(person);
    }
}
