package com.cydeo.dto;

import org.springframework.http.HttpStatus;

public class ResponseWrapper {

    //custom class that will be converted to JSON

    private boolean success;
    private String message;
    private Integer code;
    private Object data; //any DTO, any object

    public ResponseWrapper(String message,Object data){
        this.message = message;
        this.data = data;
        this.code = HttpStatus.OK.value();
        this.success = true;
    }

    public ResponseWrapper(String message){
        this.message = message;
        this.code = HttpStatus.OK.value();
        this.success = true;
    }

}
