package cn.itcast.service.impl;

import cn.itcast.dao.Userdao;
import cn.itcast.domain.User;
import cn.itcast.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userserviceimpl implements Userservice {
    @Autowired
    private Userdao userdao;
    public List<User> findAll() {
       return userdao.findAll();
    }
}
