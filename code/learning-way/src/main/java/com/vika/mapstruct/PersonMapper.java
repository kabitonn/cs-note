package com.vika.mapstruct;

import com.vika.reflection.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author tangjiawei
 * @Date 2020/8/27
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
