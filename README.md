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

## ⚙️ How to Run the Project

1. Install the Java Development Kit (JDK).
2. Open the project in IntelliJ IDEA.
3. Ensure all Java files have the correct package declaration: `package com.Neha7;`.
4. Open `Main.java`.
5. Run the `main()` method.
6. Select **1** to compare two texts.
7. Enter both texts when prompted.
8. View the comparison report in the console.
9. Select **2** to exit.

## 💻 Sample Output

```text
================================
   TEXT-BASED PLAGIARISM CHECKER
================================
1. Compare Two Texts
2. Exit
Enter your choice: 1

Enter Text 1:
Java is a popular programming language.

Enter Text 2:
Java is a powerful programming language.

========== COMPARISON REPORT ==========

Common Words:
- java
- is
- a
- programming
- language

Words Only in Text 1:
- popular

Words Only in Text 2:
- powerful

Common Sentences:
No results found.

Common Word Frequencies:
...

Word-Set Similarity: 71.43%
=======================================
Note: Similarity indicates word overlap,
not proof of plagiarism.
```

*Note: The order of words may vary because `HashSet` does not guarantee a specific iteration order. The similarity percentage is calculated from unique words in both texts.*

## 📐 Similarity Calculation

The project uses the Jaccard similarity formula:

**Similarity = (Common Unique Words / Total Unique Words in Both Texts) × 100**

This percentage measures word overlap between the two texts. It does not establish whether plagiarism has occurred.

## 🚀 Future Enhancements

- Support multiline text input.
- Read text directly from files.
- Add phrase-level similarity detection.
- Ignore common stop words such as "the", "is", and "a".
- Implement additional similarity algorithms.
- Export comparison reports to a text file.



