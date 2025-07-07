# API Documentation

## Overview
This document provides comprehensive documentation for the Java Developer Portfolio API. The API is built using Spring Boot and provides RESTful endpoints for managing profile information, projects, and contact form submissions.

## Base URL
```
http://localhost:8080
```

## Authentication
Currently, the API does not require authentication for public endpoints. Admin endpoints (if implemented) would require proper authentication.

## API Endpoints

### 1. Profile Management

#### GET /api/profile
Retrieves the developer's complete profile information.

**Description:** Returns comprehensive profile data including personal information, experience, skills, education, and social links.

**Request:**
```http
GET /api/profile
```

**Response:**
```json
{
  "name": "Hemanth Kumar Kodhati",
  "phone": "(812) 223-2110",
  "email": "hemanth0070kodhati@gmail.com",
  "yearsOfExperience": 6,
  "education": [
    "Indiana State University, Terre Haute, Indiana - Master of Science, Computer Science, GPA: 3.94/4.0",
    "Visvesvaraya Technological University (Sapthagiri College of Engineering), Bangalore, India - Bachelor of Engineering, Electrical & Electronics Engineering, Percentage: 61%"
  ],
  "skills": [
    "Programming Languages: Java, J2EE, JSP, Servlet, JDBC, C, Data Structures, Python, Shell Scripting",
    "Frameworks: Spring, Hibernate, Spring Boot, Spring Batch, Spring Security, Apache Kafka",
    "Database Technologies: MySQL, Oracle, SQLite, Postgres, PL/SQL, Stored Procedures, Triggers",
    "Cloud Platforms: AWS (EC2, S3, RDS, IAM, Auto-scaling, Load Balancers), GCP, RedHat OpenShift",
    "Web Technologies: HTML, CSS, JavaScript, Bootstrap",
    "DevOps Tools: Docker, Kubernetes, Jenkins, GIT, JIRA, Maven",
    "Monitoring & Logging: DataDog, Metrics Collection with Kafka",
    "Other Technologies: Apache Tomcat, RESTful APIs, JWT, OAuth 2.0, Kafka Streams, Kafka Connect"
  ],
  "experience": [
    "Java Developer, Ventechsoft INC (Capital One) - Plano, TX (June 2024 - Present): Led AWS Gen2 to Gen3 migration, re-engineered microservices using Java 21 and Spring Boot 3.x, implemented CI/CD pipelines, Docker containers, Kubernetes (EKS), AWS services (Batch, Kinesis, RDS, DynamoDB, API Gateway, Lambda), CloudWatch monitoring, and more.",
    "Kafka Java Developer, Infosys (CitizensBank), NJ (June 2022 - May 2024): Designed and maintained Kafka-based systems for real-time data processing, led onshore team, implemented microservices, Spring Boot, Kafka Streams, Kafka Connect, PostgreSQL, DataDog, migrated from Java 11 to Java 17 using CQRS pattern.",
    "Java Developer, Infosys (American Express), Phoenix AZ (Aug 2021 - June 2022): Migrated monolithic app to microservices, built REST APIs using Spring MVC, performed data analysis, Spring Boot, Hibernate, MySQL, Jenkins, Git, Agile methodology.",
    "Graduate Assistant, Indiana State University (Aug 2020 – May 2021): Developed JavaScript assignments for students, integrated math problems, improved student success rate by 16%.",
    "Junior Java Developer, Niduss HR Services, India (June 2017 - July 2019): Developed payroll tax calculation modules, worked with Oracle databases, Hibernate ORM, reduced employee onboarding process by 10%."
  ],
  "projects": [
    "Sentiment Analysis and Data Collection (MS): NLP, ML, Flask, Python, GCP, NLTK, Edit Distance, N-grams.",
    "Source Characteristics for Pollution Studies (BE): PSPICE, pollution simulation, published in NPES-18."
  ],
  "socialLinks": [
    "https://linkedin.com/in/yourprofile",
    "https://github.com/yourusername"
  ]
}
```

**Status Codes:**
- `200 OK` - Profile retrieved successfully
- `500 Internal Server Error` - Server error

---

### 2. Projects Management

#### GET /api/projects
Retrieves all projects with optional pagination and sorting.

**Description:** Returns a list of all projects with their details, technologies, and metadata.

**Request:**
```http
GET /api/projects?page=0&size=10&sort=completionDate,desc
```

**Query Parameters:**
- `page` (optional): Page number (default: 0)
- `size` (optional): Number of items per page (default: 10)
- `sort` (optional): Sort field and direction (default: "completionDate,desc")

