package ConcertTix;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;

public class stickets {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stickets window = new stickets();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public stickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1163, 882);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selected tickets");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(37, 34, 210, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Location");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setBounds(81, 82, 114, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Section");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1_1.setBounds(376, 86, 117, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1_1_1.setBounds(705, 82, 118, 31);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setEditable(false);
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(81, 146, 210, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(376, 146, 216, 31);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(705, 146, 176, 31);
		frame.getContentPane().add(textField_2);
		
		JLabel lblOrderSummary = new JLabel("Order Summary");
		lblOrderSummary.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblOrderSummary.setBounds(37, 207, 210, 49);
		frame.getContentPane().add(lblOrderSummary);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(81, 265, 366, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(81, 302, 133, 30);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(255, 255, 255));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(102, 342, 96, 33);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total Ticket Price");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(102, 421, 129, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Online Fee");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(102, 385, 105, 13);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(268, 342, 96, 33);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(255, 255, 255));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(418, 342, 96, 33);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(255, 255, 255));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(268, 383, 96, 19);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(255, 255, 255));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(418, 383, 96, 19);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBackground(new Color(255, 255, 255));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(268, 419, 96, 19);
		frame.getContentPane().add(textField_10);
		
		JLabel visa = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/rsz_visa.png")).getImage();
		visa.setIcon(new ImageIcon(img));
		visa.setBounds(119, 504, 197, 74);
		frame.getContentPane().add(visa);
		
		JLabel gcash = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/rsz_gcash.png")).getImage();
		gcash.setIcon(new ImageIcon(img1));
		gcash.setBounds(470, 512, 158, 49);
		frame.getContentPane().add(gcash);
		
		JLabel maya = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/rsz_maya.jpg")).getImage();
		maya.setIcon(new ImageIcon(img2));
		maya.setBounds(755, 504, 189, 65);
		frame.getContentPane().add(maya);
		
		JRadioButton gcash_radio = new JRadioButton("");
		gcash_radio.setBackground(new Color(255, 255, 255));
		gcash_radio.setBounds(433, 504, 103, 21);
		frame.getContentPane().add(gcash_radio);
		
		JRadioButton visa_radio = new JRadioButton("");
		visa_radio.setBackground(new Color(255, 255, 255));
		visa_radio.setBounds(81, 512, 103, 21);
		frame.getContentPane().add(visa_radio);
		
		JRadioButton maya_radio = new JRadioButton("");
		maya_radio.setBackground(new Color(255, 255, 255));
		maya_radio.setBounds(720, 504, 103, 21);
		frame.getContentPane().add(maya_radio);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Choose Payment Method");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_2_2.setBounds(37, 461, 456, 44);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 123, 889, 65);
		frame.getContentPane().add(panel);
		
		
		
	}
}
