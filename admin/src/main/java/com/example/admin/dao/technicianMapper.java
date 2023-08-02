package com.example.admin.dao;

import com.example.admin.domain.Technician;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface technicianMapper {
    @Select("select * from technicians")
    List<Technician> getAllTechnicians();

    @Delete("delete from technicians where technician_id = #{technician_id}")
    void deleteTechnician(String technician_id);

    @Insert("insert into technicians(technician_id,realname,nickname,phone_no,qq_no) values(#{technician_id},#{realname},#{nickname},#{phone_no},#{qq_no})")
    void addTechnician(String technician_id,String realname,String nickname,String phone_no,String qq_no);

    @Update("update technicians set realname=#{realname},nickname=#{nickname},phone_no=#{phone_no},qq_no=#{qq_no} where technician_id=#{technician_id}")
    void updateTechnician(String technician_id,String realname,String nickname,String phone_no,String qq_no);
}
