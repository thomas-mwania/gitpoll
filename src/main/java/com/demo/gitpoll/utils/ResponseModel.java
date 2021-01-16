package com.demo.gitpoll.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;

/**
 * created by tom9b
 * Created on 9/25/2018
 *
 * @project checksmart
 * @package com.checksmart.controllers.tools.file
 * @Copyright Riverbank Solutions Ltd
 */
public class ResponseModel<T> {
    @NotNull
    private String status;
    @NotNull
    private String message;
    private String ref;
    private T data;

    public ResponseModel() {

    }

    public ResponseModel(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseModel(String status, String message, T data) {
        this(status, message);
        this.data = data;
    }

    /**
     * Checks if the message returned is successful
     *
     * @return
     */
    @JsonIgnore
    public boolean isSuccess() {
        return "00".equals(status) | "0".equals(status);
    }

    //<editor-fold defaultstate="collapsed" desc="GETTERS AND SETTERS">
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
    //</editor-fold>

    @Override
    public String toString(){
        if(null != ref)
            return "{ \"status\": \"" + this.status + "\",\"message\":\"" + this.message + "\", \"ref\":\"" + this.ref + "\" }";
        else
            return "{ \"status\": \"" + this.status + "\",\"message\":\"" + this.message + "\" }";
    }
}
