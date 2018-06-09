package cn.young.controller;

import cn.young.entity.User;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: Young
 * @Date: 2018-06-06 20:46
 * @Description:
 */
@RestController
@RequestMapping("/y/user")
public class UserController extends AbstractController {

    /**
     * 查询用户
     * @param username
     * @param httpServletResponse
     * @return
     */
    @RequestMapping(value = "queryU/{username}",method = RequestMethod.GET)
    public List<User> queryProduct(@PathVariable String username, HttpServletResponse httpServletResponse) {
        System.out.println(username);
        List<User> ulist = userService.queryUserByUserName(username);
        return ulist;
    }

    /**
     * 查询一条记录
     * @param id
     * @return
     */
    @RequestMapping("/getUserById")
    public User getUserById(Integer id) {
        return userService.getUserById(id);
    }

    /**
     * 增加一条记录
     * @param user
     */
    @RequestMapping("/insertUser")
    public void insertUser(User user) {
        userService.insertUser(user);
    }

    /**
     * 更新一条记录
     * @param user
     */
    @RequestMapping("/updateUser")
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    /**
     * 删除一条记录
     * @param id
     */
    @RequestMapping("/deleteUser")
    public void deleteUser(Integer id) {
        userService.deleteUser(id);
    }

}
