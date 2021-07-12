package com.suzhoubank.mybatispaginator.mapper;

import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suzhoubank.mybatispaginator.enums.UserSexEnum;
import com.suzhoubank.mybatispaginator.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        int n = 60;
        for (int i = 0; i < n; i++) {
            userMapper.insert(new User("aa" + i, "a123456", UserSexEnum.WOMAN));
        }
    }

    @Test
    public void testGetOne() {
        User user = userMapper.getOne(1L);
        System.out.println(user);
    }

    @Test
    public void testGetAll() {
        List<User> users = userMapper.getAll();
        if (users == null || users.size() == 0) {
            System.out.println("is null");
        } else {
            users.forEach(System.out::println);
        }
    }


    @Test
    public void testUpdate() {
        long id = 1L;
        User user = userMapper.getOne(id);
        if (user != null) {
            System.out.println(user);
            user.setNickname("Jessica");
            userMapper.update(user);
            Assert.assertEquals("Jessica", userMapper.getOne(id).getNickname());
        } else {
            System.out.println("not find user id=" + id);
        }
    }


    @Test
    public void testDelete() {
        int count = userMapper.delete(3L);
        if (count > 0) {
            System.out.println("delete is success");
        } else {
            System.out.println("delete if failed");
        }
    }

    @Test
    public void testGetAllPages() {
//        PageHelper.startPage(1, 5);
//        List<User> users = userMapper.getAll();
        PageInfo<User> pageInfo = PageHelper.startPage(1, 5)
                .doSelectPageInfo(() -> userMapper.getAll());
        System.out.println(pageInfo);
    }

}