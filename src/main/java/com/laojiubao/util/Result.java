package com.laojiubao.util;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private static  final  long serialVersionUID = 1L;

    //业务码 比如成功，失败，权限不足等CODE 可自定义
    @ApiModelProperty("返回码")
    private  int resultCode;
    //返回信息 后端在进行业务处理后返回给前端的一个提示信息 可自行定义
    @ApiModelProperty("返回信息")
    private  String message;
    //数据结果 泛型
    @ApiModelProperty("返回数据")
    private  T data;

    public Result(){
    }

    public  Result(int resultCode,String message){
        this.resultCode = resultCode;
        this.message = message;
    }

    @Override
    public String toString(){
        return "Result{"+
                "resultCode="+resultCode+
                ",message='"+message+'\''+
                ",data="+data+
                '}';
    }

}
