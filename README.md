# Spring Dependency Injection Example – Restaurant Menu

This project demonstrates how to use **Spring Framework annotations** like `@Autowired` and `@Qualifier` for **Dependency Injection (DI)**.  
It is a simple restaurant application where multiple menu types (Chinese, Indian, Italian) are injected into a `Restarent` class.

## 📂 Project Structure

com.example.auto1
├── Imenu.java
├── Chinis.java
├── Indian.java
├── Italian.java
└── Restarent.java

## ⚙️ Features
- Demonstrates **Constructor Injection** using `@Qualifier`
- Demonstrates **Field Injection** using `@Autowired`
- Displays multiple menus with `itemAvl()` method

## 🛠️ Technologies Used
- Java 17+
- Spring Framework (Core / Context)
- Eclipse IDE


## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Prashantrao497/your-repo-name.git
Open in Eclipse (or any IDE with Spring support).

Run the main class (e.g., App.java or the configuration runner).

You should see restaurant menu items printed in the console:

Chinese Menu Items...
Indian Menu Items...
Italian Menu Items...

📖 Learning Points

@Component → Marks a class as a Spring bean.

@Autowired → Lets Spring inject dependencies automatically.

@Qualifier → Resolves conflicts when multiple beans implement the same interface.

# Spring MVC Demo
This is a simple Spring MVC project that demonstrates the basic flow of a web application built with Spring.
The application includes:

A home page with navigation links

A controller that handles requests

JSP views to display data

A basic form to collect input

spring-mvc-demo/
│
├── src/main/java
│   └── com.example.controller
│       └── HomeController.java
│
├── src/main/webapp
│   ├── WEB-INF
│   │   ├── views
│   │   │   ├── index.jsp
│   │   │   ├── greet.jsp
│   │   │   
│   │   └── web.xml
│   └── resources
│
├── pom.xml
└── README.md

🔹 Flow of Spring MVC

Client Request

A user clicks a link or submits a form (/greet, /welcome).

DispatcherServlet

The request is first received by Spring’s DispatcherServlet.

Defined in web.xml, it acts as the front controller.

Handler Mapping

Spring checks which @Controller and method should handle the request.

Controller

The controller method executes business logic (or calls the service layer).

It returns a view name (e.g., "greet").

View Resolver

Spring’s InternalResourceViewResolver maps the view name to a JSP file (e.g., greet.jsp).

View (JSP)

The JSP is rendered with data (if any) and the response is sent back to the browser.




























👨‍💻 Author

Prashant Rao
Bachelor of Engineering – Computer Science & Engineering
