package com.developer.fast.springcloud.common.base;

import com.developer.fast.springcloud.common.constant.Constant;
import com.developer.fast.springcloud.common.dto.Response;

import java.util.List;

/**
 * @Description:
 * @Author: shuai.chen
 * @Date: 2019/7/19 09:57
 */
public class BaseController {


    public static final <F> Response<F> setResult(String message, F data) {
        Response<F> response =  new Response<>();
        response.setMessage(message);
        response.setData(data);
        return response;
    }


    public static final <F> Response<F> setResultSuccess(F data) {
        return setResult(Constant.SUCCESS_MESSAGE, data);
    }


    public static final <F> Response<F> setResultSuccess(String message, F data) {
        return setResult(message, data);
    }


    public static final <F> Response<F> setResultSuccess() {
        return setResult(Constant.SUCCESS_MESSAGE, null);
    }


    public static final void notNull(Object var, String message) {
        if (var == null){
            throw new IllegalArgumentException(message);
        }
    }


    public static final boolean listNotEmpty(List<?> var) {
        if (var == null || var.size() == 0) {
            return false;
        }
        return true;
    }


    public static final void listNotEmpty(List<?> var, String message) {
        if (var == null || var.size() == 0) {
            throw new IllegalArgumentException(message);
        }
    }


}
