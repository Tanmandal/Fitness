import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class HealthAppHome extends JFrame {

    public HealthAppHome() {

        setTitle("Fitness App");
        setSize(300, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);


        JLabel greetingLabel = new JLabel("Good Morning 🔥");
        greetingLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        greetingLabel.setBounds(10, 10, 200, 20);
        add(greetingLabel);

        JTextField nameField = new JTextField("Pramuditya Uzumaki");
        nameField.setFont(new Font("Arial", Font.BOLD, 16));
        nameField.setBounds(10, 30, 250, 30);
        nameField.setBorder(null);
        add(nameField);


        JTextField searchField = new JTextField("Search");
        searchField.setBounds(10, 70, 280, 30);
        searchField.setForeground(Color.GRAY);
        searchField.setBorder(null);


        searchField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchField.getText().equals("Search")) {
                    searchField.setText("");
                    searchField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchField.getText().isEmpty()) {
                    searchField.setText("Search");
                    searchField.setForeground(Color.GRAY);
                }
            }
        });
        add(searchField);


        JLabel popularLabel = new JLabel("Popular Workouts");
        popularLabel.setFont(new Font("Arial", Font.BOLD, 14));
        popularLabel.setBounds(10, 110, 200, 20);
        add(popularLabel);


        JPanel workoutScrollPanel = new JPanel();
        workoutScrollPanel.setLayout(new BoxLayout(workoutScrollPanel, BoxLayout.X_AXIS));
        workoutScrollPanel.setBorder(BorderFactory.createEmptyBorder());

        JPanel workout1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("lower_body_training.png");
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        workout1.setPreferredSize(new Dimension(180, 120));
        workout1.setLayout(null);

        JLabel workout1Title = new JLabel("Lower Body");
        workout1Title.setBounds(10, 10, 100, 20);
        workout1Title.setForeground(Color.white);
        workout1.add(workout1Title);

        JLabel workout1Kcal = new JLabel("500 Kcal");
        workout1Kcal.setBounds(10, 40, 80, 20);
        workout1Kcal.setForeground(Color.white);
        workout1.add(workout1Kcal);

        JLabel workout1Time = new JLabel("50 Min");
        workout1Time.setBounds(10, 60, 80, 20);
        workout1Time.setForeground(Color.white);
        workout1.add(workout1Time);

        JButton workout1Play = new JButton(new ImageIcon("play.png"));
        workout1Play.setBounds(130, 40, 40, 40);
        workout1Play.setContentAreaFilled(false);
        workout1Play.setOpaque(false);
        workout1Play.setBorderPainted(false);
        workout1Play.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Starting Lower Body Training...");
        });
        workout1.add(workout1Play);

        workoutScrollPanel.add(workout1);


        JPanel workout2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("hand_training.png");
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        workout2.setPreferredSize(new Dimension(180, 120));
        workout2.setLayout(null);

        JLabel workout2Title = new JLabel("Hand Training");
        workout2Title.setBounds(10, 10, 100, 20);
        workout2Title.setForeground(Color.white);
        workout2.add(workout2Title);

        JLabel workout2Kcal = new JLabel("600 Kcal");
        workout2Kcal.setBounds(10, 40, 80, 20);
        workout2Kcal.setForeground(Color.white);
        workout2.add(workout2Kcal);

        JLabel workout2Time = new JLabel("40 Min");
        workout2Time.setBounds(10, 60, 80, 20);
        workout2Time.setForeground(Color.white);
        workout2.add(workout2Time);

        JButton workout2Play = new JButton(new ImageIcon("play.png"));
        workout2Play.setBounds(130, 40, 40, 40);
        workout2Play.setContentAreaFilled(false);
        workout2Play.setOpaque(false);
        workout2Play.setBorderPainted(false);
        workout2Play.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Starting Lower Body Training...");
        });
        workout2.add(workout2Play);

        workoutScrollPanel.add(workout2);


        JScrollPane workoutScrollPane = new JScrollPane(workoutScrollPanel);
        workoutScrollPane.setBounds(10, 140, 280, 130);
        workoutScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        workoutScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        workoutScrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
        add(workoutScrollPane);


        JLabel todayPlanLabel = new JLabel("Today Plan");
        todayPlanLabel.setFont(new Font("Arial", Font.BOLD, 14));
        todayPlanLabel.setBounds(10, 280, 200, 20);
        add(todayPlanLabel);


        JPanel pushUpPanel = new JPanel();
        pushUpPanel.setBounds(10, 310, 280, 100);
        pushUpPanel.setBackground(Color.WHITE);
        pushUpPanel.setLayout(null);


        JLabel pushUpImage = new JLabel(new ImageIcon("Pushup.png"));
        pushUpImage.setBounds(10, 10, 40, 40);
        pushUpPanel.add(pushUpImage);


        JLabel pushUpLabel = new JLabel("Push Up");
        pushUpLabel.setBounds(60, 10, 100, 20);
        pushUpLabel.setFont(new Font("Arial", Font.BOLD, 16));
        pushUpPanel.add(pushUpLabel);

        JLabel pushUpInfo = new JLabel("100 Push up a day");
        pushUpInfo.setBounds(60, 35, 150, 20);
        pushUpInfo.setForeground(Color.GRAY);
        pushUpPanel.add(pushUpInfo);


        JProgressBar pushUpProgress = new JProgressBar();
        pushUpProgress.setValue(45);
        pushUpProgress.setBounds(60, 60, 200, 20);
        pushUpProgress.setString("45%");
        pushUpProgress.setStringPainted(true);
        pushUpProgress.setForeground(Color.GREEN);
        pushUpPanel.add(pushUpProgress);
        add(pushUpPanel);



        JPanel sitUpPanel = new JPanel();
        sitUpPanel.setBounds(10, 400, 280, 100);
        sitUpPanel.setBackground(Color.WHITE);
        sitUpPanel.setLayout(null);


        JLabel sitUpImage = new JLabel(new ImageIcon("situp.png"));
        sitUpImage.setBounds(10, 10, 40, 40);
        sitUpPanel.add(sitUpImage);


        JLabel sitUpLabel = new JLabel("Sit Up");
        sitUpLabel.setBounds(60, 10, 100, 20);
        sitUpLabel.setFont(new Font("Arial", Font.BOLD, 16));
        sitUpPanel.add(sitUpLabel);


        JLabel sitUpInfo = new JLabel("20 Sit up a day");
        sitUpInfo.setBounds(60, 35, 150, 20);
        sitUpInfo.setForeground(Color.GRAY);
        sitUpPanel.add(sitUpInfo);


        JProgressBar sitUpProgress = new JProgressBar();
        sitUpProgress.setValue(75);
        sitUpProgress.setBounds(60, 60, 200, 20);
        sitUpProgress.setString("75%");
        sitUpProgress.setStringPainted(true);
        sitUpProgress.setForeground(Color.GREEN);
        sitUpPanel.add(sitUpProgress);


        add(sitUpPanel);


        JPanel navBar = new JPanel();
        navBar.setLayout(null);
        navBar.setBounds(0, 590, 300, 80);
        navBar.setBackground(Color.decode("#000000"));


        JButton homeButton = new JButton(new ImageIcon("HomeTextIcon.png"));
        homeButton.setBounds(5, 3, 105, 50);
        homeButton.setBackground(Color.decode("#000000"));
        homeButton.setFocusPainted(false);
        homeButton.setBorderPainted(false);



        homeButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Home button clicked");
        });
        navBar.add(homeButton);


        JButton rocketButton = new JButton(new ImageIcon("ExploreIcon.png"));
        rocketButton.setBounds(120, 3, 50, 50);
        rocketButton.setBackground(Color.decode("#000000"));
        rocketButton.setFocusPainted(false);
        rocketButton.setBorderPainted(false);


        rocketButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Rocket button clicked");
        });
        navBar.add(rocketButton);


        JButton statsButton = new JButton(new ImageIcon("AnalyticsIcon.png"));
        statsButton.setBounds(175, 3, 50, 50);
        statsButton.setBackground(Color.decode("#000000"));
        statsButton.setFocusPainted(false);
        statsButton.setBorderPainted(false);


        statsButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Stats button clicked");
        });
        navBar.add(statsButton);


        JButton profileButton = new JButton(new ImageIcon("ProfileIcon.png"));
        profileButton.setBounds(230, 3, 50, 50);
        profileButton.setBackground(Color.decode("#000000"));
        profileButton.setFocusPainted(false);
        profileButton.setBorderPainted(false);


        profileButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Profile button clicked");
        });
        navBar.add(profileButton);
        add(navBar);


        setVisible(true);
    }

    public static void main(String[] args) {
        new HealthAppHome();
    }
}
