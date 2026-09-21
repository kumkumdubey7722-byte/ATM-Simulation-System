# ATM Simulation System

## Description

A simple Java-based ATM Simulation System that demonstrates basic ATM operations and Object-Oriented Programming concepts.

## Features

- PIN verification
- Balance checking
- Money withdrawal
- Money deposit
- Session management
- Logout functionality
- Maximum 3 PIN attempts

## Technologies Used

- Java
- Object-Oriented Programming
- Visual Studio Code

## Project Structure

```text
ATM-Simulation-System
│
├── Account.java
├── ATM.java
├── Main.java
└── README.md
```

## How to Run

1. Open the project folder in Visual Studio Code.
2. Open the terminal inside the `ATM-Simulation-System` folder.
3. Compile the Java files:

```bash
javac *.java
```

4. Run the program:

```bash
java Main
```

## Default Login Details

**PIN:** `1234`

**Initial Balance:** `Rs.10000`

> These details are used only for demonstration purposes.

## ATM Operations

The ATM provides the following operations:

1. Check Balance
2. Withdraw Money
3. Deposit Money
4. Logout

## Security

The system provides basic security through PIN verification.

- The user must enter the correct PIN to access the ATM.
- The user gets a maximum of 3 PIN attempts.
- After 3 incorrect attempts, the account is locked.
- ATM operations cannot be performed without successful login.

## Concepts Demonstrated

- Classes and Objects
- Encapsulation
- Constructors
- Methods
- Private Variables
- Conditional Statements
- Loops
- Switch Case
- Exception Handling
- Input Validation
- Boolean Session States
- Session State Management


## Author
Kumkum Dubey
Bsc Computer Science Student

**Kumkum Dubey**

BSc Computer Science Student
