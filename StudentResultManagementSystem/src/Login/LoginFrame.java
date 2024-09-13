package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import StudentDetails.StudentMarks;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusername;
	private JTextField txtpassword;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 558);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlightText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/LoginImages/OIP (7).png")));
		lblNewLabel.setBounds(187, 10, 206, 200);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 0, 148, 521);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 20));
		lblNewLabel_1.setBounds(45, 280, 93, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(218, 249, 106, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(218, 302, 85, 13);
		contentPane.add(lblNewLabel_2_1);
		
		txtusername = new JTextField();
		txtusername.setBounds(341, 246, 96, 19);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setColumns(10);
		txtpassword.setBounds(341, 299, 96, 19);
		contentPane.add(txtpassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=txtusername.getText();
				String password=txtpassword.getText();
				
				//check the username and password that enetred by the user
				if(username.contains("ADMIN") && password.contains("ADMIN")) {
					
					JOptionPane.showMessageDialog( null,"Login succesful","Login ",JOptionPane.OK_OPTION);
					txtusername.setText(null);
					txtpassword.setText(null);
					StudentMarks studentnmarks=new StudentMarks();
					studentnmarks.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog( null,"invalid login credentials","Login ",JOptionPane.OK_OPTION);
					txtusername.setText(null);
					txtpassword.setText(null);
				}
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(344, 392, 114, 21);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null, "Are you sure ! You need to exit", "Confirmation", JOptionPane.OK_OPTION);
	     	        
	        		System.exit(ABORT);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(468, 392, 85, 21);
		contentPane.add(btnExit);
	}

}
