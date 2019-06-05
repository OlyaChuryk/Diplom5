package com.diplom5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectRisk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String projectName;
    private String projectDescription;
    private String projectTags;
    private String projectLink;
    private String projectImageUrl;
    private double alf;
    private double beta;
    private double gamma;

    public ProjectRisk(String projectName, String projectDescription, String projectTags, String projectLink, String projectImageUrl, double alf, double beta, double gamma) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectTags = projectTags;
        this.projectLink = projectLink;
        this.projectImageUrl = projectImageUrl;
        this.alf = alf;
        this.beta = beta;
        this.gamma = gamma;
    }

    public ProjectRisk() {
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectTags() {
        return projectTags;
    }

    public void setProjectTags(String projectTags) {
        this.projectTags = projectTags;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public String getProjectImageUrl() {
        return projectImageUrl;
    }

    public void setProjectImageUrl(String projectImageUrl) {
        this.projectImageUrl = projectImageUrl;
    }

    public double getalf() {
        return alf;
    }

    public void setalf(double alf) {
        this.alf = alf;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }

    @Override
    public String toString() {
        return "ProjectRisk{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", projectTags='" + projectTags + '\'' +
                ", projectLink='" + projectLink + '\'' +
                ", projectImageUrl='" + projectImageUrl + '\'' +
                ", alf=" + alf +
                ", beta=" + beta +
                ", gamma=" + gamma +
                '}';
    }
}
