package com.design.service;

import com.design.pojo.dto.UserLoginDTO;
import com.design.pojo.entity.User;

/**
 * @author Lumos
 */
public interface UserService {
    /**
     * 登录
     * @param userLoginDTO
     * @return
     */
    User login(UserLoginDTO userLoginDTO);
}
