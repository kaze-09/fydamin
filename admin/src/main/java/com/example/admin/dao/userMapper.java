package com.example.admin.dao;

import com.example.admin.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface userMapper {
    @Select("select * from users")
    List<User> getAllUsers();
}
