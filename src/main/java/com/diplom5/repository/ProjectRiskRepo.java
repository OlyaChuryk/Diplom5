package com.diplom5.repository;

        import com.diplom5.entity.ProjectRisk;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface ProjectRiskRepo extends JpaRepository<ProjectRisk, Long> {

    ProjectRisk findByProjectName(String projectName);
    ProjectRisk findById(int id);
    List<ProjectRisk> findAll();
}
