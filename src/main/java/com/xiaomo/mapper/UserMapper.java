package com.xiaomo.mapper;

import com.xiaomo.domain.User;
import com.xiaomo.handler.MyHandler;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;


@Mapper
public interface UserMapper {

    @Select("select * from user")
    @Results({@Result(property = "createTime", column = "createTime", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP, typeHandler = MyHandler.class)})
    List<User> findAll();

}
