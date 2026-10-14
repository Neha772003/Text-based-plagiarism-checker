# text-based plagiarism checker

## 📌 Project Overview

The **text-based plagiarism checker** is a Java console-based mini project that compares two text inputs and identifies similarities between them. It finds common words, unique words, matching sentences, and calculates a word-set similarity percentage.

This project is developed to practice **Object-Oriented Programming (OOP), Exception Handling, and the Java Collection Framework**.

## 🎯 Objectives

- Compare two text inputs.
- Identify common words between texts.
- Find words unique to each text.
- Detect identical sentences.
- Calculate word-set similarity percentage.
- Handle invalid and empty inputs.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **IDE:** IntelliJ IDEA
- **Input Method:** Java Scanner
- **Concepts:** OOP, Exception Handling, Collection Framework

## ✨ Features

1. Compare two text inputs.
2. Display common words.
3. Display unique words in each text.
4. Identify common sentences.
5. Count word frequencies using `HashMap`.
6. Calculate similarity using Jaccard similarity.
7. Handle empty text and invalid menu input.
8. Display a comparison report in the console.

## 📂 Project Structure

```text
TextBasedPlagiarismChecker/
└── src/
    └── main/
        └── java/
            └── com/
                └── Neha7/
                    ├── Main.java
                    ├── TextDocument.java
                    ├── TextComparator.java
                    ├── ComparisonReport.java
                    └── EmptyTextException.java
```

## 📚 Java Concepts Used

### Object-Oriented Programming
- Classes and Objects
- Encapsulation
- Abstraction
- Polymorphism (optional extension)

### Collection Framework
- `ArrayList` — stores words and sentences.
- `HashSet` — identifies common and unique words.
- `HashMap` — counts word frequencies.

### Exception Handling
- `try-catch`
- `NumberFormatException`
- Custom exception: `EmptyTextException`




## 🚀 Future Enhancements

- Support multiline text input.
- Read text directly from files.
- Add phrase-level similarity detection.
- Ignore common stop words such as "the", "is", and "a".
- Implement additional similarity algorithms.
- Export comparison reports to a text file.


