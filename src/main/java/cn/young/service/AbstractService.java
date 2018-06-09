package cn.young.service;

import cn.young.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: Young
 * @Date: 2018-06-06 21:09
 * @Description:
 */
public class AbstractService {

    @Autowired
    public UserMapper userMapper;
}
