package com.diplom5.service.serviceImpl;

import com.diplom5.entity.ProjectRisk;
import com.diplom5.repository.ProjectRiskRepo;
import com.diplom5.service.ProjectRiskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProjectRiskServiceImpl implements ProjectRiskService{
    @Autowired
    ProjectRiskRepo projectRiskRepo;


    public ProjectRisk findOne(int id) {
        return projectRiskRepo.getOne(id);
    }


    @Override
    public List<ProjectRisk> findAll() {
        return projectRiskRepo.findAll();
    }
}
