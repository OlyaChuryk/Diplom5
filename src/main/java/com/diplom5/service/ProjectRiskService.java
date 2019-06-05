package com.diplom5.service;

import com.diplom5.entity.ProjectRisk;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ProjectRiskService {
    Optional<ProjectRisk> findOne(long id);
    Iterable<ProjectRisk> findAll();
}
