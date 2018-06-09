package cn.young.service.Impl;

import cn.young.entity.User;
import cn.young.service.AbstractService;
import cn.young.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Young
 * @Date: 2018-06-06 21:07
 * @Description:
 */
@Service
public class UserServiceImpl extends AbstractService implements UserService {

    @Override
    public List<User> queryUserByUserName(String username) {
        List<User> list = userMapper.selectUser(username);
        return list;
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }
}
