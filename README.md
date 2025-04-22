# Programming 1A - POE Part 1  
## Registration and Login System (Java)

### 👨‍🎓 Student Details:
- **Name:** Riaad Hercules  
- **Student Number:** ST10258492  
- **Module:** Programming 1A  
- **Module Code:** PROG5121A

---

### 📌 Project Description:
This Java-based application serves as a registration and login system for a chat application. It was developed for Part 1 of the Programming 1A POE with a focus on:

- Object-Oriented Programming (OOP)
- Conditional statements and input validation
- Regex for password and phone number validation
- Unit testing using JUnit

---

### 💡 Key Features Implemented:

#### ✅ Username Validation
- Must contain an underscore (`_`)
- Must be 5 characters or less

#### ✅ Password Complexity Validation
Validates the password using regex to ensure it:
- Has at least 8 characters  
- Contains at least one capital letter  
- Contains at least one number  
- Contains at least one special character  

#### ✅ South African Cell Phone Number Validation
- Checks if the number starts with `+27`  
- Ensures it contains exactly 9 digits after `+27`  

#### ✅ Registration Logic
- Combines all validation checks  
- Returns custom messages for each validation failure or success  

#### ✅ Login Functionality
- Matches the entered username and password with stored credentials  
- Returns a welcome message or an error depending on login result  

---

### 🧪 Unit Testing (JUnit 5)
The following functionality was tested using JUnit:

- `checkUserName()` — valid and invalid username formats  
- `checkPasswordComplexity()` — strong vs weak passwords  
- `checkCellPhoneNumber()` — valid vs invalid phone formats  
- `loginUser()` — successful and failed logins  
- `returnLoginStatus()` — returns appropriate messages  

Assertions used: `assertTrue`, `assertFalse`, and `assertEquals`.

---

### 🤖 AI Use & Attribution
Portions of the regex used for password and phone number validation were generated with assistance from ChatGPT. Guidance on message formatting and method structure was also refined with AI support.

> OpenAI. (2025). *How to Cite ChatGPT*. Retrieved from https://gpttools.ai/blog/how-to-cite-chatgpt

---

### 📚 References

- W3Schools. (2024). *Java Tutorial*. https://www.w3schools.com/java/  
- GeeksforGeeks. (2024). *Java Programming Language*. https://www.geeksforgeeks.org/java/  
- Baeldung. (2024). *Java Regex Guide*. https://www.baeldung.com/java-regex  
- Baeldung. (2024). *Guide to JUnit 5*. https://www.baeldung.com/junit-5  
- Oracle. (2024). *Java SE 8 API Documentation*. https://docs.oracle.com/javase/8/docs/api/  
- Regex101. (2024). *Regex Debugger and Tester*. https://regex101.com/  
 

---

### 🔐 Repository Notes:
This repository is part of the official submission via GitHub Classroom for The IIE. It contains all required `.java` source files and unit tests.

---

