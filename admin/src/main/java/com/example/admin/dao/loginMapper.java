package com.example.admin.dao;

import com.example.admin.domain.admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface loginMapper {
    @Select("select * from admin")
    List<admin>match();
}
