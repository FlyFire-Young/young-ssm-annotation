package cn.young.dao;

import cn.young.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: Young
 * @Date: 2018-06-06 20:39
 * @Description:
 */
@Mapper
@Repository
public interface UserMapper {

    /**
     * 根据姓名查询数据
     * @param username
     * @return 实体数据
     */
    @Select("SELECT * FROM user WHERE username = #{username}")
    @ResultType(User.class)
    List<User> selectUser(String username);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select * from user where id=#{id}")
    User getUserById(Integer id);

    /**
     * 插入用户
     * @param user
     */
    @Insert("insert into user(username,age,customerid) values(#{username},#{age},#{customerid}) ")
    void insertUser(User user);

    /**
     * 更新一条记录
     * @param user
     */
    @Update("update user set username=#{username},age=#{age} where id=#{id}")
    void updateUser(User user);

    /**
     * 删除一条记录
     * @param id
     */
    @Delete("delete from user where id=#{id}")
    void deleteUser(Integer id);
}
