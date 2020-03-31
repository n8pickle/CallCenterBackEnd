package projectOne;

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

public class customerInfo extends JFrame {

	private JPanel contentPane;
	int customerId;
	String firstName;
	String lastName;
	String address;
	int phoneNumber;
	int creditCardNumber;
	double CurrentBalance;
	customerInfo currentCustomer; 
	private JTextField txtId;
	private JTextField txtLast;
	private JTextField txtFirst;
	private JTextField txtAddress;
	private JTextField txtPhone;
	private JTextField txtBalance;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerInfo frame = new customerInfo();
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
	public customerInfo() {
		
		
		
		super("Customer Information"); 
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		JPanel labelPan = new JPanel(); 
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		labelPan.setLayout(null);
		
		
	
		
		JLabel customerId_1 = new JLabel("Customer ID");
		customerId_1.setBounds(0, 13, 92, 16);
		labelPan.add(customerId_1);
		
		//idText.setText(Integer.toString(currentCustomer.getCustomerId()));
		
		
		JLabel lastName_1 = new JLabel("Last Name");
		lastName_1.setBounds(0, 42, 74, 16);
		labelPan.add(lastName_1);
		//lastText.setText(currentCustomer.getLastName());
		
		JLabel firstName_1 = new JLabel("First Name");
		firstName_1.setBounds(0, 77, 92, 16);
		labelPan.add(firstName_1); 
		
		
		
		JLabel address_1 = new JLabel("Address");
		address_1.setBounds(0, 106, 67, 16);
		labelPan.add(address_1);
		
		contentPane.add(labelPan);
		
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(0, 155, 56, 16);
		labelPan.add(lblPhone);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(0, 199, 56, 16);
		labelPan.add(lblBalance);
		
		txtId = new JTextField();
		txtId.setText("id");
		//txtId.setText(Integer.toString(currentCustomer.getCustomerId())); 
		txtId.setBounds(127, 10, 116, 22);
		labelPan.add(txtId);
		txtId.setColumns(10);
		
		txtLast = new JTextField();
		txtLast.setText("last");
		//txtLast.setText(currentCustomer.getLastName());
		txtLast.setBounds(127, 45, 116, 22);
		labelPan.add(txtLast);
		txtLast.setColumns(10);
		
		txtFirst = new JTextField();
		txtFirst.setText("first");
		//txtFirst.setText(currentCustomer.getFirstName());
		txtFirst.setBounds(127, 74, 116, 22);
		labelPan.add(txtFirst);
		txtFirst.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address");
		//txtAddress.setText(currentCustomer.getAddress());
		txtAddress.setBounds(127, 109, 116, 22);
		labelPan.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone");
		//txtPhone.setText(Integer.toString(currentCustomer.getPhoneNumber()));
		txtPhone.setBounds(127, 152, 116, 22);
		labelPan.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtBalance = new JTextField();
		txtBalance.setText("Account Balance");
	//	txtBalance.setText(Double.toString(currentCustomer.getCurrentBalance())); 
		txtBalance.setBounds(127, 196, 116, 22);
		labelPan.add(txtBalance);
		txtBalance.setColumns(10);
		
		
	
		
	
	}
	
	
	public void getSet()
	{
		
		
		
		
		
		
		
	}

	/**
	 * @return the customerId
	 */
	private int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	private void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the firstName
	 */
	private String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	private String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	private String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	private void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	private int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	private void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the creditCardNumber
	 */
	private int getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	private void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * @return the currentBalance
	 */
	private double getCurrentBalance() {
		return CurrentBalance;
	}

	/**
	 * @param currentBalance the currentBalance to set
	 */
	private void setCurrentBalance(double currentBalance) {
		CurrentBalance = currentBalance;
	}
	
	
}
