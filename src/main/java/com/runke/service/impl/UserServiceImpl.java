package com.runke.service.impl;

import com.runke.dao.UserDao;
import com.runke.entity.User;
import com.runke.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;
   public List<User> getUser(){
       return  userDao.getUser();
    };
}
