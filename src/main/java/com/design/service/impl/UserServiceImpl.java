package com.design.service.impl;
import com.design.common.constant.MessageConstant;
import com.design.common.exception.AccountNotFoundException;
import com.design.common.exception.PasswordErrorException;
import com.design.mapper.UserMapper;
import com.design.pojo.dto.UserLoginDTO;
import com.design.pojo.entity.User;
import com.design.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lumos
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;
    public User login(UserLoginDTO userLoginDTO) {
        String username = userLoginDTO.getUsername();
        String password = userLoginDTO.getPassword();

        //根据用户名查询数据库中的数据
        User user = userMapper.getByUsername(username);

        //如果用户名为空，抛错
        if (user == null){
            throw new AccountNotFoundException(MessageConstant.ACCOUNT_NOT_FOUND);
        }

        //如果密码错误，抛错
        if (!password.equals(user.getPassword())){
            throw new PasswordErrorException(MessageConstant.PASSWORD_ERROR);
        }

        System.out.println("登陆成功");
        return user;
    }
}
