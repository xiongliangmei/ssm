package com.runke.service;

import com.runke.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
public interface IUserService {

    List<User> getUser();
}
