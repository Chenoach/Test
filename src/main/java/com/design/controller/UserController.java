package com.design.controller;

import com.design.pojo.dto.UserLoginDTO;
import com.design.common.result.Result;
import com.design.pojo.entity.User;
import com.design.pojo.vo.UserLoginVO;
import com.design.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lumos
 */
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("login")
    public Result<UserLoginVO> login(@RequestBody UserLoginDTO userLoginDTO){
        User user =  userService.login(userLoginDTO);
        UserLoginVO userLoginVO = UserLoginVO.builder()
                .id(user.getId())
                .userName(user.getUserName())
                .build();
        return Result.success(userLoginVO);
    };
}
