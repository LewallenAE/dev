# 🧠 Anthony Lewallen – Developer Portfolio

## 🚀 Check out **[Eugenius – Full-Stack AI Chat UI](https://react-llm-chat.vercel.app/)**
[![Live Demo – Vercel](https://img.shields.io/badge/Live%20Demo-Eugenius-blueviolet?logo=vercel&style=for-the-badge)](https://react-llm-chat.vercel.app/)  
*(React + Express + OpenAI API | Markdown rendering, dark/light mode, animated loaders, chat history)*

---

## 💼 About This Portfolio

This repository contains the source code and structure for my portfolio site, showcasing full-stack and AI-focused projects built with JavaScript, Java, Python, and LLMs. It's deployed via GitHub Pages and acts as a central hub for my work.

---

## 🛠️ Tech Stack

- **Languages**: Java, Python, JavaScript
- **Frontend**: React, Vite, TypeScript, Tailwind CSS  
- **Backend**: Node.js, Express  
- **AI/LLM**: OpenAI API  
- **Java Projects**: OOP, JavaFX, interfaces, abstract classes  
- **Deployment**: GitHub Pages, Vercel, Render (Back-End)

---

## 📂 Featured Projects

💬 **[Eugenius](https://github.com/LewallenAE/react-llm-chat)** – Full-stack LLM chatbot with markdown rendering, theme toggle, animated loaders, and persistent chat

🐙 **[GitFolio](https://github.com/LewallenAE/gitfolio)** – GitHub-powered portfolio generator with live repo cards and commit stats  
*Try entering `LewallenAE` or `torvalds` in the search bar!*

📚 **[Library CLI](https://github.com/LewallenAE/Portfolio/tree/main/Desktop/Portfolio/src/Library)** – Command-line Java library manager with search, sort, and file-based persistence

🔎 **[Library GUI + SQL](https://github.com/LewallenAE/Portfolio/tree/main/Desktop/Portfolio/src/LibraryGUI)** – Full-stack JavaFX desktop application for managing a library using a SQL database backend

🐯 **[Zoo Project](https://github.com/LewallenAE/Portfolio/tree/main/Desktop/Portfolio/src/Zoo)** – OOP-based animal simulation featuring interfaces and polymorphism

🦁 **[Zoo Upgrade](https://github.com/LewallenAE/Portfolio/tree/main/Desktop/Portfolio/src/Zoo_Upgrade)** – Refactored version with serialization, file I/O, and persistent animal states

---

## 🧰 Getting Started

To run these projects locally:

1. Clone this repository  
2. Open it in IntelliJ, Eclipse, or any Java IDE  
3. Install Maven dependencies (via `pom.xml`)  
4. Run `Main.java` in any project to launch the app  
   - For GUI apps, ensure JavaFX is installed and properly configured  
   - For CLI apps, run in terminal/console view

---

## 📁 Project Folder Structure

```
/Portfolio/
├── .idea/                        # IntelliJ project config
├── .gitignore
├── Portfolio.iml                # IntelliJ module
├── pom.xml                      # Maven build file
├── target/
│   └── classes/                 # Compiled .class files
└── src/
    ├── Library/                 # CLI-based Java app
    │   ├── Book.java
    │   ├── Library.java
    │   ├── LibraryMenu.java
    │   ├── LibrarySerializer.java
    │   ├── Main.java
    │   ├── SortUtil.java
    │   └── UserInteractionLogger.java
    │
    ├── resources/
    │   ├── data/
    │   │   ├── books.txt
    │   │   ├── library.ser
    │   │   └── user_interactions.log
    │   └── test/
    │       └── test_books.txt
    │
    ├── LibraryGUI/
    │   └── main/
    │       ├── java/
    │       │   ├── module-info.java
    │       │   └── com/
    │       │       └── librarygui/
    │       │           ├── Book.java
    │       │           └── LibraryUI.java
    │       └── resources/
    │           ├── primary.fxml
    │           └── secondary.fxml
    │
    ├── Zoo/
    │   ├── Animal.java
    │   ├── Dolphin.java
    │   ├── Eat.java
    │   ├── Main.java
    │   ├── Penguin.java
    │   ├── Swim.java
    │   ├── Tiger.java
    │   └── Walk.java
    │
    └── Zoo_Upgrade/
        ├── Animal.java
        ├── Dolphin.java
        ├── Eat.java
        ├── Main.java
        ├── Penguin.java
        ├── Swim.java
        ├── Tiger.java
        └── Walk.java
```

---

## 👋 Contact

- 🔗 [LinkedIn](https://linkedin.com/in/anthony-lewallen)  
- 💻 [GitHub](https://github.com/LewallenAE)

---

> “I don't just build projects—I engineer experiences.” 🚀
