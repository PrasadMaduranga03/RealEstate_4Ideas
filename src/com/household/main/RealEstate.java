package com.household.main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.household.manupulate.SortedList;
import com.household.model.ListHouse;
import com.household.persistence.HouseFile;

public class RealEstate {

	private JFrame frmRealEstate;
	private JTextField textLotNumber;
	private JTextField textFName;
	private JTextField textLName;
	private JTextField textPrice;
	private JTextField textSquareFeet;
	private JTextField textNoOfBedroom;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblP;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	HouseFile houseFile = new HouseFile();

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
		frmRealEstate.setBackground(new Color(240, 248, 255));
		frmRealEstate.setTitle("Real Estate Program");
		frmRealEstate.getContentPane().setBackground(
				UIManager.getColor("Button.background"));
		frmRealEstate.getContentPane().setForeground(new Color(176, 196, 222));
		frmRealEstate.setBounds(100, 100, 441, 508);
		frmRealEstate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRealEstate.getContentPane().setLayout(null);

		//reset button to makeEmpty
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearTextFields();
			}
		});
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setFont(new Font("Arial", Font.BOLD, 12));
		btnReset.setBounds(10, 302, 202, 45);
		frmRealEstate.getContentPane().add(btnReset);

		//next button to next
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					int lotNo;
					if (textLotNumber.getText().equals("")){
						lotNo = 0;
					}else{
						lotNo = Integer.parseInt(textLotNumber.getText());
					}
					
					
					LinkedList<ListHouse> allListHouseList = houseFile.retreiveHouseHoldRecord();
					SortedList sortedList = new SortedList();
					
					ListHouse houseList = sortedList.nextListHouse(allListHouseList, lotNo);
					
					textLotNumber.setText(houseList.getLotNo()+"");
					textFName.setText(houseList.getFirstName());
					textLName.setText(houseList.getLastName());
					textPrice.setText(houseList.getPrice().toString());
					textNoOfBedroom.setText(houseList.getNoOfBedRooms()+"");
					textSquareFeet.setText(houseList.getSquareFeet()+"");
				} catch (Exception e) {

				}
			}
		});
		btnNext.setBackground(Color.LIGHT_GRAY);
		btnNext.setFont(new Font("Arial", Font.BOLD, 12));
		btnNext.setBounds(228, 302, 187, 45);
		frmRealEstate.getContentPane().add(btnNext);
		
		//
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(isExists()){
					JOptionPane.showMessageDialog(null, "already exists.");
					clearTextFields();
				}
				else{
					ListHouse listhouse = new ListHouse();
					listhouse.setLotNo(Integer.parseInt(textLotNumber.getText()));
					listhouse.setFirstName(textFName.getText());
					listhouse.setLastName(textLName.getText());
					listhouse.setNoOfBedRooms(Integer.parseInt(textNoOfBedroom.getText()));
					listhouse.setPrice(new BigDecimal(textPrice.getText()));
					listhouse.setSquareFeet(Double.parseDouble(textSquareFeet.getText()));
					
					SortedList sendList = new SortedList();
					boolean i = sendList.insert(listhouse);
					if(i== true){
						clearTextFields();
					}				
					houseFile.saveHouseHoldRecord(listhouse, true);
				}
			}
		});
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setFont(new Font("Arial", Font.BOLD, 12));
		btnAdd.setBounds(10, 359, 202, 45);
		frmRealEstate.getContentPane().add(btnAdd);

		//
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int lotNo = Integer.parseInt(textLotNumber.getText());
					
					SortedList sortedList = new SortedList();
					ListHouse houseList = sortedList.removeHouse(lotNo);
					
					if(houseList != null){
						JOptionPane.showMessageDialog(null, "deleted");
						clearTextFields();
					}
					else{
						JOptionPane.showMessageDialog(null, "No data to delete");
						clearTextFields();
					}
					
				} catch (Exception e) {

				}
			}
		});
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.setFont(new Font("Arial", Font.BOLD, 12));
		btnDelete.setBounds(228, 358, 187, 45);
		frmRealEstate.getContentPane().add(btnDelete);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SortedList clearFile = new SortedList();
				boolean i = clearFile.makeEmpty();
				
				if(i == true){
					JOptionPane.showMessageDialog(null, "Cleared");
					clearTextFields();
				}
			}
		});
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setFont(new Font("Arial", Font.BOLD, 12));
		btnClear.setBounds(10, 415, 202, 45);
		frmRealEstate.getContentPane().add(btnClear);
	
		//Get a specific house infomation
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					int lotNo=Integer.parseInt(textLotNumber.getText());
					LinkedList<ListHouse> allListHouseList = houseFile.retreiveHouseHoldRecord();
					SortedList sortedList = new SortedList();
					ListHouse houseList = sortedList.findListHouse(allListHouseList, lotNo);
					if(houseList != null){
						textFName.setText(houseList.getFirstName());
						textLName.setText(houseList.getLastName());
						textPrice.setText(houseList.getPrice().toString());
						textNoOfBedroom.setText(houseList.getNoOfBedRooms()+"");
						textSquareFeet.setText(houseList.getSquareFeet()+"");						
					}

				} catch (Exception e) {

				}
			}
		});
		btnFind.setBackground(Color.LIGHT_GRAY);
		btnFind.setFont(new Font("Arial", Font.BOLD, 12));
		btnFind.setBounds(228, 414, 187, 45);
		frmRealEstate.getContentPane().add(btnFind);

		textLotNumber = new JTextField();
		textLotNumber.setBounds(228, 58, 187, 30);
		frmRealEstate.getContentPane().add(textLotNumber);
		textLotNumber.setColumns(10);
		
		textFName = new JTextField();
		textFName.setBounds(228, 99, 187, 30);
		frmRealEstate.getContentPane().add(textFName);
		textFName.setColumns(10);

		textLName = new JTextField();
		textLName.setBounds(228, 140, 187, 30);
		frmRealEstate.getContentPane().add(textLName);
		textLName.setColumns(10);

		textPrice = new JTextField();
		textPrice.setBounds(228, 181, 187, 30);
		frmRealEstate.getContentPane().add(textPrice);
		textPrice.setColumns(10);

		textSquareFeet = new JTextField();
		textSquareFeet.setBounds(228, 222, 187, 30);
		frmRealEstate.getContentPane().add(textSquareFeet);
		textSquareFeet.setColumns(10);

		textNoOfBedroom = new JTextField();
		textNoOfBedroom.setBounds(228, 261, 187, 30);
		frmRealEstate.getContentPane().add(textNoOfBedroom);
		textNoOfBedroom.setColumns(10);

		JLabel lblLotNumber = new JLabel("       Lot Number : ");
		lblLotNumber.setForeground(new Color(47, 79, 79));
		lblLotNumber.setFont(new Font("Arial", Font.BOLD, 12));
		lblLotNumber.setBounds(105, 66, 107, 14);
		frmRealEstate.getContentPane().add(lblLotNumber);

		lblNewLabel = new JLabel("         First Name :");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(105, 107, 107, 14);
		frmRealEstate.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Last Name :");
		lblNewLabel_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(133, 147, 79, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_1);

		lblP = new JLabel("Price :");
		lblP.setForeground(new Color(47, 79, 79));
		lblP.setFont(new Font("Arial", Font.BOLD, 12));
		lblP.setBounds(164, 188, 48, 14);
		frmRealEstate.getContentPane().add(lblP);

		lblNewLabel_2 = new JLabel("Square Feet :");
		lblNewLabel_2.setForeground(new Color(47, 79, 79));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(127, 230, 85, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Number of Bedrooms :");
		lblNewLabel_3.setForeground(new Color(47, 79, 79));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(74, 269, 138, 14);
		frmRealEstate.getContentPane().add(lblNewLabel_3);

		JLabel lblNexthousedisplay = new JLabel("Next House Display");
		lblNexthousedisplay.setFont(new Font("Arial", Font.BOLD, 13));
		lblNexthousedisplay.setForeground(new Color(47, 79, 79));
		lblNexthousedisplay.setBounds(10, 11, 172, 30);
		frmRealEstate.getContentPane().add(lblNexthousedisplay);
	}
	
	protected boolean isExists() {
		// TODO Auto-generated method stub
		return false;
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
