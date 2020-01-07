package com.nwnu.blockchain.service;

import com.nwnu.blockchain.domain.User;


public interface IUserService {

    int addUser(User user);

    int changePwd(Integer userId, String password);

    public boolean YZLogin(String username, String password);


}
