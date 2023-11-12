import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class sortEventsTest {
    private JFrame frame;
    private JPanel eventsPanel;
    private LinkedList<EventPanel> eventPanels;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new test().createAndShowGUI());
    }

    /**
     * @wbp.parser.entryPoint
     */
    private void createAndShowGUI() {
        frame = new JFrame("Event Sorting App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        eventsPanel = new JPanel();
        frame.getContentPane().add(eventsPanel, BorderLayout.CENTER);

        JButton lblSortEvents = new JButton("Sort Events");
        lblSortEvents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortEventsByDate();
                refreshPanel();
            }
        });
        frame.getContentPane().add(lblSortEvents, BorderLayout.SOUTH);

        eventPanels = new LinkedList<>();
        // Add sample events
        eventPanels.add(new EventPanel("Event 1", "2023-11-15"));
        eventPanels.add(new EventPanel("Event 2", "2023-11-10"));
        eventPanels.add(new EventPanel("Event 3", "2023-11-20"));

        refreshPanel();

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void sortEventsByDate() {
        // Use selection sort algorithm to sort eventPanels based on date
        for (int i = 0; i < eventPanels.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < eventPanels.size(); j++) {
                if (eventPanels.get(j).getDate().compareTo(eventPanels.get(minIndex).getDate()) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            EventPanel temp = eventPanels.get(i);
            eventPanels.set(i, eventPanels.get(minIndex));
            eventPanels.set(minIndex, temp);
        }
    }

    private void refreshPanel() {
        eventsPanel.removeAll();
        for (EventPanel eventPanel : eventPanels) {
            eventsPanel.add(eventPanel);
        }
        frame.revalidate();
        frame.repaint();
    }

    private class EventPanel extends JPanel {
        private JLabel nameLabel;
        private JLabel dateLabel;

        public EventPanel(String name, String date) {
            nameLabel = new JLabel("Name: " + name);
            dateLabel = new JLabel("Date: " + date);

            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            add(nameLabel);
            add(dateLabel);
        }

        public String getDate() {
            return dateLabel.getText().substring(6); // Assuming date format is "Date: YYYY-MM-DD"
        }
    }
}
