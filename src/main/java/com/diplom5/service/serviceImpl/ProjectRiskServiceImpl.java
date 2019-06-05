package com.diplom5.service.serviceImpl;

import com.diplom5.entity.ProjectRisk;
import com.diplom5.repository.ProjectRiskRepo;
import com.diplom5.service.ProjectRiskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProjectRiskServiceImpl implements ProjectRiskService{
    @Autowired
    ProjectRiskRepo projectRiskRepo;


    public Optional<ProjectRisk> findOne(long id) {
        return projectRiskRepo.findById(id);
    }


    @Override
    public Iterable<ProjectRisk> findAll() {
        return projectRiskRepo.findAll();
    }
}
