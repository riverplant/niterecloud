package com.nitere.cloud.commons.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.http.HttpStatus;

@Data
@Accessors(chain = true)
public class ResultData<T> {
    private int code;
    private boolean success;
    private String message;
    private T data;
    private long timestamp;

    public ResultData() {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ResultData<T> success(T data) {
        return new ResultData<T>()
                .setSuccess(true)
                .setCode(HttpStatus.OK.value())
                .setMessage(HttpStatus.OK.name())
                .setData(data);
    }

    public static <T> ResultData<T> success() {
        return new ResultData<T>()
                .setSuccess(true)
                .setCode(HttpStatus.OK.value())
                .setMessage(HttpStatus.OK.name());
    }

    public static <T> ResultData<T> success(HttpStatus status, T data) {
        return new ResultData<T>()
                .setSuccess(true)
                .setCode(status.value())
                .setMessage(status.name())
                .setData(data);
    }


    public static <T> ResultData<T> fail(HttpStatus code, String message) {
        return new ResultData<T>()
                .setSuccess(false)
                .setCode(code.value())
                .setMessage(message);
    }

    public static <T> ResultData<T> fail(String message) {
        return fail(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }
}
