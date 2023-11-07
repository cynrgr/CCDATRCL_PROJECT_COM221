import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLayeredPane;

public class stickets_seats {

	JFrame frame;
	JButton[][] seatButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stickets_seats window = new stickets_seats();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        SwingUtilities.invokeLater(() -> new stickets_seats());

	}

	/**
	 * Create the application.
	 */
	public stickets_seats() {
		initialize();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        JLayeredPane layeredPane = new JLayeredPane();
        frame.getContentPane().add(layeredPane, BorderLayout.NORTH);
        
        JPanel seatPanel = new JPanel();
        seatPanel.setBounds(0, 0, 586, 297);
//        seatPanel.setLayout(new GridLayout(4, 4));
        seatButton = new JButton[10][10]; // Create a 2D array of buttons for seats

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                seatButton[i][j] = new JButton("Seat " + (i * 5 + j + 1));
                seatButton[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Handle seat selection logic here
                        JButton button = (JButton) e.getSource();
                        button.setEnabled(false); // Disable the button to indicate the seat is booked
                    }
                });
                seatPanel.add(seatButton[i][j]);
            }
        }
        
        frame.add(seatPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
	
	

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
