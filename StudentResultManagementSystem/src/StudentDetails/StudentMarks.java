package StudentDetails;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTable;

public class StudentMarks extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtstId;
	private JTextField txtStName;
	private JTextField txtStudentm;
	private JTable table;
	private DefaultTableModel tableModel;
    private int selectedRow = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks frame = new StudentMarks();
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
	public StudentMarks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSt_id = new JLabel("Student ID");
		lblSt_id.setBounds(224, 106, 85, 21);
		lblSt_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblSt_id);
		
		JLabel lblST_name = new JLabel("Student Name");
		lblST_name.setBounds(224, 157, 110, 21);
		lblST_name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblST_name);
		
		JLabel lblStMarks = new JLabel("Student Marks");
		lblStMarks.setBounds(224, 204, 110, 21);
		lblStMarks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblStMarks);
		
		txtstId = new JTextField();
		txtstId.setBounds(371, 107, 96, 19);
		contentPane.add(txtstId);
		txtstId.setColumns(10);
		
		txtStName = new JTextField();
		txtStName.setBounds(371, 158, 96, 19);
		txtStName.setColumns(10);
		contentPane.add(txtStName);
		
		txtStudentm = new JTextField();
		txtStudentm.setBounds(371, 205, 96, 19);
		txtStudentm.setColumns(10);
		contentPane.add(txtStudentm);
		
		JRadioButton rbtStudent = new JRadioButton("Student");
		rbtStudent.setBounds(286, 240, 103, 21);
		rbtStudent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(rbtStudent);
		
		JRadioButton rbtUn_St = new JRadioButton("UndergraduateStudent");
		rbtUn_St.setBounds(402, 240, 157, 21);
		rbtUn_St.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(rbtUn_St);
		
		
		

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 55, 214, 345);
		lblNewLabel_1.setIcon(new ImageIcon(StudentMarks.class.getResource("/LoginImages/R (1)dv.png")));
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 677, 45);
		panel.setBackground(new Color(128, 255, 128));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel(" Result Submission");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		
		
		
		JButton btnSumbit = new JButton("Submit");
		btnSumbit.setBounds(371, 284, 85, 21);
		btnSumbit.setBackground(new Color(255, 255, 128));
		btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSumbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*	//addStudentResults();
			String st_id=txtstId.getText();
				String name=txtStName.getText();
				double marks=Double.parseDouble(txtStudentm.getText());
			
				
				Student student=new Student(st_id,name,marks);
				//student.displayStudentResults();
				//textPane.setText("Student results:"  student.displayStudentResults() );
				
				textPane.setText("Student Added:\n" + "Name: " + student.getName() + "\nStudent ID: " + student.getSt_id() + "\nMarks: " + student.getMarks());
			
				
				*/
				 // Get input data
		        String st_id = txtstId.getText();
		        String name = txtStName.getText();
		        double marks = Double.parseDouble(txtStudentm.getText());

		        // Create a new Student object
		        Student student = new Student(st_id, name, marks);

		        // Display student details in textPane
		       // textPane.setText("Student Added:\n" + "Name: " + student.getName() + "\nStudent ID: " + student.getSt_id() + "\nMarks: " + student.getMarks());

		        // Add student data to the table
		        tableModel.addRow(new Object[]{student.getSt_id(), student.getName(), student.getMarks()});
			}
		});
		contentPane.add(btnSumbit);
		
		
		
		
		
		//cretaes a object iin default tablemodel
		 tableModel = new DefaultTableModel(new Object[][] {},
	                new String[] { "Student id", "Name", "Marks" });
		 
		 
		 //creates a object namess table in JTable 
	        table = new JTable(tableModel);
	        table.setBounds(10, 379, 750, 150);
	        
	        // Add table to JScrollPane and add to content pane
	        JScrollPane scrollPane = new JScrollPane(table);
	        scrollPane.setBounds(0, 369, 750, 150);
	        contentPane.add(scrollPane);
	        
	        JButton btnUpdate = new JButton("Update Marks");
	        btnUpdate.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		updateStudentResults();
	        	}
	        });
	        btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        btnUpdate.setBackground(new Color(0, 128, 255));
	        btnUpdate.setBounds(466, 284, 131, 21);
	        contentPane.add(btnUpdate);
	        
	        JButton btnExit = new JButton("Exit");
	        btnExit.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		 JOptionPane.showMessageDialog(null, "Are you sure ! You need to exit", "Confirmation", JOptionPane.OK_OPTION);
	     	        
	        		System.exit(ABORT);
	        	}
	        });
	        btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        btnExit.setBackground(new Color(0, 128, 255));
	        btnExit.setBounds(426, 329, 85, 21);
	        contentPane.add(btnExit);

	        
	        table.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                int row = table.rowAtPoint(e.getPoint());
	                if (row >= 0) {
	                    selectedRow = row;
	                    displayFields();
	                }
	            }
	        });
	    }

	    private void addStudentResults() {
	    	String st_id=txtstId.getText();
			String name=txtStName.getText();
			double marks=Double.parseDouble(txtStudentm.getText());
			
	        // Add data to table
	        tableModel.addRow(new Object[] { st_id, name,marks });
	        
	      
	        JOptionPane.showMessageDialog(null, "Data added successfully", "Confirmation", JOptionPane.OK_OPTION);
	        
	        // Clear the fields
	        txtstId.setText("");
	        txtStName.setText("");
	        txtStudentm.setText("");
	       
	    }

	   
	    private void updateStudentResults() {
	        if (selectedRow >= 0) {
	        	String st_id=txtstId.getText();
	        	String name=txtStName.getText();
				double marks=Double.parseDouble(txtStudentm.getText());
	            
	           //updating the table
	            tableModel.setValueAt(st_id, selectedRow, 0);
	            tableModel.setValueAt(name, selectedRow, 1);
	            tableModel.setValueAt(marks, selectedRow, 2);
	            
	            
	            
	            JOptionPane.showMessageDialog(null, "Data updated successfully", "Confirmation", JOptionPane.OK_OPTION);
	            
	            //clearing the textfields
	            txtstId.setText("");
		        txtStName.setText("");
		        txtStudentm.setText("");
	            selectedRow = -1;
	        } else {
	            JOptionPane.showMessageDialog(null, "No row selected for update", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }

	    
	    private void displayFields() {
	        if (selectedRow >= 0) {
	            txtstId.setText((String) tableModel.getValueAt(selectedRow, 0));
	            txtStName.setText((String) tableModel.getValueAt(selectedRow, 1));
	            txtStudentm.setText((String) tableModel.getValueAt(selectedRow, 2));
	           
	        }
	    }
		
		 
		
	}

