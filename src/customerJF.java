

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;

public class customerJF extends JFrame {

	private JPanel contentPane;
	int customerId;
	String firstName;
	String lastName;
	String address;
	int phoneNumber;
	int creditCardNumber;
	double CurrentBalance;
	//customerJF currentCustomer; 
	private JTextField txtId;
	private JTextField txtLast;
	private JTextField txtFirst;
	private JTextField txtAddress;
	private JTextField txtPhone;
	private JTextField txtBalance;
	public CustomerInfo currentCustomer; 
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerJF frame = new customerJF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
		
	}

	/**
	 * Create the frame.
	 */
	public customerJF() {
		
		
		
		super("Customer Information"); 
		setFont(new Font("Cambria Math", Font.PLAIN, 17));
		setForeground(Color.WHITE);
		setType(Type.UTILITY);
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setSize(410, 375); 
		
	
		JPanel labelPan = new JPanel(); 
		labelPan.setBackground(Color.WHITE);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		labelPan.setLayout(null);
		
		
		
		JLabel customerId_1 = new JLabel("Customer ID");
		customerId_1.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		customerId_1.setBounds(0, 13, 92, 16);
		labelPan.add(customerId_1);
		txtId = new JTextField();
		//txtId.setText("customerId");
		txtId.setText(Integer.toString(currentCustomer.getCcid())); 
		txtId.setBounds(127, 10, 116, 22);
		labelPan.add(txtId);
		txtId.setColumns(10);
		
			
		
		JLabel lastName_1 = new JLabel("Last Name");
		lastName_1.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		lastName_1.setBounds(0, 42, 92, 16);
		labelPan.add(lastName_1);
		txtLast = new JTextField();
		//txtLast.setText("lastName");
		txtLast.setText(currentCustomer.getLastName());
		txtLast.setBounds(127, 45, 116, 22);
		labelPan.add(txtLast);
		txtLast.setColumns(10);
		
		
		
		JLabel firstName_1 = new JLabel("First Name");
		firstName_1.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		firstName_1.setBounds(0, 77, 92, 16);
		labelPan.add(firstName_1); 
		txtFirst = new JTextField();
		//txtFirst.setText("firstName");
		txtFirst.setText(currentCustomer.getFirstName());
		txtFirst.setBounds(127, 74, 116, 22);
		labelPan.add(txtFirst);
		txtFirst.setColumns(10);
		
		
		
		
		JLabel address_1 = new JLabel("Address");
		address_1.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		address_1.setBounds(0, 106, 67, 16);
		labelPan.add(address_1);
		txtAddress = new JTextField();
		//txtAddress.setText("Addie");
		txtAddress.setText(currentCustomer.getAddress());
		txtAddress.setBounds(127, 109, 116, 22);
		labelPan.add(txtAddress);
		txtAddress.setColumns(10);
		
		contentPane.add(labelPan);
		
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		lblPhone.setBounds(0, 155, 56, 16);
		labelPan.add(lblPhone);
		txtPhone = new JTextField();
		//txtPhone.setText("Phone");
		txtPhone.setText(currentCustomer.getPhoneNumber());
		txtPhone.setBounds(127, 152, 116, 22);
		labelPan.add(txtPhone);
		txtPhone.setColumns(10);
		

		
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		lblBalance.setBounds(0, 229, 56, 16);
		labelPan.add(lblBalance);
		txtBalance = new JTextField();
		//txtBalance.setText("balance");
		txtBalance.setText(Double.toString(currentCustomer.getCreditCardBalance())); 
		txtBalance.setBounds(127, 226, 116, 22);
		labelPan.add(txtBalance);
		txtBalance.setColumns(10);
		
		
		
		
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		lblCardNumber.setBounds(0, 196, 102, 16);
		labelPan.add(lblCardNumber);
		textField = new JTextField();
		//textField.setText("card number");
		textField.setText(Double.toString(currentCustomer.getCreditCardNumber()));
		textField.setBounds(127, 193, 116, 22);
		labelPan.add(textField);
		textField.setColumns(10);
		
		
		
		
		
		
	
		
	
		
	
	}
}
