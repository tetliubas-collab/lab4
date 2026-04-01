
[![CI/CD Pipeline](https://github.com/tetliubas-collab/lab4/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/tetliubas-collab/lab4/actions/workflows/ci-cd.yml)


## ✨ Функціонал

- ➕ Додавання
- ➖ Віднімання
- ✖️ Множення
- ➗ Ділення (з обробкою ділення на нуль)
- √ Квадратний корінь
- ^ Піднесення до степеня

## 🚀 Запуск локально

```bash
# Збірка та тести
mvn clean verify

# Запуск JAR
java -jar target/calculator-java-1.0-SNAPSHOT.jar
```

## 🔄 CI/CD Pipeline

При кожному `push` або `pull_request` у гілки `main`/`develop` автоматично:

1. Встановлюється Java 17 (Temurin)
2. Збирається проект через Maven
3. Запускаються всі JUnit 5 тести
4. Публікуються результати тестів як артефакт
5. Зібраний JAR зберігається як артефакт збірки

## 🧪 Тести

Проект містить **14 юніт-тестів** для всіх операцій калькулятора.

```
[INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0
```

## 📁 Структура проекту

```
CALCULATOR_JAVA/
├── .github/
│   └── workflows/
│       └── ci-cd.yml          ← Конфігурація CI/CD
├── src/
│   ├── main/java/com/calculator/
│   │   ├── Calculator.java     ← Логіка калькулятора
│   │   └── Main.java           ← Точка входу
│   └── test/java/com/calculator/
│       └── CalculatorTest.java ← JUnit 5 тести
├── pom.xml                     ← Maven конфігурація
└── README.md
```
