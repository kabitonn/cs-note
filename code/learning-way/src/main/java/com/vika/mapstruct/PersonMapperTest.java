package com.vika.mapstruct;

import org.junit.Test;
import reflection.User;

/**
 * @author ：chenwei.tjw
 * @description：TODO
 * @date ：2020/7/22 10:52 上午
 */

public class PersonMapperTest {

    @Test
    public void testToUser(){
        Person person=new Person();
        person.setAge(10);
        User user = PersonMapper.INSTANCE.toUser(person);
        System.out.println(user);
    }
}
