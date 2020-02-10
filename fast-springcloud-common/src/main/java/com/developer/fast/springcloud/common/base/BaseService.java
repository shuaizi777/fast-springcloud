package com.developer.fast.springcloud.common.base;


import com.developer.fast.springcloud.common.exception.NotFoundException;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Description:
 * @Author: shuai.chen
 * @Date: 2019/7/19 09:58
 */
public class BaseService {


    public static final void notNull(Object var, String message) {
        if (var == null) {
            throw new IllegalArgumentException(message);
        }
    }


    public static final void notFound(Object var, String message) {
        if (var == null) {
            throw new NotFoundException(message);
        }
    }


    public static final void listNotEmpty(List<?> var, String message) {
        if (var == null || var.size() == 0) {
            throw new IllegalArgumentException(message);
        }
    }


    public static final void listNotFound(List<?> var, String message) {
        if (var == null || var.size() == 0) {
            throw new NotFoundException(message);
        }
    }


    public static final boolean listNotEmpty(List<?> var) {
        if (var == null || var.size() == 0) {
            return false;
        }
        return true;
    }


    public static final <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>(16);
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


    public static final void crudSuccess(boolean condition, String failMessage) {
        if (!condition) {
            throw new RuntimeException(failMessage);
        }
    }


}
