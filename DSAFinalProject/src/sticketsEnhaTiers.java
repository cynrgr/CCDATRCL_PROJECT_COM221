import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;

public class sticketsEnhaTiers {

	JFrame frame;
	private JPanel seatPanel;
	private JButton[][] seatButtons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sticketsEnhaTiers window = new sticketsEnhaTiers();
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
	public sticketsEnhaTiers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1192, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(203, 108, 230));
		panel.setBounds(0, 112, 1178, 501);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel enhaSeatsPoster = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/enhaseat.jpg"));
		enhaSeatsPoster.setIcon(img);
		enhaSeatsPoster.setBounds(54, 76, 242, 400);
		panel.add(enhaSeatsPoster);
		
		JLabel lblLogo = new JLabel("");
		ImageIcon logo = new ImageIcon(this.getClass().getResource("/logo.png"));
		lblLogo.setIcon(logo);
		lblLogo.setForeground(new Color(255, 255, 255));
		lblLogo.setBounds(0, 0, 170, 106);
		frame.getContentPane().add(lblLogo);
		
		JLabel royaltyLbl = new JLabel("ROYALTY STANDING");
		royaltyLbl.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		royaltyLbl.setForeground(Color.WHITE);
		royaltyLbl.setBounds(347, 87, 258, 38);
		panel.add(royaltyLbl);

		JButton selectSeatsBtn = new JButton("SELECT SEATS");
		selectSeatsBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		selectSeatsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		selectSeatsBtn.setEnabled(false);
		selectSeatsBtn.setBounds(968, 91, 161, 38);
		panel.add(selectSeatsBtn);
		
		JComboBox tierSelectionCbox = new JComboBox();
		tierSelectionCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tierSelectionCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "Royalty Standing A", "Royalty Standing B"}));
		tierSelectionCbox.setToolTipText("");
		tierSelectionCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectSeatsBtn.setEnabled(true);
			}
		});
		tierSelectionCbox.setBounds(615, 92, 182, 37);
		panel.add(tierSelectionCbox);
		
		JLabel eventSeatLbl = new JLabel("SEAT PLAN");
		eventSeatLbl.setForeground(Color.WHITE);
		eventSeatLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		eventSeatLbl.setBounds(26, 11, 258, 38);
		panel.add(eventSeatLbl);
		
		JLabel lblTickets = new JLabel("TICKETS");
		lblTickets.setForeground(Color.WHITE);
		lblTickets.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTickets.setBounds(320, 11, 98, 38);
		panel.add(lblTickets);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setForeground(new Color(102, 51, 102));
		lblLocation.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblLocation.setBounds(347, 50, 103, 38);
		panel.add(lblLocation);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setForeground(new Color(102, 51, 102));
		lblSection.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblSection.setBounds(615, 50, 103, 38);
		panel.add(lblSection);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(102, 51, 102));
		lblPrice.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblPrice.setBounds(849, 50, 103, 38);
		panel.add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(new Color(102, 51, 102));
		lblQuantity.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblQuantity.setBounds(968, 50, 103, 38);
		panel.add(lblQuantity);
		
		JLabel lblRoyaltyPrice = new JLabel("₱15,000");
		lblRoyaltyPrice.setForeground(Color.WHITE);
		lblRoyaltyPrice.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblRoyaltyPrice.setBounds(849, 87, 98, 38);
		panel.add(lblRoyaltyPrice);
		
		JLabel lblVipStanding = new JLabel("VIP STANDING");
		lblVipStanding.setForeground(Color.WHITE);
		lblVipStanding.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblVipStanding.setBounds(347, 129, 258, 38);
		panel.add(lblVipStanding);
		
		JLabel lblVipSeated = new JLabel("VIP SEATED");
		lblVipSeated.setForeground(Color.WHITE);
		lblVipSeated.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblVipSeated.setBounds(347, 173, 258, 38);
		panel.add(lblVipSeated);
		
		JLabel lblLowerBox = new JLabel("LOWER BOX");
		lblLowerBox.setForeground(Color.WHITE);
		lblLowerBox.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblLowerBox.setBounds(347, 217, 258, 38);
		panel.add(lblLowerBox);
		
		JLabel lblUpperBoxA = new JLabel("UPPER BOX A");
		lblUpperBoxA.setForeground(Color.WHITE);
		lblUpperBoxA.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblUpperBoxA.setBounds(347, 261, 258, 38);
		panel.add(lblUpperBoxA);
		
		JLabel lblGeneralAdmission = new JLabel("GENERAL ADMISSION");
		lblGeneralAdmission.setForeground(Color.WHITE);
		lblGeneralAdmission.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblGeneralAdmission.setBounds(347, 349, 258, 38);
		panel.add(lblGeneralAdmission);
		
		JLabel lblGenericAdmission = new JLabel("GENERIC ADMISSION");
		lblGenericAdmission.setForeground(Color.WHITE);
		lblGenericAdmission.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblGenericAdmission.setBounds(347, 395, 258, 38);
		panel.add(lblGenericAdmission);
		
