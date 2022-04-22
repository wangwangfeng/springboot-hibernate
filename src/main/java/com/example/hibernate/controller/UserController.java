package com.example.hibernate.controller;

import com.example.hibernate.entity.User;
import com.example.hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @time: 2022/4/22 10:02
 * @user: wwf
 */
@RestController
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/test1")
    public String test1() {
        User user = new User();
        user.setId(1);
        user.setName("张三1");
        user.setSex("男");
        user.setAge(15);
        userService.saveUser(user);
        return "成功！";
    }

    @GetMapping(value = "/test2")
    public String test2() {
        User user = userService.getUserById(1);
        user.setName("李四11");
/*        User user1 = new User();
        user1.setId(3);
        user1.setName("张三2");
        user1.setSex("男");
        user1.setAge(15);
        // 保存上面set才入库
        userService.saveUser(user1);
        // 查询上面set不入库
        userService.getUserById(2);*/

/*        BeanCopier beanCopier = BeanCopier.create(User.class, User.class, false);
        User user1 = new User();
        beanCopier.copy(user, user1, null);
        user1.setName("李四1");
        userService.saveUser(user1);
        userService.saveUser(user);*/
        // 这种复制不起作用
        return "成功！";
    }

    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        userService.deleteUser(id);
        System.out.println("删除成功！");
    }

    @GetMapping(value = "/select/{id}")
    public void selectById(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        System.out.println("根据主键查询:" + user == null ? "结果为空！" : user.getName());
    }



}
