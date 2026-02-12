# 📱 SIM Card Management System (Java)

A console-based Java application that demonstrates **Abstraction and Interfaces** using a real-world SIM card and mobile phone scenario.

The program allows users to insert different network SIM cards (Jio, Airtel, BSNL) into a mobile phone, activate/deactivate them, make calls, and send messages.

---

## 🚀 Features

* 📶 Supports multiple network providers:

  * Jio
  * Airtel
  * BSNL

* 📲 SIM operations:

  * Insert SIM
  * Activate / Deactivate SIM
  * Display generated phone number
  * Show network provider

* ☎️ Mobile operations:

  * Make calls
  * Send text messages
  * Remove SIM

* 🔢 Validates mobile number before calling or messaging

---

## 🧠 Concepts Used

* Java Interfaces
* Abstraction
* Runtime polymorphism
* OOP design principles
* Random number generation
* User input using Scanner

---

## 🛠️ Technologies Used

* Java
* OOP (Object-Oriented Programming)
* Console-based interaction

---

## 📂 Project Structure

```
SimCardManagement/
│
├── SimCard (Interface)
├── Jio (Class)
├── Airtel (Class)
├── BSNL (Class)
├── IMobile (Interface)
├── Iphone16 (Class)
└── SimCardManagement (Main Class)
```

---

## ⚙️ How It Works

1. User selects a network provider.
2. Selected SIM is inserted into the mobile.
3. System activates SIM and generates a random phone number.
4. User can:

   * Make calls
   * Send messages
   * Remove SIM

---

## ▶️ How to Run

1. Open project in Eclipse / IntelliJ / VS Code
2. Compile the program
3. Run `SimCardManagement.java`
4. Follow console instructions

---

## 📌 Sample Flow

```
Choose the Network Provider.
1] JIO
2] BSNL
3] Airtel

Enter your Choice: 1
Sim inserted successfully
SIM Activated !!!
Your new number is 9876543210
Network Provider: Jio

Choose option:
1] Make call
2] Send message
3] Remove sim
```

---

## 💡 Future Enhancements

* Add more mobile brands
* Add recharge functionality
* Call history & message logs
* GUI version using Java Swing / JavaFX

---

## 👨‍💻 Author

Mahesh
B.Sc Computer Science Graduate (2025)
Java & Software Development Enthusiast

---

## ⭐ Contribution

Fork this repository, improve features, and submit a pull request.

---

## 📜 License

This project is for educational and learning purposes.