// VIP STANDING
		JButton vipStandingbtn = new JButton("SELECT SEATS");
		vipStandingbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		vipStandingbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vipStandingbtn.setEnabled(false);
		vipStandingbtn.setBounds(968, 133, 161, 38);
		panel.add(vipStandingbtn);
		
		JComboBox vipStandingCbox = new JComboBox();
		vipStandingCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vipStandingbtn.setEnabled(true);
			}
		});
		vipStandingCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vipStandingCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "VIP Standing"}));
		vipStandingCbox.setToolTipText("");
		vipStandingCbox.setBounds(615, 134, 182, 37);
		panel.add(vipStandingCbox);
		
// VIP SEATED	
		JButton vipSeatedbtn = new JButton("SELECT SEATS");
		vipSeatedbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		vipSeatedbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vipSeatedbtn.setEnabled(false);
		vipSeatedbtn.setBounds(968, 175, 161, 38);
		panel.add(vipSeatedbtn);
		
		JComboBox vipSeatedCbox = new JComboBox();
		vipSeatedCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vipSeatedbtn.setEnabled(true);
			}
		});
		vipSeatedCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vipSeatedCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "VIP Seated 201", "VIP Seated 202", "VIP Seated 203",
				"VIP Seated 204", "VIP Seated 205", "VIP Seated 206", "VIP Seated 217", "VIP Seated 218", "VIP Seated 219", "VIP Seated 220",
				"VIP Seated 221", "VIP Seated 222"}));
		vipSeatedCbox.setToolTipText("");
		vipSeatedCbox.setBounds(615, 178, 182, 37);
		panel.add(vipSeatedCbox);
		
// LOWER BOX
		JButton lowerBoxbtn = new JButton("SELECT SEATS");
		lowerBoxbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		lowerBoxbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lowerBoxbtn.setEnabled(false);
		lowerBoxbtn.setBounds(968, 219, 161, 38);
		panel.add(lowerBoxbtn);
		
		JComboBox lowerCbox = new JComboBox();
		lowerCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lowerBoxbtn.setEnabled(true);
			}
		});
		lowerCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lowerCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "LOWER BOX 203", "LOWER BOX 204", "LOWER BOX 219", "LOWER BOX 220"}));
		lowerCbox.setToolTipText("");
		lowerCbox.setBounds(615, 222, 182, 37);
		panel.add(lowerCbox);
		
// UPPER BOX A
		JButton upperAbtn = new JButton("SELECT SEATS");
		upperAbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		upperAbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		upperAbtn.setEnabled(false);
		upperAbtn.setBounds(968, 263, 161, 38);
		panel.add(upperAbtn);
		
		JComboBox upperACbox = new JComboBox();
		upperACbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				upperAbtn.setEnabled(true);
			}
		});
		upperACbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		upperACbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "UBOX A 401", "UBOX A 402", "UBOX A 403A",
				"UBOX A 403B", "UBOX A 404", "UBOX A 405", "UBOX A 406", "UBOX A 417", "UBOX A 418", "UBOX A 419", 
				"UBOX A 420A", "UBOX A 420B", "UBOX A 421", "UBOX A 422"}));
		upperACbox.setToolTipText("");
		upperACbox.setBounds(615, 266, 182, 37);
		panel.add(upperACbox);
		
// GENERAL AD
		JButton genLbtn = new JButton("SELECT SEATS");
		genLbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		genLbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		genLbtn.setEnabled(false);
		genLbtn.setBounds(968, 351, 161, 38);
		panel.add(genLbtn);
		
		JComboBox genAdCbox = new JComboBox();
		genAdCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				genLbtn.setEnabled(true);
			}
		});
		genAdCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		genAdCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "GENL 501", "GENL 502", "GENL 503A",
				"GENL 503B", "GENL 504", "GENL 505", "GENL 506", "GENL 517", "GENL 518", "GENL 519", 
				"GENL 520A", "GENL 520B", "GENL 521", "GENL 522"}));
		genAdCbox.setToolTipText("");
		genAdCbox.setBounds(615, 354, 182, 37);
		panel.add(genAdCbox);
		
