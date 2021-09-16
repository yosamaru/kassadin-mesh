package com.yosamaru.cms.exception;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Set;

@RestControllerAdvice(basePackages = {"com.yosamaru.cms.controller"})
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {Throwable.class})
    String handleException(Throwable e, HttpServletRequest request) {

        if (e instanceof MissingServletRequestParameterException) {
            String msg = MessageFormat.format("缺少参数{0}", ((MissingServletRequestParameterException) e).getParameterName());
            return msg;
        }

        if (e instanceof ConstraintViolationException) {
            // 单个参数校验异常
            String msg = "";
            Set<ConstraintViolation<?>> sets = ((ConstraintViolationException) e).getConstraintViolations();
            if (CollectionUtils.isNotEmpty(sets)) {
                StringBuilder sb = new StringBuilder();
                sets.forEach(error -> {
                    if (error instanceof FieldError) {
                        sb.append(((FieldError) error).getField()).append(":");
                    }
                    sb.append(error.getMessage()).append(";");
                });
                msg = sb.toString();
                msg = StringUtils.substring(msg, 0, msg.length() - 1);
            }
            return msg;
        }

        if (e instanceof BindException) {
            // get请求的对象参数校验异常
            List<ObjectError> errors = ((BindException) e).getBindingResult().getAllErrors();
            String msg = getValidExceptionMsg(errors);

            return msg;
        }

        if (e instanceof MethodArgumentNotValidException) {
            // post请求的对象参数校验异常
            List<ObjectError> errors = ((MethodArgumentNotValidException) e).getBindingResult().getAllErrors();
            return getValidExceptionMsg(errors);
        }

        return "系统错!";
    }

    private String getValidExceptionMsg(List<ObjectError> errors) {
        if (CollectionUtils.isNotEmpty(errors)) {
            StringBuilder sb = new StringBuilder();
            errors.forEach(error -> {
                if (error instanceof FieldError) {
                    sb.append(((FieldError) error).getField()).append(":");
                }
                sb.append(error.getDefaultMessage()).append(";");
            });
            String msg = sb.toString();
            msg = StringUtils.substring(msg, 0, msg.length() - 1);
            return msg;
        }
        return null;
    }
}
