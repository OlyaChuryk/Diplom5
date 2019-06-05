package com.diplom5.repository;

import com.diplom5.entity.ProjectRisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRiskRepo extends JpaRepository<ProjectRisk, Long> {

    ProjectRisk findByProjectName(String projectName);
}