// GENERIC AD
		JButton genCbtn = new JButton("SELECT SEATS");
		genCbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		genCbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		genCbtn.setEnabled(false);
		genCbtn.setBounds(968, 397, 161, 38);
		panel.add(genCbtn);
		
		JComboBox genericAdCbox = new JComboBox();
		genericAdCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				genCbtn.setEnabled(true);
			}
		});
		genericAdCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		genericAdCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "GENC 503A", "GENC B 503B", "GENC B 504",
				"GENC B 519", "GENC B 520A", "GENC B 520B"}));
		genericAdCbox.setToolTipText("");
		genericAdCbox.setBounds(615, 398, 182, 37);
		panel.add(genericAdCbox);
		
// UPPER BOX B
		JLabel lblUpperBoxB = new JLabel("UPPER BOX B");
		lblUpperBoxB.setForeground(Color.WHITE);
		lblUpperBoxB.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblUpperBoxB.setBounds(347, 305, 258, 38);
		panel.add(lblUpperBoxB);
		
		JButton upperBbtn = new JButton("SELECT SEATS");
		upperBbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sticketsEnhaSeats window = new sticketsEnhaSeats();
				window.frame.setVisible(true);
			}
		});
		upperBbtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		upperBbtn.setEnabled(false);
		upperBbtn.setBounds(968, 307, 161, 38);
		panel.add(upperBbtn);
		
		JComboBox upperBCbox = new JComboBox();
		upperBCbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				upperBbtn.setEnabled(true);
			}
		});
		upperBCbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		upperBCbox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "UBOX B 403A", "UBOX B 403B", "UBOX B 404",
				"UBOX B 419", "UBOX B 420A", "UBOX B 420B"}));
		upperBCbox.setToolTipText("");
		upperBCbox.setBounds(615, 310, 182, 37);
		panel.add(upperBCbox);
		
		JLabel lblVIPStanding = new JLabel("₱10,000");
		lblVIPStanding.setForeground(Color.WHITE);
		lblVIPStanding.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblVIPStanding.setBounds(849, 129, 98, 38);
		panel.add(lblVIPStanding);
		
		JLabel lblVIPSeated = new JLabel("₱12,500");
		lblVIPSeated.setForeground(Color.WHITE);
		lblVIPSeated.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblVIPSeated.setBounds(849, 173, 98, 38);
		panel.add(lblVIPSeated);
		
		JLabel lblLowerB = new JLabel("₱11,000");
		lblLowerB.setForeground(Color.WHITE);
		lblLowerB.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblLowerB.setBounds(849, 217, 98, 38);
		panel.add(lblLowerB);
		
		JLabel lblUpperA = new JLabel("₱7,500");
		lblUpperA.setForeground(Color.WHITE);
		lblUpperA.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblUpperA.setBounds(849, 261, 98, 38);
		panel.add(lblUpperA);
		
		JLabel lblUpperB = new JLabel("₱6,500");
		lblUpperB.setForeground(Color.WHITE);
		lblUpperB.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblUpperB.setBounds(849, 305, 98, 38);
		panel.add(lblUpperB);
		
		JLabel lblGenL = new JLabel("₱3,500");
		lblGenL.setForeground(Color.WHITE);
		lblGenL.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblGenL.setBounds(849, 349, 98, 38);
		panel.add(lblGenL);
		
		JLabel lblGenC = new JLabel("₱2,500");
		lblGenC.setForeground(Color.WHITE);
		lblGenC.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblGenC.setBounds(849, 395, 98, 38);
		panel.add(lblGenC);
		
// TITLE		
		JLabel enhaConLbl = new JLabel("ENHYPEN: MANIFESTO");
		enhaConLbl.setBounds(445, 27, 377, 61);
		enhaConLbl.setForeground(new Color(204, 0, 255));
		enhaConLbl.setBackground(new Color(255, 255, 255));
		enhaConLbl.setFont(new Font("Showcard Gothic", Font.PLAIN, 35));
		frame.getContentPane().add(enhaConLbl);
		
		JLabel enhaLocLbl = new JLabel("SM Mall of Asia Arena");
		enhaLocLbl.setForeground(new Color(204, 0, 255));
		enhaLocLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		enhaLocLbl.setBackground(Color.WHITE);
		enhaLocLbl.setBounds(522, 46, 377, 61);
		frame.getContentPane().add(enhaLocLbl);

		
	}
}