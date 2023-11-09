import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class sticketsEnhaSeats {
    JFrame frame;
    private JButton[][] seatButton;
    private LinkedList<JButton> availableSeats;
    private JButton confirmButton;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new sticketsEnhaSeats());
    }

    public sticketsEnhaSeats() {
        initialize();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JLayeredPane layeredPane = new JLayeredPane();
        frame.getContentPane().add(layeredPane, BorderLayout.NORTH);

        JPanel seatPanel = new JPanel();
        seatPanel.setBounds(0, 0, 586, 297);

        seatButton = new JButton[8][7];
        availableSeats = new LinkedList<>();
       

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                seatButton[i][j] = new JButton("Seat " + (i * 7 + j + 1));
                seatButton[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button = (JButton) e.getSource();
                        if (availableSeats.contains(button)) {
                            // Seat is already booked
                            button.setEnabled(true);
                            availableSeats.remove(button);
                        } else {
                            // Seat is available, book it
                            availableSeats.add(button);
                            button.setEnabled(false);
                        }
                    }
                });
                seatPanel.add(seatButton[i][j]);
//                availableSeats.add(seatButton[i][j]); // Add all seats as initially available
            }
        }
        
        seatButton[1][2].setEnabled(false); seatButton[1][3].setEnabled(false);  seatButton[3][5].setEnabled(false);
        seatButton[3][6].setEnabled(false);


        
        frame.add(seatPanel, BorderLayout.CENTER);
        frame.setVisible(true);
        
        confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//            	 StringBuilder selectedSeatsText = new StringBuilder("Selected Seats:\n");
//                 for (JButton seat : availableSeats) {
//                     selectedSeatsText.append(seat.getText()).append("\n");
//                 }
//                 JOptionPane.showMessageDialog(frame, selectedSeatsText.toString());
//                 JOptionPane.showMessageDialog(frame, "Seats available: " + availableSeats.size());
            	
            	 int remainingSeats = seatButton.length * seatButton[0].length - availableSeats.size() - 4;
                 String message = "Selected Seats:\n";
                 for (JButton seat : availableSeats) {
                     message += seat.getText() + "\n";
                 }
                 message += "\nRemaining Seats: " + remainingSeats;
                 JOptionPane.showMessageDialog(frame, message);
            }
        });

        frame.add(seatPanel, BorderLayout.CENTER);
        frame.add(confirmButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
