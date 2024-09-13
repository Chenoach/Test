package com.design.pojo.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Lumos
 *用户登录返回的数据格式
 */
@Data
@Builder
public class UserLoginVO implements Serializable {

    private String id;
    private String userName;
}
