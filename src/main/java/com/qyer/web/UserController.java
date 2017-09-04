package com.qyer.web;

import com.qyer.entity.UserEntity;
import com.qyer.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  //private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserService userService;

  @RequestMapping("/getUsers")
  public List<UserEntity> getUsers() {

    return userService.getList();
  }

  @RequestMapping("/getUser")
  public UserEntity getUser(Long id) {
    return userService.getUser(id);
  }

  @RequestMapping("/add")
  public void save(UserEntity user) {
    userService.save(user);
  }

  @RequestMapping(value = "/update")
  public void update(UserEntity user) {
    userService.update(user);
  }

  @RequestMapping(value = "/delete")
  public void delete(Long id) {
    userService.delete(id);
  }


}