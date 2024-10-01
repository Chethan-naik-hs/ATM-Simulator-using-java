import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMSimulator extends JFrame implements ActionListener {

    // Variables
    private double balance = 1000.0;  // initial balance
    private JLabel balanceLabel, amountLabel, messageLabel;
    private JTextField amountField;
    private JButton checkBalanceButton, depositButton, withdrawButton, exitButton;

    public ATMSimulator() {
        // Set up the frame
        setTitle("ATM Simulator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Components
        balanceLabel = new JLabel("Balance: $0.00");
        amountLabel = new JLabel("Enter Amount: ");
        messageLabel = new JLabel("");
        amountField = new JTextField();

        checkBalanceButton = new JButton("Check Balance");
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        exitButton = new JButton("Exit");

        // Adding components to frame
        add(balanceLabel);
        add(new JLabel());  // Empty space
        add(amountLabel);
        add(amountField);
        add(checkBalanceButton);
        add(depositButton);
        add(withdrawButton);
        add(exitButton);
        add(messageLabel);

        // Add action listeners
        checkBalanceButton.addActionListener(this);
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        exitButton.addActionListener(this);

        // Initial Balance Display
        updateBalanceDisplay();

        // Set visible
        setVisible(true);
    }

    // Update balance label
    private void updateBalanceDisplay() {
        balanceLabel.setText("Balance: $" + String.format("%.2f", balance));
    }

    // Handle button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        double amount = 0;

        // Try parsing amount entered by the user, handle invalid input
        try {
            if (!amountField.getText().isEmpty()) {
                amount = Double.parseDouble(amountField.getText());
                if (amount < 0) {
                    throw new NumberFormatException("Amount can't be negative.");
                }
            }
        } catch (NumberFormatException ex) {
            messageLabel.setText("Invalid amount. Please enter a valid number.");
            return;
        }

        // Check which button is pressed
        if (e.getSource() == checkBalanceButton) {
            messageLabel.setText("Balance checked.");
            updateBalanceDisplay();
        } else if (e.getSource() == depositButton) {
            if (amount > 0) {
                balance += amount;
                messageLabel.setText("Deposit successful.");
                updateBalanceDisplay();
                amountField.setText("");
            } else {
                messageLabel.setText("Please enter a valid amount to deposit.");
            }
        } else if (e.getSource() == withdrawButton) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                messageLabel.setText("Withdrawal successful.");
                updateBalanceDisplay();
                amountField.setText("");
            } else if (amount > balance) {
                messageLabel.setText("Insufficient balance.");
            } else {
                messageLabel.setText("Please enter a valid amount to withdraw.");
            }
        } else if (e.getSource() == exitButton) {
            System.exit(0);  // Exit the program
        }
    }

    // Main method to run the ATM Simulator
    public static void main(String[] args) {
        new ATMSimulator();
    }
}
