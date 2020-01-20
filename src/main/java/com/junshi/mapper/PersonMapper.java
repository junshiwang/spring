package com.junshi.mapper;

import com.junshi.entity.Person;
import org.apache.ibatis.annotations.Select;

public interface PersonMapper {

    @Select("select * from person")
    Person[] getPersonList();
}
