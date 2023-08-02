package com.example.admin.domain;

import org.springframework.stereotype.Component;

@Component
public class Technician_id {
    private String technician_id;

    public String getTechnician_id() {
        return technician_id;
    }

    public void setTechnician_id(String technician_id) {
        this.technician_id = technician_id;
    }
}
