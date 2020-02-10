package com.developer.fast.springcloud.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description:
 * @Author: shuai.chen
 * @Date: 2020/2/9 18:20
 */
@ApiModel(value = "Response", description="响应结果")
@Getter
@Setter
@ToString
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -6528624295433822311L;

    @ApiModelProperty(value = "错误消息提示")
    private String message = null;

    @ApiModelProperty(value = "数据内容")
    private T data = null;

}
