# CRUD_SpringBootApp: Technical Design Overview

## :sparkles: Introduction
**CRUD_demo** is a web application built to showcase fundamental CRUD (Create, Read, Update, Delete) operations. It allows users to interact with an H2 database to manage entries — from creating new records, reading existing ones, to updating or deleting them. The app is developed with **Java**, **Spring Boot**, **jQuery**, and **H2**, following the **Model-View-Controller (MVC)** architectural pattern to ensure separation of concerns and maintainability.

For a deeper understanding of the system's object-oriented design, refer to the project’s Javadocs.

---

## :building_construction: System Architecture
CRUD_demo is structured with a **client-server** architecture:

- **Client-side**: Built with **jQuery** for a dynamic user interface and smooth interactions.
- **Server-side**: Powered by **Java** and **Spring Boot**, which handle the core business logic and data persistence.
- **Database**: Uses an **H2 in-memory database** for efficient data storage and retrieval.

---

## :card_file_box: Database Design
The application's H2 database consists of a single table for storing individual records. The schema is defined as follows:

```sql
CREATE TABLE Person (
  ID INT PRIMARY KEY AUTO_INCREMENT,
  firstName VARCHAR(255),
  lastName VARCHAR(255),
);

```
## :gear: System Components
Client-Side Components
The client-side is built using jQuery and Thymeleaf templates. Key components include:

Entry Form: A form that lets users add new records by entering their details.
Entry List: A table displaying all entries, with options to view, edit, or delete each entry.
Server-Side Components
The server-side is implemented with Java and Spring Boot, with the following core components:

Controller: Manages HTTP requests and routes them to the appropriate service actions (view, create, update, delete).
Service: Implements the business logic and coordinates CRUD operations between the controller and repository.
Repository: Provides an interface for interacting with the H2 database, abstracting the underlying data access logic.
Data Persistence
The application uses Spring Data JPA to manage data persistence with the H2 in-memory database. The repository layer abstracts the database queries, enabling the service layer to perform CRUD operations seamlessly.

## :zap: User Interface Flow
Here’s the typical user flow within the application:

Access: The user navigates to the web application in a browser.
View Entries: The user is presented with a list of stored entries.
Add New Entry: The user fills out the Entry Form to submit a new record, which is saved in the database.
Edit Existing Entry: The user selects an entry from the list, edits the details, and submits changes, which are updated in the database.
Delete Entry: The user deletes an entry by clicking the delete button next to it, removing it from the database.
:package: Containerization and Deployment
CRUD_demo is containerized with Docker, ensuring a consistent runtime environment across both development and production. The application is deployed to the cloud via Render.com, with an automated bash curl script in the Dockerfile that periodically pings the app, preventing it from being spun down due to inactivity.

## :trophy: Conclusion
The CRUD_demo web application serves as a simple yet effective demonstration of CRUD operations using Java, Spring Boot, jQuery, and H2. It provides an easy-to-understand approach to building, containerizing, and deploying CRUD applications. The use of Docker and cloud deployment via Render ensures the application operates consistently across different environments, making it accessible to users globally.

## :computer: Technologies Used
Java
Spring Boot
jQuery
H2 Database
Docker
Render.com (for cloud deployment)
Spring Data JPA
## :bulb: Contributing
We welcome contributions! Please fork the repository, make your changes, and submit a pull request. For any questions or suggestions, feel free to open an issue.

:link: Links
GitHub Repository
Project Documentation (Javadocs)
## :star: Feel free to star this project if you find it useful!
