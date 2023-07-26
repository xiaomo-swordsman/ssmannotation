package com.xiaomo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xiaomo.handler.MyHandler;
import lombok.Data;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

@Data
public class User {

    private int id;

    private String username;

    private String password;

    private String name;

//    private long createTime;

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
