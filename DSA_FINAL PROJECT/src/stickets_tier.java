import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class stickets_tier {

	private JFrame frame;
	private JPanel seatPanel;
	private JButton[][] seatButtons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stickets_tier window = new stickets_tier();
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
	public stickets_tier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1251, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/twice.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(22, 54, 402, 405);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel title = new JLabel("VIP PACKAGE SEATED");
		title.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		title.setBounds(434, 122, 224, 36);
		frame.getContentPane().add(title);
		
		JButton selectSeatsBtn = new JButton("Select Seats");
		selectSeatsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stickets_seats window = new stickets_seats();
				window.frame.setVisible(true);
			}
		});
		selectSeatsBtn.setEnabled(false);
		selectSeatsBtn.setBounds(735, 234, 124, 36);
		frame.getContentPane().add(selectSeatsBtn);
		
		String[] vipSeated = {"A1","A2","B1", "B2"};
		JComboBox comboBox = new JComboBox(vipSeated);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "A1", "A2", "B1", "B2", "C1", "C2"}));
		comboBox.setToolTipText("");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectSeatsBtn.setEnabled(true);
			}
		});
		comboBox.setBounds(515, 230, 129, 45);
		frame.getContentPane().add(comboBox);

		
	}
}
