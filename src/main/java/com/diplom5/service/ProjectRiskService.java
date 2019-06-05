package com.diplom5.service;

import com.diplom5.entity.ProjectRisk;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProjectRiskService {


    ProjectRisk findOne(int id);
    List<ProjectRisk> findAll();
}
