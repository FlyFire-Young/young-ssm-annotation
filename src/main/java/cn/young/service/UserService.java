package cn.young.service;

import cn.young.entity.User;

import java.util.List;

/**
 * @Auther: Young
 * @Date: 2018-06-06 21:06
 * @Description:
 */
public interface UserService {

    /**
     * 根据传入名称获取数据
     * @param username 名称
     * @return 实体类
     */
    List<User> queryUserByUserName(String username);

    /**
     * 根据 id 查询一条记录
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 增加一条记录
     * @param user
     */
    void insertUser(User user);

    /**
     * 更新一条记录
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除一条记录
     * @param id
     */
    void deleteUser(Integer id);
}
