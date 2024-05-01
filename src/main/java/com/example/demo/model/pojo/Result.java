package com.example.demo.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * todo: 响应结果
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String code;

    private String msg;

    private Object data;

    //增删改响应成功
    public static Result success(){
        return new Result("200","Success",null);
    }

    //查询成功
    public static Result success(Object data){
        return new Result("200","Success", data);
    }


    public static Result error(String msg){
        return new Result("404","Error", msg);
    }

    public static Result error(String code ,String msg){
        return new Result(code,"Error", msg);
    }
}
