package com.example.admin.service;

import com.example.admin.dao.technicianMapper;
import com.example.admin.domain.Technician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class provideTechnicianList {
    @Autowired
    private technicianMapper technicianMapper;
    public List<Technician> getAllTechnicians(){
        System.out.println(technicianMapper.getAllTechnicians());
        return technicianMapper.getAllTechnicians();
    }
    public void deleteTechnician(String technician_id){
        System.out.println(technician_id);
        technicianMapper.deleteTechnician(technician_id);
    }
    public void addTechnician(String technician_id,String realname,String nickname,String phone_no,String qq_no){
        technicianMapper.addTechnician(technician_id,realname,nickname,phone_no,qq_no);
    }
    public void updateTechnician(String technician_id,String realname,String nickname,String phone_no,String qq_no){
        technicianMapper.updateTechnician(technician_id,realname,nickname,phone_no,qq_no);
    }
}
