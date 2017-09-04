package com.qyer.service;

import com.qyer.entity.UserEntity;
import com.qyer.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by 20170220b on 2017/7/11.
 */
@Service
public class UserService {

  @SuppressWarnings("SpringJavaAutowiringInspection")
  @Autowired
  private UserMapper userMapper;

  public List<UserEntity> getList(){
    List<UserEntity> users=userMapper.getAll();
    return users;
  }

  public UserEntity getUser(Long id) {
    UserEntity user=userMapper.getOne(id);
    return user;
  }

  public void save(UserEntity user) {
    userMapper.insert(user);
  }

  public void update(UserEntity user) {
    userMapper.update(user);
  }

  public void delete(@PathVariable("id") Long id) {
    userMapper.delete(id);
  }
}
