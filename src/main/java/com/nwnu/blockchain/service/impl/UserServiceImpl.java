package com.nwnu.blockchain.service.impl;

import com.nwnu.blockchain.domain.User;
import com.nwnu.blockchain.mapper.UserMapper;
import com.nwnu.blockchain.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    private User user=null;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int changePwd(Integer userId, String password) {
        User user=this.userMapper.selectById(userId);
        user.setPassword(password);
        return this.userMapper.updateById(user);
    }

    @Override
    public boolean YZLogin(String username,String password){
        boolean flag=false;
        user=userMapper.selectYZLogin(username,password);
        if(!StringUtils.isEmpty(user)){
            log.info(user.toString());
            if(!user.getUsername().equals(null)){
                flag=true;
            }
        }
        return flag;
    }
}
