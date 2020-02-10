package com.developer.fast.springcloud.common.exception;


import com.developer.fast.springcloud.common.constant.Constant;
import com.developer.fast.springcloud.common.dto.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description:
 * @Author: shuai.chen
 * @Date: 2019/9/16 09:26
 */
@RestControllerAdvice(basePackages = "com.developer.fast.springcloud")
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    /**
     * 系统级别异常
     * @param e
     * @return
     */
    @ExceptionHandler(Throwable.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response exception(Throwable e) {
        log.info("内部异常信息 ex={}", e.getMessage(), e);
        Response response = new Response();
        response.setMessage(Constant.SYSTEM_ERROR_MESSAGE);
        return response;
    }


    /**
     * 客户端调用异常,请求数据异常
     * @param e
     * @return
     */
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public Response exception(BaseException e) {
        log.info("客户端调用异常: ex={}", e.getMessage(), e);
        Response response = new Response();
        response.setMessage(e.getMessage());
        return response;
    }


    /**
     * 参数异常
     * @param e
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response exception(IllegalArgumentException e) {
        log.info("参数异常: ex={}", e.getMessage(), e);
        Response response = new Response();
        response.setMessage(e.getMessage());
        return response;
    }


}
