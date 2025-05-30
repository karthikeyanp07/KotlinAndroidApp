# Users Viewer App 🚀

An Android application built using modern development tools and architecture to fetch and display a list of users from the public API:
👉 https://api.github.com/users

---

## 🧱 Tech Stack

| Layer        | Technology                                  |
|--------------|---------------------------------------------|
| Architecture | MVVM + Clean Architecture                   |
| Language     | Kotlin                                       |
| UI           | RecyclerView                                |
| Network      | Retrofit + Gson                             |
| Async        | Kotlin Coroutines + Flow                    |
| DI           | Hilt (Dagger-Hilt)                          |
| Others       | ViewModel, StateFlow, LiveData, Glide       |

---

## 📸 Screenshots

<p float="left">
  <img src="assets/images/image1.png" alt="User ListView Screenshot 1" width="300" />
</p>

---

## 🧑‍💻 Features

- Fetch and display users
- Clean and scalable MVVM architecture
- Flow-based state handling
- Hilt for dependency injection
- Modular code using Clean Architecture principles

---

## 📦 Dependencies

- **Retrofit** for HTTP networking
- **Hilt** for Dependency Injection
- **Kotlin Coroutines + Flow** for asynchronous streams
- **ViewModel + LiveData** for UI logic
- **Glide** for image loading
- **RecyclerView** for lists

---

## 🛠️ Architecture Overview

```text
├── data
│   ├── api           # Retrofit service interface
│   ├── model         # DTOs (API models)
│   ├── repository    # Repository implementation
├── domain
│   ├── model         # Domain models
│   ├── repository    # Abstract repository interface
│   ├── usecase       # Business logic
├── presentation
│   ├── view          # Activities, Adapters, UI components
│   ├── viewmodel     # ViewModel classes
├── di                # Hilt Modules
└── utils             # Utility classes and helpers
