# Java Developer Portfolio

A modern, responsive portfolio website built with Spring Boot backend and static HTML/CSS/JavaScript frontend. This portfolio showcases professional experience, projects, and provides a contact form for potential employers and collaborators.

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Git

### Installation & Running

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd JavaPortfolio
   ```

2. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

3. **Access the portfolio**
   - Open your browser and navigate to: `http://localhost:8080`
   - The application will automatically load the portfolio homepage

4. **Access API Documentation (Optional)**
   - Swagger UI: `http://localhost:8080/swagger-ui.html`
   - H2 Database Console: `http://localhost:8080/h2-console`

### Alternative: Using IDE
- Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, VS Code)
- Run `JavaPortfolioApplication.java` as a Spring Boot application
- Access at `http://localhost:8080`

## 🏗️ Technology Stack

### Backend
- **Java 17** - Core programming language
- **Spring Boot 3.x** - Application framework
- **Spring Data JPA** - Data persistence
- **H2 Database** - In-memory database for development
- **Maven** - Build tool and dependency management
- **Spring Web** - RESTful web services
- **Spring Boot DevTools** - Development utilities

### Frontend
- **HTML5** - Semantic markup
- **CSS3** - Styling with modern features
  - CSS Grid & Flexbox for responsive layouts
  - CSS Variables for theming
  - CSS Animations and transitions
- **Vanilla JavaScript** - Interactive functionality
- **Responsive Design** - Mobile-first approach

### Development Tools
- **Hibernate** - ORM framework
- **Spring Boot Starter Web** - Web application support
- **Spring Boot Starter Data JPA** - Database operations
- **Spring Boot Starter Test** - Testing framework
- **SpringDoc OpenAPI** - API documentation (Swagger UI)
- **Spring Boot DevTools** - Development utilities

## 🏛️ Architecture & Flow

### Application Structure
```
JavaPortfolio/
├── src/
│   ├── main/
│   │   ├── java/com/portfolio/
│   │   │   ├── controller/          # REST API Controllers
│   │   │   ├── model/              # Entity classes
│   │   │   ├── repository/         # Data access layer
│   │   │   ├── service/            # Business logic
│   │   │   └── JavaPortfolioApplication.java
│   │   └── resources/
│   │       ├── static/             # Static assets (HTML, CSS, JS, Images)
│   │       └── application.properties
│   └── test/                       # Test files
├── pom.xml                         # Maven configuration
└── README.md                       # This file
```

### Data Flow
1. **Frontend Request** → User interacts with portfolio pages
2. **API Call** → JavaScript makes AJAX calls to backend endpoints
3. **Controller** → Spring Boot controllers handle HTTP requests
4. **Service Layer** → Business logic processing
5. **Repository** → Data access and database operations
6. **Database** → H2 in-memory database stores data
7. **Response** → JSON data returned to frontend
8. **UI Update** → Frontend updates with received data

### Key Features
- **Single Page Application (SPA)** - Smooth navigation without page reloads
- **Responsive Design** - Works on desktop, tablet, and mobile
- **Dark/Light Theme Toggle** - User preference for theme
- **Dynamic Content Loading** - Projects and profile data loaded from backend
- **Contact Form** - Functional contact submission with email service
- **Professional Styling** - Modern, clean design with animations

## 🔌 Backend API Endpoints

### Base URL: `http://localhost:8080`

### API Documentation
- **Swagger UI**: `http://localhost:8080/swagger-ui.html` - Interactive API documentation
- **OpenAPI JSON**: `http://localhost:8080/api-docs` - Raw API specification
- **Detailed Documentation**: See [API_DOCUMENTATION.md](API_DOCUMENTATION.md) for comprehensive endpoint documentation

### 1. Profile Endpoints

#### GET `/api/profile`
Retrieves the developer's profile information.

**Response:**
```json
{
  "id": 1,
  "name": "Hemanth Kumar Kodhati",
  "title": "Senior Java Developer",
  "bio": "Experienced Senior Java Developer with over 7 years of expertise...",
  "email": "hemanth0070kodhati@gmail.com",
  "phone": "+1 (812) 223-2110",
  "location": "Plano, TX",
  "yearsOfExperience": 7,
  "linkedinUrl": "https://www.linkedin.com/in/hemanth-kumar-k-java7",
  "githubUrl": "https://github.com/hkodhati"
}
```

