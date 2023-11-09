package dsa;

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
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class checkoutticket {

	private JFrame frame;
	private JTextField txtLocation;
	private JTextField txtSec;
	private JTextField txtPrice;
	private JTextField txtEvent;
	private JTextField txtLoc;
	private JTextField txtSection;
	private JTextField txtSecPrice;
	private JTextField txtFinalPrice;
	private JTextField txtOlFee;
	private JTextField txtFinalOl;
	private JTextField txtTixPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkoutticket window = new checkoutticket();
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
	public checkoutticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		//frame.setBounds(100, 100, 1192, 644);
		frame.setBounds(100, 100, 1163, 882);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel logo = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		logo.setIcon(new ImageIcon(img3));
		logo.setForeground(new Color(255, 255, 255));
		logo.setBounds(20, 10, 176, 106);
		frame.getContentPane().add(logo);
		
		JLabel lblNewLabel = new JLabel("Selected tickets");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(304, 129, 306, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Location");
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1.setBounds(342, 188, 114, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Section");
		lblNewLabel_1_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(643, 192, 117, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1_1_1.setBounds(970, 188, 118, 31);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		txtLocation = new JTextField();
		txtLocation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLocation.setEditable(false);
		txtLocation.setBackground(new Color(226, 173, 241));
		txtLocation.setBounds(342, 257, 210, 31);
		frame.getContentPane().add(txtLocation);
		txtLocation.setColumns(10);
		
		txtSec = new JTextField();
		txtSec.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSec.setBackground(new Color(226, 173, 241));
		txtSec.setEditable(false);
		txtSec.setColumns(10);
		txtSec.setBounds(637, 257, 216, 31);
		frame.getContentPane().add(txtSec);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPrice.setBackground(new Color(226, 173, 241));
		txtPrice.setEditable(false);
		txtPrice.setColumns(10);
		txtPrice.setBounds(970, 257, 176, 31);
		frame.getContentPane().add(txtPrice);
		
		JLabel lblOrderSummary = new JLabel("Order Summary");
		lblOrderSummary.setForeground(new Color(64, 0, 128));
		lblOrderSummary.setBackground(new Color(203, 108, 230));
		lblOrderSummary.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblOrderSummary.setBounds(304, 323, 210, 49);
		frame.getContentPane().add(lblOrderSummary);
		
		txtEvent = new JTextField();
		txtEvent.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtEvent.setBackground(new Color(255, 255, 128));
		txtEvent.setEditable(false);
		txtEvent.setColumns(10);
		txtEvent.setBounds(330, 382, 599, 36);
		frame.getContentPane().add(txtEvent);
		
		txtLoc = new JTextField();
		txtLoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLoc.setBackground(new Color(255, 255, 128));
		txtLoc.setEditable(false);
		txtLoc.setColumns(10);
		txtLoc.setBounds(330, 435, 249, 31);
		frame.getContentPane().add(txtLoc);
		
		txtSection = new JTextField();
		txtSection.setBackground(new Color(255, 255, 128));
		txtSection.setEditable(false);
		txtSection.setColumns(10);
		txtSection.setBounds(325, 504, 249, 33);
		frame.getContentPane().add(txtSection);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total Ticket Price");
		lblNewLabel_1_2.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(330, 604, 176, 31);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Online Fee");
		lblNewLabel_1_2_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2_1.setBounds(330, 566, 105, 13);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		txtSecPrice = new JTextField();
		txtSecPrice.setBackground(new Color(255, 255, 128));
		txtSecPrice.setEditable(false);
		txtSecPrice.setColumns(10);
		txtSecPrice.setBounds(629, 504, 169, 33);
		frame.getContentPane().add(txtSecPrice);
		
		txtFinalPrice = new JTextField();
		txtFinalPrice.setBackground(new Color(255, 255, 128));
		txtFinalPrice.setEditable(false);
		txtFinalPrice.setColumns(10);
		txtFinalPrice.setBounds(845, 504, 158, 33);
		frame.getContentPane().add(txtFinalPrice);
		
		txtOlFee = new JTextField();
		txtOlFee.setBackground(new Color(255, 255, 128));
		txtOlFee.setEditable(false);
		txtOlFee.setColumns(10);
		txtOlFee.setBounds(500, 562, 147, 22);
		frame.getContentPane().add(txtOlFee);
		
		txtFinalOl = new JTextField();
		txtFinalOl.setBackground(new Color(255, 255, 128));
		txtFinalOl.setEditable(false);
		txtFinalOl.setColumns(10);
		txtFinalOl.setBounds(703, 562, 134, 22);
		frame.getContentPane().add(txtFinalOl);
		
		txtTixPrice = new JTextField();
		txtTixPrice.setBackground(new Color(255, 255, 128));
		txtTixPrice.setEditable(false);
		txtTixPrice.setColumns(10);
		txtTixPrice.setBounds(500, 604, 210, 29);
		frame.getContentPane().add(txtTixPrice);
		
		JLabel visa = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/rsz_visa.png")).getImage();
		visa.setIcon(new ImageIcon(img));
		visa.setBounds(382, 697, 197, 74);
		frame.getContentPane().add(visa);
		
		JLabel gcash = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/rsz_gcash.png")).getImage();
		gcash.setIcon(new ImageIcon(img1));
		gcash.setBounds(723, 705, 158, 49);
		frame.getContentPane().add(gcash);
		
		JLabel maya = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/rsz_maya.jpg")).getImage();
		maya.setIcon(new ImageIcon(img2));
		maya.setBounds(984, 697, 189, 65);
		frame.getContentPane().add(maya);
		
		JRadioButton gcash_radio = new JRadioButton("");
		gcash_radio.setBackground(new Color(255, 255, 128));
		gcash_radio.setBounds(686, 697, 103, 21);
		frame.getContentPane().add(gcash_radio);
		
		JRadioButton visa_radio = new JRadioButton("");
		visa_radio.setBackground(new Color(255, 255, 128));
		visa_radio.setBounds(344, 705, 103, 21);
		frame.getContentPane().add(visa_radio);
		
		JRadioButton maya_radio = new JRadioButton("");
		maya_radio.setBackground(new Color(255, 255, 128));
		maya_radio.setBounds(949, 697, 103, 21);
		frame.getContentPane().add(maya_radio);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Choose Payment Method");
		lblNewLabel_1_2_2.setForeground(new Color(64, 0, 128));
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_2_2.setBounds(304, 643, 456, 44);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(226, 173, 241));
		panel.setBounds(301, 234, 848, 79);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(203, 108, 230));
		panel_1.setBounds(0, -9, 1264, 128);
		frame.getContentPane().add(panel_1);
		
		JTextArea txtrAosidjasj = new JTextArea();
		txtrAosidjasj.setForeground(new Color(64, 0, 128));
		txtrAosidjasj.setWrapStyleWord(true);
		txtrAosidjasj.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtrAosidjasj.setBackground(new Color(255, 255, 128));
		txtrAosidjasj.setText("NOTICE TO ALL ONLINE  CUSTOMERS: ");
		txtrAosidjasj.setLineWrap(true);
		txtrAosidjasj.setBounds(20, 148, 197, 106);
		frame.getContentPane().add(txtrAosidjasj);
		
		JTextArea txttrGuidelines = new JTextArea();
		txttrGuidelines.setForeground(new Color(64, 0, 128));
		txttrGuidelines.setText("Guidelines for Online Ticket Purchase.");
		txttrGuidelines.setFont(new Font("Tahoma", Font.BOLD, 18));
		txttrGuidelines.setBackground(new Color(255, 255, 128));
		txttrGuidelines.setLineWrap(true);
		txttrGuidelines.setWrapStyleWord(true);
		txttrGuidelines.setBounds(20, 264, 197, 74);
		frame.getContentPane().add(txttrGuidelines);
		
		JTextArea txtrDetails = new JTextArea();
		txtrDetails.setWrapStyleWord(true);
		txtrDetails.setText("To protect all users from fraud and unintended misuse of credit cards, please note that the following should ALL bear the SAME NAME when buying tickets online: ");
		txtrDetails.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrDetails.setBounds(20, 341, 189, 113);
		txtrDetails.setForeground(new Color(64, 0, 128));
		txtrDetails.setBackground(new Color(255, 255, 128));
		txtrDetails.setLineWrap(true);
		frame.getContentPane().add(txtrDetails);
		
		JTextArea txtrSmTicketsUser = new JTextArea();
		txtrSmTicketsUser.setWrapStyleWord(true);
		txtrSmTicketsUser.setText("1. SM Tickets user account \n2. Credit card to be used \n3. One (1) valid government ID to be presented for redemption "
				+ "\n\nTicket redemption through a representative is NOT allowed. Only the cardholder who transacted online can redeem the ticket. To avoid any inconvenience, we request our patrons to comply with the above guidelines. The safety and security of our customers is always our top priority. By proceeding to payment, you agree with the above redemption process. Price is inclusive of standard ticket charges.");
		txtrSmTicketsUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrSmTicketsUser.setBounds(20, 464, 234, 305);
		txtrSmTicketsUser.setForeground(new Color(64, 0, 128));
		txtrSmTicketsUser.setBackground(new Color(255, 255, 128));
		txtrSmTicketsUser.setLineWrap(true);
		frame.getContentPane().add(txtrSmTicketsUser);
		
	
		
		
		
		
	}
}
