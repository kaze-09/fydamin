package com.example.admin.controller;

import com.example.admin.domain.Technician;
import com.example.admin.domain.Technician_id;
import com.example.admin.domain.User;
import com.example.admin.service.provideTechnicianList;
import com.example.admin.service.provideUserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class management {
    @Autowired
    private provideUserList provideUserList;
    @Autowired
    private provideTechnicianList provideTechnicianList;
    @RequestMapping("/getUsers")
    public @ResponseBody List<User> Users(){
        return provideUserList.getAllusers();
    }
    @RequestMapping("/getTechnicians")
    public @ResponseBody List<Technician> Technicians(){
        return provideTechnicianList.getAllTechnicians();
    }
    @RequestMapping("/deleteTechnician")
    public @ResponseBody String deleteTechnician(@RequestBody Technician_id Technician_id){
        String technician_id = Technician_id.getTechnician_id();
        provideTechnicianList.deleteTechnician(technician_id);
        return "true";
    }
    @RequestMapping("/addTechnician")
    public @ResponseBody String addTechnician(@RequestBody Technician technician){
        provideTechnicianList.addTechnician(technician.getTechnician_id(),technician.getRealname(),technician.getNickname(),technician.getPhone_no(),technician.getQq_no());
        return "true";
    }
    @RequestMapping("/updateTechnician")
    public @ResponseBody String updateTechnician(@RequestBody Technician technician){
        provideTechnicianList.updateTechnician(technician.getTechnician_id(),technician.getRealname(),technician.getNickname(),technician.getPhone_no(),technician.getQq_no());
        return "true";
    }
}
