package cn.young.controller;

import cn.young.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: Young
 * @Date: 2018-06-06 21:11
 * @Description:
 */
public class AbstractController {

    @Autowired
    public UserService userService;
}