**Response:**
```json
[
  {
    "id": 1,
    "title": "Capital One - Cloud Migration",
    "description": "Enterprise-level cloud migration initiative involving critical business services, microservices architecture implementation, and comprehensive AWS infrastructure management.",
    "fullDescription": "Detailed project description with technical specifications and achievements.",
    "technologies": "Java 21, Spring Boot 3.x, AWS, Docker, Kubernetes",
    "category": "Cloud Migration",
    "completionDate": "2024-12-01",
    "experienceDuration": "2 years",
    "githubUrl": "https://github.com/example",
    "liveUrl": "https://example.com",
    "imageUrl": "/images/capital-one-logo.png",
    "jobTitle": "Senior Java Developer"
  },
  {
    "id": 2,
    "title": "Citizens Bank - Kafka Streams",
    "description": "Real-time data processing system implementation for financial transaction processing with robust data pipelines and microservices architecture.",
    "fullDescription": "Comprehensive description of Kafka Streams implementation.",
    "technologies": "Apache Kafka, Spring Boot, PostgreSQL, Microservices, DataDog",
    "category": "Data Processing",
    "completionDate": "2024-05-15",
    "experienceDuration": "2 years",
    "githubUrl": "https://github.com/example2",
    "liveUrl": "https://example2.com",
    "imageUrl": "/images/citizens-bank-logo.svg",
    "jobTitle": "Kafka Java Developer"
  }
]
```

**Status Codes:**
- `200 OK` - Projects retrieved successfully
- `400 Bad Request` - Invalid query parameters
- `500 Internal Server Error` - Server error

#### GET /api/projects/{id}
Retrieves a specific project by ID.

**Description:** Returns detailed information about a specific project.

**Request:**
```http
GET /api/projects/1
```

**Path Parameters:**
- `id` (required): Project ID

**Response:**
```json
{
  "id": 1,
  "title": "Capital One - Cloud Migration",
  "description": "Enterprise-level cloud migration initiative...",
  "fullDescription": "Detailed project description...",
  "technologies": "Java 21, Spring Boot 3.x, AWS, Docker, Kubernetes",
  "category": "Cloud Migration",
  "completionDate": "2024-12-01",
  "experienceDuration": "2 years",
  "githubUrl": "https://github.com/example",
  "liveUrl": "https://example.com",
  "imageUrl": "/images/capital-one-logo.png",
  "jobTitle": "Senior Java Developer"
}
```

**Status Codes:**
- `200 OK` - Project retrieved successfully
- `404 Not Found` - Project not found
- `500 Internal Server Error` - Server error

#### POST /api/projects
Creates a new project (Admin only).

**Description:** Adds a new project to the portfolio.

**Request:**
```http
POST /api/projects
Content-Type: application/json

{
  "title": "New Project",
  "description": "Project description",
  "fullDescription": "Detailed project description",
  "technologies": "Java, Spring Boot, MySQL",
  "category": "Web Development",
  "completionDate": "2024-12-01",
  "experienceDuration": "1 year",
  "githubUrl": "https://github.com/example",
  "liveUrl": "https://example.com",
  "imageUrl": "/images/project-image.png",
  "jobTitle": "Developer"
}
```

**Response:**
```json
{
  "id": 3,
  "title": "New Project",
  "description": "Project description",
  "fullDescription": "Detailed project description",
  "technologies": "Java, Spring Boot, MySQL",
  "category": "Web Development",
  "completionDate": "2024-12-01",
  "experienceDuration": "1 year",
  "githubUrl": "https://github.com/example",
  "liveUrl": "https://example.com",
  "imageUrl": "/images/project-image.png",
  "jobTitle": "Developer"
}
```

**Status Codes:**
- `201 Created` - Project created successfully
- `400 Bad Request` - Invalid request data
- `401 Unauthorized` - Authentication required
- `500 Internal Server Error` - Server error

---

### 3. Contact Management

#### POST /api/contacts
Submits a contact form message.

**Description:** Allows visitors to send contact messages through the portfolio website.

**Request:**
```http
POST /api/contacts
Content-Type: application/json

{
  "name": "John Doe",
  "email": "john@example.com",
  "subject": "Job Opportunity",
  "message": "I would like to discuss a potential opportunity with your team. Please let me know when you're available for a call."
}
```

**Request Body Schema:**
```json
{
  "name": "string (required) - Sender's full name",
  "email": "string (required) - Sender's email address",
  "subject": "string (required) - Message subject",
  "message": "string (required) - Message content"
}
```

