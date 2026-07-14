# Design Patterns in Java

A collection of Java implementations and exercises covering core object-oriented programming
principles and the Gang of Four (GoF) design patterns. This repository is organized as a
learning journal, progressing from OOP fundamentals through creational, structural, and
behavioral design patterns.

## Contents

### `CodeSignal DP Course/`
Exercises completed as part of a CodeSignal design patterns course, grouped by topic:

- **OOP fundamentals** — `abstraction`, `encapsulation`, `inheritance`, `polymorphism`, `enumeration`
- **Creational patterns** — Singleton, Factory, Abstract Factory, Builder, Prototype
- **Structural patterns** — Adapter, Bridge, Composite, Decorator, Facade
- **Behavioral patterns** — Command, Observer, State, Template Method
- **Applied mini-projects** — multi-pattern exercises such as a banking system,
  a smart home system, a chat application, and a web application, each showing
  patterns used together to solve a larger design problem

### `CreationalDesignPattern/`
Standalone creational pattern examples:

- **Factory Design Pattern** — a `Payment` factory producing `CreditCard`, `Paypal`,
  and `BankTransfer` implementations
- **Prototype Design Pattern** — cloning `GameCharacter`/`Warrior` objects via a
  `GameClient`
- **Singleton Design Pattern** — shared single-instance modules such as
  `SystemLogger`, `MainSite`, `OnlineExamModule`, and `CourseManagementModule`

### `FactoryDP3/`
A notification system example demonstrating the Factory Method pattern, producing
`SMSNotification` and `EmailNotification` instances through a `NotificationFactory`.

### `ExceptionHandling/`
Small Java programs demonstrating exception handling: input validation, file reading,
division safety, and custom checks.

### `practice_problem/`
General OOP practice problems (e.g. `bankaccount`, `calculator`, `employee`, `student`,
`rectangle`) alongside dedicated `access_modifiers` and `interfacef` (interfaces)
sub-folders.

## Getting Started

### Prerequisites
- [JDK 8+](https://www.oracle.com/java/technologies/downloads/) installed and on your `PATH`

### Running an example
Each example is self-contained in its own folder with a `Main.java` (or similarly named
entry point). To compile and run one:

```bash
cd "CreationalDesignPattern/FactoryDesignPattern"
javac *.java
java MainApp
```

For examples under `CodeSignal DP Course/`, the same pattern applies — `cd` into the
relevant folder, compile all `.java` files, and run the file containing `main`.

## Purpose

This repository serves as a personal reference and practice space for understanding
how classic design patterns are structured and applied in real-world-style Java code.
Contributions aren't expected, but feel free to fork it for your own learning.

## License

No license specified. All rights reserved by the repository owner unless stated otherwise.
