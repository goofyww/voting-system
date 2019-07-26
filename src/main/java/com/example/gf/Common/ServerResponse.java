package com.example.gf.Common;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by gf on 2018/4/27.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//保证序列化json的时候,如果是null的对象,key也会消失
public class ServerResponse<T> implements Serializable{

    /** serialVersionUID*/  
	private static final long serialVersionUID = 2727880803892996407L;
	
	private int status;
    private String msg;
    private T data;

    private ServerResponse(int status){
        this.status = status;
    }
    private ServerResponse(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    private ServerResponse(int status,String msg){
        this.status = status;
        this.msg = msg;
    }
    private ServerResponse(int status,T data){
        this.status = status;
        this.data = data;
    }
    @JsonIgnore
    //使这个方法的返回值不在Json序列化结果当中
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }
    public int getStatus(){
        return status;
    }
    public String getMsg(){
        return msg;
    }
    public T getData(){
        return data;
    }
    //成功响应静态方法
    public static <T> ServerResponse<T> creatBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }
    public static <T> ServerResponse<T> creatBySuccessMsg(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }
    public static <T> ServerResponse<T> creatBySuccessData(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }
    public static <T> ServerResponse<T> creatBySuccess(String msg,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }
    //错误响应静态方法
    public static <T> ServerResponse<T> creatByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }
    public static <T> ServerResponse<T> creatByErrorMsg(String errorMsg){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),errorMsg);
    }
    //自定义响应静态方法 eg:参数错误
    public static <T> ServerResponse<T> creatByErrorCodeMsg(int code,String errorMsg){
        return new ServerResponse<T>(code,errorMsg);
    }
}
