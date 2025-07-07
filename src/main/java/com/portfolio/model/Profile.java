package com.portfolio.model;

import java.util.List;

public class Profile {
    private String name;
    private String phone;
    private String email;
    private int yearsOfExperience;
    private List<String> education;
    private List<String> skills;
    private List<String> experience;
    private List<String> academicProjects;
    private List<String> links;

    public Profile() {}

    public Profile(String name, String phone, String email, int yearsOfExperience, List<String> education, List<String> skills, List<String> experience, List<String> academicProjects, List<String> links) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.yearsOfExperience = yearsOfExperience;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
        this.academicProjects = academicProjects;
        this.links = links;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }
    public List<String> getEducation() { return education; }
    public void setEducation(List<String> education) { this.education = education; }
    public List<String> getSkills() { return skills; }
    public void setSkills(List<String> skills) { this.skills = skills; }
    public List<String> getExperience() { return experience; }
    public void setExperience(List<String> experience) { this.experience = experience; }
    public List<String> getAcademicProjects() { return academicProjects; }
    public void setAcademicProjects(List<String> academicProjects) { this.academicProjects = academicProjects; }
    public List<String> getLinks() { return links; }
    public void setLinks(List<String> links) { this.links = links; }
} 