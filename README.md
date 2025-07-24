# Hotel Management System (Java)

A simple **console-based hotel management application** built in Java.  
This project demonstrates basic operations like **room booking, availability checks, checkout, and payment handling** using arrays and user input.

---

## 🚀 Features
- **Room Booking:** Book a room on a selected floor and room number.
- **Check Availability:** Check if a particular room is available.
- **Checkout:** Mark a booked room as available after checkout.
- **Payments:** Supports multiple payment methods (UPI, Cash, Debit Card) with applicable charges.
- **3 Floors and 12 Rooms:** The hotel is modeled with 3 floors `[0, 1, 2]` and 4 rooms `[0, 1, 2, 3]` per floor.

---

## 🛠️ Technologies Used
- **Java**
- **2D Arrays** for room management.
- **Switch-case and Loops** for user interaction.
- **Scanner** for taking input.

---

## 📂 Project Structure
HotelManagement.java

- **`roomBook()`** – Books a room if it is available.  
- **`availability()`** – Checks if a room is available.  
- **`checkout()`** – Marks the room as available after checkout.  
- **`main()`** – Displays the menu and takes user input.

---

## 💻 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/praphull-verma/HotelManagement.git
Navigate to the project folder:

cd hotel-management
Compile the Java file:

javac HotelManagement.java
Run the program:

java HotelManagement
📖 Example Usage
Menu Options:

Choose an option:
1. Room Booking
2. Check Availability
3. Checkout
4. Payments
5. Quit
Room Booking Example:

Please Enter the floor number for room Booking [0-1-2]: 1

Please Enter the room number for room Booking [0-1-2-3]: 2

Room booked successfully on floor 1, room number 2.

📌 Future Improvements
Add customer details (name, contact, etc.).

Implement database support for storing booking records.

Add GUI using JavaFX or Swing.

🤝 Contributing
Contributions are welcome!
Feel free to fork the repository and submit a pull request with your improvements.
