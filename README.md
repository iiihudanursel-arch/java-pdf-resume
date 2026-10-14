# Java PDF Resume Generator

## About the Project

Java PDF Resume Generator is a simple application developed using the Java programming language. The main purpose of this project is to create a professional resume in PDF format.

The application collects personal information, contact details, education, work experience, technical skills, and language information. It uses this information to generate a structured PDF resume.

This project was developed as part of a Java programming assignment.

## Features

- Generate a resume in PDF format.
- Add personal information and contact details.
- Include education information.
- Display work experience.
- List technical skills and languages.
- Add a profile photo to the resume.
- Organize resume sections with headings and readable text.

## Technologies Used

- **Java 17** — Programming language
- **Apache Maven** — Project management and build tool
- **OpenPDF** — PDF generation library
- **Visual Studio Code** — Development environment

## Project Structure

```text
JavaPDF/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            └── resume/
                ├── Main.java
                ├── PdfGenerator.java
                ├── Resume.java
                ├── Education.java
                └── WorkExperience.java
```

## Requirements

To run this project, you need:

- Java Development Kit (JDK) 17 or later
- Apache Maven
- Visual Studio Code or another Java-compatible IDE

## How to Run

1. Clone or download this repository.
2. Open the project folder in Visual Studio Code.
3. Open the terminal in the project directory.
4. Compile the project using the following command:

```bash
mvn clean compile
```

5. Run the application using:

```bash
mvn exec:java "-Dexec.mainClass=resume.Main"
```

6. After the application runs successfully, check the output location specified in the source code for the generated PDF file.

## Output

The application generates a resume in PDF format containing the information provided in the Java source code.

The generated PDF can be opened with any PDF reader.

## Learning Objectives

This project provides practice with:

- Object-oriented programming in Java
- Creating and using classes and objects
- Organizing Java source files into packages
- Managing dependencies with Maven
- Handling files and directories
- Generating PDF documents with a Java library

## Author

**[Friend's Full Name]**

Software Engineering Student

## License

This project was created for educational purposes.
