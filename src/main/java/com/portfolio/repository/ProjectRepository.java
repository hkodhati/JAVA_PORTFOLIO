package com.portfolio.repository;

import com.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    
    List<Project> findByCategoryOrderByCompletionDateDesc(String category);
    
    List<Project> findAllByOrderByCompletionDateDesc();
    
    List<Project> findByTechnologiesContainingIgnoreCase(String technology);
} 