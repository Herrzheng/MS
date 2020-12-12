package com.wind.dao;

import com.wind.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getUserList();

    public User getUserById(int id);

    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUser(int id);
}
