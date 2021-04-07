package com.mjie.exception;

/**
 * @author panmingjie
 * @date 2021/4/2 10:01
 */
public class ServiceException extends RuntimeException {
    public ServiceException(String message) {
        super(message);
    }
}
