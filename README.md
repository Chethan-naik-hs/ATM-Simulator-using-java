ATM Simulator using Java
Description:

This project is a simple ATM Simulator built using Java and Swing for the graphical user interface (GUI). The application mimics basic ATM functionalities, allowing users to perform operations such as:

Check Balance: View the current balance in the account.

Deposit: Deposit a specified amount to the account.

Withdraw: Withdraw a specified amount from the account, with validation for sufficient balance.

Exit: Close the application.

The application includes input validation to ensure only valid amounts are processed and prevents actions such as overdrawing from the account or entering non-numeric values.

Features:

Graphical User Interface (GUI): Built using Java Swing, the interface provides an intuitive and interactive way for users to interact with the ATM simulator.
Account Management: Simulates a simple bank account with a starting balance of $1000.00.
Validation: Input validation to ensure users cannot enter negative values, non-numeric inputs, or withdraw more than the available balance.
Simple Backend: Simulates basic banking functionalities (balance checking, deposits, and withdrawals).
Functionalities
Check Balance: Displays the current balance of the account in the GUI.
Deposit Money: Allows the user to enter a positive amount and deposit it to their balance.
Withdraw Money: Allows the user to withdraw a valid amount (less than or equal to the current balance).
Exit Application: The user can exit the program safely by clicking the "Exit" button.


Requirements
Java JDK 8 or higher: Make sure you have the Java Development Kit installed. You can download the latest version from Oracle's website.
Java Swing: Swing is used for the GUI. No additional libraries are required, as Swing is included in the JDK.
How to Run the Application
Clone the repository:

bash
Copy code
git clone https://github.com/Chethan-naik-hs/ATM-Simulator-using-java.git
Navigate to the project directory:

bash
Copy code
cd atm-simulator-java
Compile the Java file:

bash
Copy code
javac ATMSimulator.java
Run the application:

bash
Copy code
java ATMSimulator
After running the above commands, the ATM Simulator GUI will appear, and you can interact with it to check balance, deposit, or withdraw money.

