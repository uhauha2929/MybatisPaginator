package com.suzhoubank.mybatispaginator.mapper;

import com.suzhoubank.mybatispaginator.pojo.User;

import java.util.List;

public interface UserMapper {


    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    int update(User user);

    int delete(Long id);
}
