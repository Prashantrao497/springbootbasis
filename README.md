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

👨‍💻 Author

Prashant Rao
Bachelor of Engineering – Computer Science & Engineering
