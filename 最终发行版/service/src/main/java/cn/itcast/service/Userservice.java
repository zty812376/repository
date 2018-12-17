package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

public interface Userservice {
    List<User> findAll();
}
