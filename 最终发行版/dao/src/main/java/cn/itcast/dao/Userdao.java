package cn.itcast.dao;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Userdao {
    @Select("select * from items")
    List<User> findAll();
}
