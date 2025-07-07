package com.portfolio.controller;

import com.portfolio.model.Project;
import com.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")
public class ProjectController {
    
    @Autowired
    private ProjectRepository projectRepository;
    
    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAllByOrderByCompletionDateDesc();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping("/category/{category}")
    public List<Project> getProjectsByCategory(@PathVariable String category) {
        return projectRepository.findByCategoryOrderByCompletionDateDesc(category);
    }
    
    @GetMapping("/technology/{technology}")
    public List<Project> getProjectsByTechnology(@PathVariable String technology) {
        return projectRepository.findByTechnologiesContainingIgnoreCase(technology);
    }
    
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable Long id, @RequestBody Project projectDetails) {
        Optional<Project> project = projectRepository.findById(id);
        if (project.isPresent()) {
            Project updatedProject = project.get();
            updatedProject.setTitle(projectDetails.getTitle());
            updatedProject.setDescription(projectDetails.getDescription());
            updatedProject.setTechnologies(projectDetails.getTechnologies());
            updatedProject.setGithubUrl(projectDetails.getGithubUrl());
            updatedProject.setLiveUrl(projectDetails.getLiveUrl());
            updatedProject.setImageUrl(projectDetails.getImageUrl());
            updatedProject.setCompletionDate(projectDetails.getCompletionDate());
            updatedProject.setCategory(projectDetails.getCategory());
            return ResponseEntity.ok(projectRepository.save(updatedProject));
        }
        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Long id) {
        Optional<Project> project = projectRepository.findById(id);
        if (project.isPresent()) {
            projectRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
} 