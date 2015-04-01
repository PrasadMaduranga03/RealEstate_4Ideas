package com.household.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
//import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;



public class RealEstate {
	
	
	

	private JFrame frmRealEstate;
	private JTextField textLotNumber;
	private JTextField textFName;
	private JTextField textLName;
	private JTextField textPrice;
	private JTextField textSquareFeet;
	private JTextField textNoOfBedroom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			 	try {
					RealEstate window = new RealEstate();
					window.frmRealEstate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RealEstate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRealEstate = new JFrame();
		frmRealEstate.setTitle("Real Estate Program");
		frmRealEstate.getContentPane().setForeground(new Color(47, 79, 79));
		frmRealEstate.getContentPane().setFont(new Font("Arial", Font.BOLD, 13));
		frmRealEstate.setBounds(100, 100, 443, 527);
		frmRealEstate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRealEstate.getContentPane().setLayout(null);
		
		JLabel lblNexthousedisplay = new JLabel("Next House Display");
		lblNexthousedisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNexthousedisplay.setForeground(new Color(47, 79, 79));
		lblNexthousedisplay.setBounds(10, 11, 287, 31);
		frmRealEstate.getContentPane().add(lblNexthousedisplay);
		
		JLabel lblLotNumber = new JLabel("Lot Number : ");
		lblLotNumber.setForeground(new Color(47, 79, 79));
		lblLotNumber.setFont(new Font("Arial", Font.BOLD, 13));
		lblLotNumber.setBounds(121, 73, 86, 14);
		frmRealEstate.getContentPane().add(lblLotNumber);
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(128, 108, 78, 14);
		frmRealEstate.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name :");
		lblNewLabel_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(128, 143, 78, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_1);
		
		JLabel lblP = new JLabel("Price :");
		lblP.setForeground(new Color(47, 79, 79));
		lblP.setFont(new Font("Arial", Font.BOLD, 13));
		lblP.setBounds(161, 178, 41, 14);
		frmRealEstate.getContentPane().add(lblP);
		
		JLabel lblNewLabel_2 = new JLabel("Square Feet :");
		lblNewLabel_2.setForeground(new Color(47, 79, 79));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(116, 213, 93, 20);
		frmRealEstate.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number Of Bedrooms :");
		lblNewLabel_3.setForeground(new Color(47, 79, 79));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(56, 254, 153, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_3);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Arial", Font.BOLD, 12));
		btnReset.setBounds(10, 306, 197, 50);
		frmRealEstate.getContentPane().add(btnReset);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Arial", Font.BOLD, 12));
		btnNext.setBounds(219, 306, 197, 50);
		frmRealEstate.getContentPane().add(btnNext);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Arial", Font.BOLD, 12));
		btnAdd.setBounds(10, 367, 197, 50);
		frmRealEstate.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Arial", Font.BOLD, 12));
		btnDelete.setBounds(219, 367, 197, 50);
		frmRealEstate.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Arial", Font.BOLD, 12));
		btnClear.setBounds(10, 428, 197, 50);
		frmRealEstate.getContentPane().add(btnClear);
		
		JButton btnFind = new JButton("Find");
		btnFind.setFont(new Font("Arial", Font.BOLD, 12));
		btnFind.setBounds(219, 428, 197, 50);
		frmRealEstate.getContentPane().add(btnFind);
		
		textLotNumber = new JTextField();
		textLotNumber.setBounds(218, 68, 197, 30);
		frmRealEstate.getContentPane().add(textLotNumber);
		textLotNumber.setColumns(10);
		
		textFName = new JTextField();
		textFName.setBounds(218, 104, 197, 30);
		frmRealEstate.getContentPane().add(textFName);
		textFName.setColumns(10);
		
		textLName = new JTextField();
		textLName.setBounds(218, 141, 197, 30);
		frmRealEstate.getContentPane().add(textLName);
		textLName.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(218, 178, 197, 30);
		frmRealEstate.getContentPane().add(textPrice);
		textPrice.setColumns(10);
		
		textSquareFeet = new JTextField();
		textSquareFeet.setBounds(218, 214, 197, 30);
		frmRealEstate.getContentPane().add(textSquareFeet);
		textSquareFeet.setColumns(10);
		
		textNoOfBedroom = new JTextField();
		textNoOfBedroom.setBounds(218, 252, 197, 30);
		frmRealEstate.getContentPane().add(textNoOfBedroom);
		textNoOfBedroom.setColumns(10);
	}
	
	public void clearTextFields(){
		textFName.setText("");
		textLName.setText("");
		textLotNumber.setText("");
		textNoOfBedroom.setText("");
		textPrice.setText("");
		textSquareFeet.setText("");
	}
}
