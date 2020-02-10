package com.developer.fast.springcloud.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description:
 * @Author: shuai.chen
 * @Date: 2019/9/16 09:26
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends BaseException {

	private static final long serialVersionUID = 2287456601871695920L;

	public NotFoundException(String message) {
        super(message);
    }
}
