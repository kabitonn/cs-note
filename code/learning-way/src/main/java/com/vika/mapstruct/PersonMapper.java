package com.vika.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.vika.reflection.User;

/**
 * @author ：chenwei.tjw
 * @description：TODO
 * @date ：2020/7/22 10:51 上午
 */
@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    /**
     * 转换
     *
     * @param person
     * @return
     */
    User toUser(Person person);
}
