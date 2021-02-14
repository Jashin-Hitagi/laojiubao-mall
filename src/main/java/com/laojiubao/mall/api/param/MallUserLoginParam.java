package com.laojiubao.mall.api.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @program: laojiubao-mall
 * @description: 用户登录param
 * @author: WangHao
 * @create: 2021-02-14 16:18
 **/
@Data
public class MallUserLoginParam  implements Serializable {

    @ApiModelProperty("登录名")
    @NotEmpty(message = "登录名不能为空")
    private String loginName;

    @ApiModelProperty("用户密码（需要MD5加密）")
    @NotEmpty(message = "密码不能为空")
    private String passwordMd5;

}
