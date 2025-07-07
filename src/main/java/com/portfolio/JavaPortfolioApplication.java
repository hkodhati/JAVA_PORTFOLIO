package com.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.portfolio.model.Project;
import com.portfolio.repository.ProjectRepository;
import java.time.LocalDate;

@SpringBootApplication
public class JavaPortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaPortfolioApplication.class, args);
    }

    @Bean
    public CommandLineRunner seedProjects(ProjectRepository projectRepository) {
        return args -> {
            if (projectRepository.count() == 0) {
                Project p1 = new Project(
                    "AWS Gen2 to Gen3 Migration (Capital One)",
                    "Led the migration of multiple business-critical services from Gen2 to Gen3 AWS environments, ensuring consistent functionality and compliance. Re-engineered microservices using Java 21 and Spring Boot 3.x, leveraging virtual threads and pattern matching. Implemented comprehensive monitoring with CloudWatch metrics and automated deployment strategies.",
                    "Java 21, Spring Boot 3.x, AWS (Batch, Kinesis, RDS, DynamoDB, API Gateway, Lambda, SQS, EFS, CloudWatch, Secrets Manager), Docker, Kubernetes (EKS), Terraform, Git, Jenkins, Python, Kafka (MSK), Route 53, JUnit, Cucumber, JavaScript, JSF, XML, GIT, Maven, REST, iOS, Confluence, JIRA",
                    "https://images.unsplash.com/photo-1451187580459-43490279c0fa?w=400&h=300&fit=crop", 
                    "https://github.com/yourusername/aws-migration", 
                    "https://aws.amazon.com", 
                    LocalDate.of(2024, 7, 1), "Professional"
                );
                p1.setFullDescription("Led the migration of multiple business-critical services from Gen2 to Gen3 AWS environments, ensuring consistent functionality, resiliency, and compliance. Segregated and onboarded ASVs (Application Service Vectors) and Business Applications (BAs) into their respective Gen3 landing zones, aligning with Capital One's account boundary architecture. Used bogie files (declarative YAML configurations) to define all app-level infrastructure including gears for batch jobs, stream consumers, APIs, RDS, DynamoDB, and more — ensuring consistent, auditable, and automated provisioning via Capital One's deployment platform. Leveraged the latest AWS gears supported in Gen3, including API Gateway + Lambda, AWS Batch, Amazon Kinesis, Amazon RDS & Aurora PostgreSQL, Amazon DynamoDB, Secrets Manager, EFS, SQS, and SNS for secure and scalable integration across services. Re-engineered microservices using Java 21 and Spring Boot 3.x, leveraging features like virtual threads, pattern matching, and improved record support. Ensured app behavior and performance parity by testing all components post-migration, including API throughput, batch job completion, and stream consumer lag. Deployed apps to production using Capital One's PAR (Production Application Release) model, ensuring proper change control, automated rollout, and rollback strategies. Throttled traffic between Gen2 and Gen3 using Amazon Route 53 weighted routing policies, enabling canary and blue/green deployments. Validated and executed batch jobs in Gen3 using AWS Batch gear by customizing the job definitions, IAM roles, retries, and alarms in the bogie file. Implemented CloudWatch metrics, dashboards, and alerts for monitoring job execution, API errors, stream throughput, and database health. Identified and remediated ATTDs (Application Technical Test Defects) post-deployment by deep-diving into CloudWatch logs, IAM permissions, and bogie misconfigurations. Participated in gear reviews and collaborated with platform teams to onboard any missing gears or fix unsupported configurations in bogie files. Used Spring-IOC concepts and Spring/Chassis MVC pattern and customized the internal Capital One 'Auto loan' application. Developed REST-based services using Spring MVC architecture and used JSON for the data transfer. Worked with platform and application stakeholders to define and steer designing, developing REST APIs and platform services following MVC architecture for Web/Mobile applications using Spring in an agile environment. Worked on different operations of RESTful services like PUT, POST, UPDATE, and DELETE. Actively used the defect tracking tool JIRA to create and track the defects during the QA phase of the project. Developed test cases using JUnit and Cucumber in Test Driven Development (ATTD'S). Implemented AWS IAM for managing the credentials of applications that run on EC2 instances. Implemented AWS solutions using EC2, S3, RDS, EBS, Elastic Load Balancer, Auto-scaling groups. Good experience in SCRUM process of Agile (Iterative) development methodology. Used Apache Tomcat as an application server to deploy various components of the application. Strong experience with REST web services. Experience working with AWS for storage & content delivery and application deployment services. Worked closely with the team to achieve continuous integration and continuous delivery. Experience in deploying the microservices using Docker containers and ability to set up continuous integration and deployment pipeline using Jenkins with GitHub on AWS or any Cloud Service. Experience in Spring Security Framework for User Access Management, JWT token-based authentication and involved OAuth 2.0 configuration for authentication, authorization. Implemented a metrics collection mechanism for the server by utilizing Apache Kafka to stream server-side events. Developed Controller Classes using Spring AOP, Spring Boot, Spring Batch modules and handled the security using Spring Security. Wrote complex SQL queries, PL/SQL, stored procedures, functions, triggers, cursors, and indexes. Used Jenkins to integrate the build and trigger the auto build and nightly deployment based on code check-in in the repo.");
                p1.setExperienceDuration("0.8 years (10 months, ongoing)");
                p1.setJobTitle("Java Developer");
                projectRepository.save(p1);

                Project p2 = new Project(
                    "Kafka Data Streaming Platform (CitizensBank)",
                    "Designed and developed Kafka-based systems for real-time data processing and streaming. Implemented complex data pipelines using Kafka Streams and Kafka Connect for seamless data movement. Migrated from Java 11 to Java 17 and implemented CQRS pattern for improved performance.",
                    "Java, Spring Boot, Microservices, Query, JSON, Jira, Rally, Git, Jenkins, Docker, Maven, Apache Kafka, Postgres, DataDog",
                    "https://images.unsplash.com/photo-1551288049-bebda4e38f71?w=400&h=300&fit=crop", 
                    "https://github.com/yourusername/kafka-platform", 
                    "https://kafka.apache.org", 
                    LocalDate.of(2024, 5, 1), "Professional"
                );
                p2.setFullDescription("Designed, developed, and maintained Kafka-based systems for real-time data processing and streaming. Implemented complex data pipelines using Kafka Streams and Kafka Connect. Worked closely with cross-functional teams to understand business requirements and translate them into technical solutions. Worked as Onshore lead to gather business requirements and guided the offshore team in a timely fashion. Participated in code reviews, design meetings, and sprint planning sessions. Collaborated with the team to improve the development process and ensure high-quality code. Designed an ideal approach for data movement from different sources via Apache/Confluent Kafka. Implemented Spring Boot microservices to process the messages into the Kafka cluster setup. Closely worked with the Kafka Admin team to set up Kafka cluster setup on the QA and Production environments. Implemented reprocessing of failure messages in Kafka using offset id. Implemented Kafka producer and consumer applications on Kafka cluster setup with help of Zookeeper. Used Spring Kafka API calls to process the messages smoothly on Kafka Cluster setup. Have knowledge on partition of Kafka messages and setting up the replication factors in Kafka Cluster. Handled importing of data from various data sources, performed transformations. Performed code and unit testing for complex scope modules and projects while diagnosing critical issues. Migrated the project from Java 11 to Java 17 and implemented it using CQRS pattern. Used Maps and reflections concept to overcome tight coupling issue. Implemented Multi schema partial search concept for the search bar. Used Altova to create xsd files for the DB and used them to map it to the external parties DB.");
                p2.setExperienceDuration("2 years (Jun 2022 - May 2024)");
                p2.setJobTitle("Kafka Java Developer");
                projectRepository.save(p2);

                Project p3 = new Project(
                    "Microservices Migration (American Express)",
                    "Migrated existing monolithic application into REST-based microservices to improve scalability and agility. Built REST APIs using Spring MVC for data quality checks, transformation, and provisioning. Implemented comprehensive testing using JUnit and Postman for API validation.",
                    "Spring Boot, MVC Design Pattern, Hibernate, HTML5, CSS3, JavaScript, Bootstrap, MySQL, Maven, Junit, Jenkins, Postman, Git",
                    "https://images.unsplash.com/photo-1555066931-4365d14bab8c?w=400&h=300&fit=crop", 
                    "https://github.com/yourusername/microservices-migration", 
                    "https://spring.io/projects/spring-boot", 
                    LocalDate.of(2022, 6, 1), "Professional"
                );
                p3.setFullDescription("Involved in project design meetings, business analysis meetings. Followed Agile methodology during the development of the application. Analyzed and built REST APIs using Spring MVC for an already existing Monolithic Application to fetch the metadata from the source, also does Data Quality checks, Transformation, Enrichment and Provisioning and then store it into the downstream consumer Database. Done Data Analysis for the Source, Legacy and Downstream consumer DataBase using MySQL Queries. Migrated the existing application into REST based Microservices to scale and improve the agility of the application using Spring Boot. Used Postman to test the rest-based services and used Junit to test the functionality. Used Git for version control and configured along with Jenkins for CI/CD.");
                p3.setExperienceDuration("1 year (Aug 2021 - Jun 2022)");
                p3.setJobTitle("Java Developer");
                projectRepository.save(p3);

                Project p4 = new Project(
                    "Graduate Assistant (Indiana State University)",
                    "Developed interactive math problem assignments using JavaScript for contactless learning. Created an application that increased student success rate by 16% compared to previous semesters. Integrated modern web technologies to enhance educational experience.",
                    "JavaScript, HTML, CSS, Educational Technology",
                    "https://images.unsplash.com/photo-1503676260728-1c00da094a0b?w=400&h=300&fit=crop", 
                    "https://github.com/yourusername/educational-app", 
                    "https://indstate.edu", 
                    LocalDate.of(2021, 5, 1), "Professional"
                );
                p4.setFullDescription("Integrated math problems for students and developed assignments for students to practice using JavaScript. Application made contactless schooling possible. There was a 16% increase in the student success rate compared to previous semesters. Created interactive learning modules and assessment tools to enhance student engagement and understanding of mathematical concepts.");
                p4.setExperienceDuration("1 year (Aug 2020 - May 2021)");
                p4.setJobTitle("Graduate Assistant");
                projectRepository.save(p4);

                Project p5 = new Project(
                    "Payroll Tax Calculation Modules (Niduss HR Services)",
                    "Developed flexible tax calculation modules to streamline payroll processes with customizable deduction percentages. Used Hibernate ORM for seamless data mapping between MVC model and Oracle database. Reduced employee onboarding process by 10% and improved application efficiency.",
                    "Spring, JSP, HTML, JavaScript, CSS, MVC Design Pattern, Hibernate, MySQL, Tomcat",
                    "https://images.unsplash.com/photo-1554224155-6726b3ff858f?w=400&h=300&fit=crop", 
                    "https://github.com/yourusername/payroll-system", 
                    "https://niduss.com", 
                    LocalDate.of(2019, 7, 1), "Professional"
                );
                p5.setFullDescription("Developed Tax calculation modules to ease the payroll process which gave flexibility for the employer to choose the deduction percentage for different categories. Worked with SQL to interact with Oracle tables. Used Hibernate, object/relational-mapping (ORM) solution, technique of mapping data representation from MVC model to Oracle Relational data model with a SQL-based schema. Modules led to reduction in time and software complexity of the application. Reduced employee onboarding process by 10%. Implemented comprehensive payroll management features including tax calculations, deduction management, and reporting capabilities.");
                p5.setExperienceDuration("2 years (Jun 2017 - Jul 2019)");
                p5.setJobTitle("Junior Java Developer");
                projectRepository.save(p5);

                Project p6 = new Project(
                    "Sentiment Analysis and Data Collection (MS)",
                    "Built a sentiment analysis system using Natural Language Processing and Machine Learning to categorize text as positive or negative. Implemented Edit Distance Algorithm and N-grams using NLTK and Python. Deployed on Google Cloud Platform with Flask web framework.",
                    "Python, Flask, NLTK, GCP, Machine Learning, NLP, HTML, CSS, Bootstrap, JavaScript",
                    "https://images.unsplash.com/photo-1677442136019-21780ecad995?w=400&h=300&fit=crop", 
                    "https://github.com/yourusername/sentiment-analysis", 
                    "https://cloud.google.com", 
                    LocalDate.of(2021, 5, 1), "Academic"
                );
                p6.setFullDescription("Analyzing the word sentences and categorizing them as positive or a negative sentence using Natural language processing (NLP) and Machine Learning (ML). Used Edit Distance Algorithm, N-grams in Natural Language Processing (NLP) using NLTK and Python Mathematical statistics functions. Developed using Flask and Python modules, HTML, CSS, Bootstrap, JavaScript, Google Cloud Platform (GCP). Implemented advanced text preprocessing techniques and feature extraction methods to improve sentiment classification accuracy. Created a user-friendly web interface for text input and sentiment analysis results visualization.");
                p6.setExperienceDuration("1 year (2020-2021)");
                p6.setJobTitle("Academic Project");
                projectRepository.save(p6);

                Project p7 = new Project(
                    "Source Characteristics for Pollution Studies (BE)",
                    "Created virtual circuits using PSPICE Software for pollution studies on electrical insulators. Validated power source against critical nature conditions with simulation results matching practical insulator pollution study values. Project was accepted by CPRI for further research and published in Fifth National Conference.",
                    "PSPICE, Electrical Engineering, Simulation, Circuit Design",
                    "https://images.unsplash.com/photo-1621905251189-08b45d6a269e?w=400&h=300&fit=crop", 
                    "https://github.com/yourusername/pollution-studies", 
                    "https://cpri.in", 
                    LocalDate.of(2017, 6, 1), "Academic"
                );
                p7.setFullDescription("Validation of Power Source against the critical nature conditions. Created a virtual circuit using PSPICE Software for pollution studies on an Insulator which when simulated gives nearly the same values as that of the practical Insulator pollution study values. This has been accepted by the CPRI (Central Power Research Institute) for further Research about pollution studies on an Insulator. Project was published in Fifth National Conference (NPES-18). Conducted extensive research on electrical insulator behavior under various environmental conditions and developed simulation models for pollution studies. Created comprehensive documentation and technical reports for research findings and implementation methodologies.");
                p7.setExperienceDuration("1 year (2016-2017)");
                p7.setJobTitle("Academic Project");
                projectRepository.save(p7);
            }
        };
    }

} 