**Response:**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "subject": "Job Opportunity",
  "message": "I would like to discuss a potential opportunity with your team. Please let me know when you're available for a call.",
  "createdAt": "2024-07-06T23:16:25.000Z",
  "read": false
}
```

**Status Codes:**
- `201 Created` - Contact message submitted successfully
- `400 Bad Request` - Invalid request data
- `500 Internal Server Error` - Server error

#### GET /api/contacts
Retrieves all contact messages (Admin only).

**Description:** Returns all contact form submissions for administrative review.

**Request:**
```http
GET /api/contacts
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com",
    "subject": "Job Opportunity",
    "message": "I would like to discuss a potential opportunity...",
    "createdAt": "2024-07-06T23:16:25.000Z",
    "read": false
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "jane@example.com",
    "subject": "Collaboration Request",
    "message": "I'm interested in collaborating on a project...",
    "createdAt": "2024-07-06T22:30:15.000Z",
    "read": true
  }
]
```

**Status Codes:**
- `200 OK` - Contact messages retrieved successfully
- `401 Unauthorized` - Authentication required
- `500 Internal Server Error` - Server error

#### PUT /api/contacts/{id}/read
Marks a contact message as read (Admin only).

**Description:** Updates the read status of a contact message.

**Request:**
```http
PUT /api/contacts/1/read
```

**Path Parameters:**
- `id` (required): Contact message ID

**Response:**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "subject": "Job Opportunity",
  "message": "I would like to discuss a potential opportunity...",
  "createdAt": "2024-07-06T23:16:25.000Z",
  "read": true
}
```

**Status Codes:**
- `200 OK` - Contact message updated successfully
- `404 Not Found` - Contact message not found
- `401 Unauthorized` - Authentication required
- `500 Internal Server Error` - Server error

---

## Error Responses

### Standard Error Format
```json
{
  "timestamp": "2024-07-06T23:16:25.000Z",
  "status": 400,
  "error": "Bad Request",
  "message": "Validation failed",
  "path": "/api/contacts"
}
```

### Common Error Codes
- `400 Bad Request` - Invalid request data or parameters
- `401 Unauthorized` - Authentication required
- `404 Not Found` - Resource not found
- `500 Internal Server Error` - Server error

---

## Rate Limiting
Currently, the API does not implement rate limiting. For production deployment, consider implementing rate limiting to prevent abuse.

## CORS Configuration
The API is configured to allow cross-origin requests from any origin for development purposes. For production, restrict CORS to specific domains.

## Data Validation
All endpoints validate input data using Spring Boot validation annotations:
- Required fields are validated
- Email format is validated
- String length limits are enforced
- Date formats are validated

---

## Testing the API

### Using cURL

#### Get Profile
```bash
curl -X GET http://localhost:8080/api/profile
```

#### Get Projects
```bash
curl -X GET http://localhost:8080/api/projects
```

#### Submit Contact Form
```bash
curl -X POST http://localhost:8080/api/contacts \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe",
    "email": "john@example.com",
    "subject": "Test Message",
    "message": "This is a test message."
  }'
```

### Using Postman
1. Import the API endpoints into Postman
2. Set the base URL to `http://localhost:8080`
3. Use the provided request examples above

### Using Swagger UI
1. Start the application
2. Navigate to `http://localhost:8080/swagger-ui.html`
3. Explore and test the API endpoints interactively

---

## Database Schema

### Projects Table
```sql
CREATE TABLE projects (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(8000),
    full_description VARCHAR(15000),
    technologies VARCHAR(2000),
    category VARCHAR(255),
    completion_date DATE,
    experience_duration VARCHAR(255),
    github_url VARCHAR(255),
    live_url VARCHAR(255),
    image_url VARCHAR(255),
    job_title VARCHAR(255)
);
```

### Contacts Table
```sql
CREATE TABLE contacts (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    subject VARCHAR(255) NOT NULL,
    message VARCHAR(2000) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    read BOOLEAN NOT NULL DEFAULT FALSE
);
```

---

## Versioning
Current API version: `v1.0.0`

API versioning is handled through URL paths. Future versions will be available at `/api/v2/...`

---

## Support
For API support or questions:
- Email: hemanth0070kodhati@gmail.com
- LinkedIn: [Hemanth Kumar Kodhati](https://www.linkedin.com/in/hemanth-kumar-k-java7)
- GitHub: [hkodhati](https://github.com/hkodhati) 