### 2. Projects Endpoints

#### GET `/api/projects`
Retrieves all projects with pagination and sorting.

**Query Parameters:**
- `page` (optional): Page number (default: 0)
- `size` (optional): Page size (default: 10)
- `sort` (optional): Sort field (default: "completionDate,desc")

**Response:**
```json
[
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
]
```

#### GET `/api/projects/{id}`
Retrieves a specific project by ID.

**Path Parameters:**
- `id`: Project ID

**Response:** Same as individual project object above.

#### POST `/api/projects`
Creates a new project (Admin only).

**Request Body:**
```json
{
  "title": "Project Title",
  "description": "Project description",
  "fullDescription": "Detailed description",
  "technologies": "Tech1, Tech2, Tech3",
  "category": "Category",
  "completionDate": "2024-12-01",
  "experienceDuration": "1 year",
  "githubUrl": "https://github.com/example",
  "liveUrl": "https://example.com",
  "imageUrl": "/images/project-image.png",
  "jobTitle": "Developer"
}
```

### 3. Contact Endpoints

#### POST `/api/contacts`
Submits a contact form message.

**Request Body:**
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "subject": "Job Opportunity",
  "message": "I would like to discuss a potential opportunity..."
}
```

**Response:**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john@example.com",
  "subject": "Job Opportunity",
  "message": "I would like to discuss a potential opportunity...",
  "createdAt": "2024-07-06T23:16:25.000Z",
  "read": false
}
```

#### GET `/api/contacts`
Retrieves all contact messages (Admin only).

**Response:**
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com",
    "subject": "Job Opportunity",
    "message": "Message content...",
    "createdAt": "2024-07-06T23:16:25.000Z",
    "read": false
  }
]
```

#### PUT `/api/contacts/{id}/read`
Marks a contact message as read (Admin only).

**Path Parameters:**
- `id`: Contact message ID

**Response:** Updated contact object.

## 📊 Database Schema

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

## 🔧 Configuration

### Application Properties
```properties
# Server Configuration
server.port=8080

# Database Configuration
spring.datasource.url=jdbc:h2:mem:portfoliodb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true

# H2 Console (Development)
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Static Resources
spring.web.resources.static-locations=classpath:/static/
```

### Environment Variables
- `PORT` - Server port (default: 8080)
- `SPRING_PROFILES_ACTIVE` - Active profile (dev/prod)

## 🧪 Testing

### Running Tests
```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=ProjectControllerTest

# Run with coverage
mvn test jacoco:report
```

### Test Structure
```
src/test/java/com/portfolio/
├── controller/          # Controller tests
├── service/            # Service layer tests
├── repository/         # Repository tests
└── integration/        # Integration tests
```

## 🚀 Deployment

### Local Development
```bash
mvn spring-boot:run
```

### Production Build
```bash
# Create JAR file
mvn clean package

# Run JAR file
java -jar target/JavaPortfolio-1.0.0.jar
```

### Docker Deployment
```dockerfile
FROM openjdk:17-jdk-slim
COPY target/JavaPortfolio-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

## 📱 Features

### Portfolio Sections
1. **Home** - Hero section with introduction and call-to-action
2. **About** - Professional profile, skills, and experience
3. **Projects** - Showcase of technical projects with details
4. **Contact** - Contact form and professional links

### Interactive Features
- **Theme Toggle** - Switch between light and dark themes
- **Responsive Navigation** - Mobile-friendly navigation menu
- **Project Details Modal** - Detailed project information popup
- **Contact Form** - Functional contact submission
- **Smooth Animations** - CSS transitions and animations

### Professional Elements
- **Company Logos** - Project-specific company branding
- **Technology Tags** - Colorful technology skill indicators
- **Professional Styling** - Clean, modern design
- **SEO Optimized** - Meta tags and semantic HTML

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Support

For support or questions:
- Email: hemanth0070kodhati@gmail.com
- LinkedIn: [Hemanth Kumar Kodhati](https://www.linkedin.com/in/hemanth-kumar-k-java7)
- GitHub: [hkodhati](https://github.com/hkodhati)

---

**Built with ❤️ using Spring Boot and modern web technologies** 