package com.household.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
		frmRealEstate.setBounds(100, 100, 490, 593);
		frmRealEstate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRealEstate.getContentPane().setLayout(null);
		
		JLabel lblNexthousedisplay = new JLabel("Next House Display");
		lblNexthousedisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNexthousedisplay.setForeground(new Color(0, 0, 205));
		lblNexthousedisplay.setBounds(10, 11, 287, 31);
		frmRealEstate.getContentPane().add(lblNexthousedisplay);
		
		JLabel lblLotNumber = new JLabel("Lot Number : ");
		lblLotNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLotNumber.setBounds(45, 82, 129, 14);
		frmRealEstate.getContentPane().add(lblLotNumber);
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(45, 118, 108, 14);
		frmRealEstate.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(45, 154, 108, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_1);
		
		JLabel lblP = new JLabel("Price :");
		lblP.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblP.setBounds(45, 188, 165, 14);
		frmRealEstate.getContentPane().add(lblP);
		
		JLabel lblNewLabel_2 = new JLabel("Square Feet :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(45, 213, 108, 20);
		frmRealEstate.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number Of Bedrooms :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(45, 244, 222, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_3);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(10, 306, 200, 50);
		frmRealEstate.getContentPane().add(btnReset);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNext.setBounds(220, 306, 200, 50);
		frmRealEstate.getContentPane().add(btnNext);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdd.setBounds(10, 391, 200, 50);
		frmRealEstate.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBounds(220, 391, 200, 50);
		frmRealEstate.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClear.setBounds(10, 478, 200, 50);
		frmRealEstate.getContentPane().add(btnClear);
		
		JButton btnFind = new JButton("Find");
		btnFind.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFind.setBounds(220, 478, 200, 50);
		frmRealEstate.getContentPane().add(btnFind);
		
		textLotNumber = new JTextField();
		textLotNumber.setBounds(255, 82, 165, 20);
		frmRealEstate.getContentPane().add(textLotNumber);
		textLotNumber.setColumns(10);
		
		textFName = new JTextField();
		textFName.setBounds(255, 118, 165, 20);
		frmRealEstate.getContentPane().add(textFName);
		textFName.setColumns(10);
		
		textLName = new JTextField();
		textLName.setBounds(255, 148, 165, 20);
		frmRealEstate.getContentPane().add(textLName);
		textLName.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(255, 176, 165, 20);
		frmRealEstate.getContentPane().add(textPrice);
		textPrice.setColumns(10);
		
		textSquareFeet = new JTextField();
		textSquareFeet.setBounds(255, 210, 165, 20);
		frmRealEstate.getContentPane().add(textSquareFeet);
		textSquareFeet.setColumns(10);
		
		textNoOfBedroom = new JTextField();
		textNoOfBedroom.setBounds(255, 238, 165, 20);
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
