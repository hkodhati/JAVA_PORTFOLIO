package com.portfolio.controller;

import com.portfolio.model.Profile;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin(origins = "*")
@Tag(name = "Profile", description = "Profile management APIs")
public class ProfileController {

    @GetMapping
    @Operation(
        summary = "Get developer profile",
        description = "Retrieves the complete profile information of the Java developer including personal details, experience, skills, and education."
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "Profile retrieved successfully",
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = Profile.class)
            )
        ),
        @ApiResponse(
            responseCode = "500",
            description = "Internal server error"
        )
    })
    public Profile getProfile() {
        return new Profile(
            "Hemanth Kumar Kodhati",
            "(812) 223-2110",
            "hemanth0070kodhati@gmail.com",
            6,
            Arrays.asList(
                "Indiana State University, Terre Haute, Indiana - Master of Science, Computer Science, GPA: 3.94/4.0",
                "Visvesvaraya Technological University (Sapthagiri College of Engineering), Bangalore, India - Bachelor of Engineering, Electrical & Electronics Engineering, Percentage: 61%"
            ),
            Arrays.asList(
                "Programming Languages: Java, J2EE, JSP, Servlet, JDBC, C, Data Structures, Python, Shell Scripting",
                "Frameworks: Spring, Hibernate, Spring Boot, Spring Batch, Spring Security, Apache Kafka",
                "Database Technologies: MySQL, Oracle, SQLite, Postgres, PL/SQL, Stored Procedures, Triggers",
                "Cloud Platforms: AWS (EC2, S3, RDS, IAM, Auto-scaling, Load Balancers), GCP, RedHat OpenShift",
                "Web Technologies: HTML, CSS, JavaScript, Bootstrap",
                "DevOps Tools: Docker, Kubernetes, Jenkins, GIT, JIRA, Maven",
                "Monitoring & Logging: DataDog, Metrics Collection with Kafka",
                "Other Technologies: Apache Tomcat, RESTful APIs, JWT, OAuth 2.0, Kafka Streams, Kafka Connect"
            ),
            Arrays.asList(
                "Java Developer, Ventechsoft INC (Capital One) - Plano, TX (June 2024 - Present): Led AWS Gen2 to Gen3 migration, re-engineered microservices using Java 21 and Spring Boot 3.x, implemented CI/CD pipelines, Docker containers, Kubernetes (EKS), AWS services (Batch, Kinesis, RDS, DynamoDB, API Gateway, Lambda), CloudWatch monitoring, and more.",
                "Kafka Java Developer, Infosys (CitizensBank), NJ (June 2022 - May 2024): Designed and maintained Kafka-based systems for real-time data processing, led onshore team, implemented microservices, Spring Boot, Kafka Streams, Kafka Connect, PostgreSQL, DataDog, migrated from Java 11 to Java 17 using CQRS pattern.",
                "Java Developer, Infosys (American Express), Phoenix AZ (Aug 2021 - June 2022): Migrated monolithic app to microservices, built REST APIs using Spring MVC, performed data analysis, Spring Boot, Hibernate, MySQL, Jenkins, Git, Agile methodology.",
                "Graduate Assistant, Indiana State University (Aug 2020 – May 2021): Developed JavaScript assignments for students, integrated math problems, improved student success rate by 16%.",
                "Junior Java Developer, Niduss HR Services, India (June 2017 - July 2019): Developed payroll tax calculation modules, worked with Oracle databases, Hibernate ORM, reduced employee onboarding process by 10%."
            ),
            Arrays.asList(
                "Sentiment Analysis and Data Collection (MS): NLP, ML, Flask, Python, GCP, NLTK, Edit Distance, N-grams.",
                "Source Characteristics for Pollution Studies (BE): PSPICE, pollution simulation, published in NPES-18."
            ),
            Arrays.asList(
                "https://linkedin.com/in/yourprofile",
                "https://github.com/yourusername"
            )
        );
    }
} 