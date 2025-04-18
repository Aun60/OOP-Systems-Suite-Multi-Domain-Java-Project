# OOP Systems Suite – Multi-Domain Java Project

## Overview

This project demonstrates Object-Oriented Programming concepts across multiple real-world domains. Each question represents a distinct system, using inheritance, encapsulation, polymorphism, and abstraction.

---

## 📌 Question 1: Juice Shop Management System

- Implements a class hierarchy for a Juice Shop:
  - Base Class: `Juice`
  - Child Classes: `FruitJuice`, `VegetableJuice`, `MixedJuice`
  - Sub-classes: `CitrusJuice`, `BerryJuice`, `TropicalJuice`, etc.
- Common properties: `price`, `ingredients`, `taste`
- Specialized fields: `season`, `origin`
- `Sale` class handles order details with a global overloaded `sum()` method
- Main menu allows users to create juices and calculate total bill

---

## 📌 Question 2: University Grading & Fee System

- Classes: `Course`, `Student`, `Person`
- Each student enrolls in multiple courses and has attributes such as GPA, payment status, grades
- Tuition and GPA are calculated based on payment
- Grades and GPA hidden if tuition is unpaid
- Input uses student roll number to calculate per-credit hour rate and number of students

---

## 📌 Question 3: Retail Store Automation

- Abstract class: `Product` with abstract methods `getDiscountedPrice()` and `printDetails()`
- Derived Classes: `Book`, `Electronic`, `Clothing`
- Interface: `Customer` with implementation for `Regular` and `VIPCustomer`
- Functionality for purchasing products based on balance and discounts
- `add()` method overloaded to create a new product from two products

---

## 📌 Question 4: Game Object Simulation

- Base class: `GameObject` with constant `Name` initialized to valid student ID
- Derived Classes: `Player`, `Enemy`, `PowerUp` with custom `draw()` methods
- `Game` class contains a dynamic array of `GameObject` objects
- Method `drawAll()` draws all game objects
- `equals()` method in `Player` class compares health of two players

---

## ✍️ Author Info
**Student ID:** XXK-XXXX  
**Name:** Your Full Name  
**Course:** Object-Oriented Programming (OOP)  
**Assignment 2 – Java Implementation**

---

## 💡 Notes

- Followed OOP best practices: clean structure, reusability, and maintainability
- Each question is implemented in a separate `.java` file
- Use of constructors, setters, getters, polymorphism, and overloading included

