import javax.swing.*;
import java.awt.*;

public class HealthExplore {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Fitness App");
        frame.setSize(300, 680);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.decode("#F5F5F5"));
        mainPanel.setBounds(0, 0, 300, 800);


        JLabel headerLabel = new JLabel(new ImageIcon("ExploreHeader.png")); // replace with image path
        headerLabel.setBounds(20, 20, 260, 120);
        mainPanel.add(headerLabel);


        JLabel bestForYouLabel = new JLabel("Best for you");
        bestForYouLabel.setFont(new Font("Arial", Font.BOLD, 14));
        bestForYouLabel.setBounds(20, 150, 200, 30);
        mainPanel.add(bestForYouLabel);


        JPanel bestForYouPanel = new JPanel();
        bestForYouPanel.setLayout(new GridLayout(2, 2, 10, 10));
        bestForYouPanel.setBackground(Color.decode("#F5F5F5"));


        bestForYouPanel.add(createWorkoutCard("Belly fat burner", "10 min", "Beginner", "BellyFatBurner.png", 200, 90));
        bestForYouPanel.add(createWorkoutCard("Lose Fat", "10 min", "Beginner", "LoseFat.png", 200, 90));
        bestForYouPanel.add(createWorkoutCard("Plank", "5 min", "Expert", "Plank.png", 200, 90));
        bestForYouPanel.add(createWorkoutCard("Build Muscle", "30 min", "Intermediate", "Biceps.png", 200, 90));


        JScrollPane bestForYouScrollPane = new JScrollPane(bestForYouPanel, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        bestForYouScrollPane.setBounds(20, 180, 260, 180);
        bestForYouScrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
        mainPanel.add(bestForYouScrollPane);


        JLabel challengeLabel = new JLabel("Challenge");
        challengeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        challengeLabel.setBounds(20, 360, 200, 30);
        mainPanel.add(challengeLabel);


        JPanel challengePanel = new JPanel();
        challengePanel.setLayout(new GridLayout(1, 3, 10, 10));
        challengePanel.setBounds(20, 390, 260, 80);


        JButton plankChallengeButton = new JButton(new ImageIcon("PlankChallenge.png")); // replace with image path
        plankChallengeButton.setText("");
        plankChallengeButton.setBackground(Color.decode("#FFFFFF"));
        plankChallengeButton.setFocusPainted(false);
        plankChallengeButton.setBorderPainted(false);
        plankChallengeButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Plank Challenge clicked"));
        challengePanel.add(plankChallengeButton);

        JButton sprintChallengeButton = new JButton(new ImageIcon("SprintChallenge.png"));
        sprintChallengeButton.setText("");
        sprintChallengeButton.setBackground(Color.decode("#FFFFFF"));
        sprintChallengeButton.setFocusPainted(false);
        sprintChallengeButton.setBorderPainted(false);
        sprintChallengeButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Sprint Challenge clicked"));
        challengePanel.add(sprintChallengeButton);

        JButton squatChallengeButton = new JButton(new ImageIcon("SquatChallenge.png"));
        squatChallengeButton.setText("");
        squatChallengeButton.setBackground(Color.decode("#FFFFFF"));
        squatChallengeButton.setFocusPainted(false);
        squatChallengeButton.setBorderPainted(false);
        squatChallengeButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Squat Challenge clicked"));
        challengePanel.add(squatChallengeButton);

        mainPanel.add(challengePanel);


        JLabel fastWarmupLabel = new JLabel("Fast Warmup");
        fastWarmupLabel.setFont(new Font("Arial", Font.BOLD, 14));
        fastWarmupLabel.setBounds(20, 480, 200, 30);
        mainPanel.add(fastWarmupLabel);

        JPanel fastWarmupPanel = new JPanel();
        fastWarmupPanel.setLayout(new GridLayout(1, 2, 10, 10));
        fastWarmupPanel.setBackground(Color.decode("#F5F5F5"));

        fastWarmupPanel.add(createWorkoutCard("Leg exercises", "10 min", "Beginner", "legexerciseicon.png", 190, 70));
        fastWarmupPanel.add(createWorkoutCard("Backward lunges", "5 min", "Beginner", "backwardlungesicon.png", 190, 70));

        JScrollPane fastWarmupScrollPane = new JScrollPane(fastWarmupPanel, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        fastWarmupScrollPane.setBounds(20, 510, 260, 80); // Reduced height (half)
        fastWarmupScrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
        mainPanel.add(fastWarmupScrollPane);

        JPanel navBar = new JPanel();
          navBar.setLayout(null);
          navBar.setBounds(0, 590, 300, 80);
          navBar.setBackground(Color.decode("#000000"));


          JButton homeButton = new JButton(new ImageIcon("Homeicon.png"));
          homeButton.setBounds(5, 3, 50, 50);
          homeButton.setBackground(Color.decode("#000000"));
          homeButton.setFocusPainted(false);
          homeButton.setBorderPainted(false);


          homeButton.addActionListener(e -> {
              JOptionPane.showMessageDialog(frame, "Home button clicked");
          });
          navBar.add(homeButton);


          JButton exploreButton = new JButton(new ImageIcon("ExploreTextIcon.png"));
          exploreButton.setBounds(70, 3, 105, 50);
          exploreButton.setBackground(Color.decode("#000000"));
          exploreButton.setFocusPainted(false);
          exploreButton.setBorderPainted(false);


          exploreButton.addActionListener(e -> {
              JOptionPane.showMessageDialog(frame, "Explore button clicked");
          });
          navBar.add(exploreButton);


          JButton analyticsButton = new JButton(new ImageIcon("AnalyticsIcon.png"));
          analyticsButton.setBounds(175, 3, 50, 50);
          analyticsButton.setBackground(Color.decode("#000000"));
          analyticsButton.setFocusPainted(false);
          analyticsButton.setBorderPainted(false);


          analyticsButton.addActionListener(e -> {
              JOptionPane.showMessageDialog(frame, "analytics button clicked");
          });
          navBar.add(analyticsButton);


          JButton profileButton = new JButton(new ImageIcon("ProfileIcon.png"));
          profileButton.setBounds(230, 3, 50, 50);
          profileButton.setBackground(Color.decode("#000000"));
          profileButton.setFocusPainted(false);
          profileButton.setBorderPainted(false);


          profileButton.addActionListener(e -> {
              JOptionPane.showMessageDialog(frame, "Profile button clicked");
          });
          navBar.add(profileButton);

          mainPanel.add(navBar);


          frame.add(mainPanel);
          frame.setVisible(true);

    }


    private static JPanel createWorkoutCard(String title, String duration, String level, String iconPath, int width, int height) {
        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new BorderLayout(10, 10));
        cardPanel.setBackground(Color.WHITE);
        cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        cardPanel.setPreferredSize(new Dimension(width, height));


        JLabel iconLabel = new JLabel(new ImageIcon(iconPath));
        iconLabel.setPreferredSize(new Dimension(60, 60));
        cardPanel.add(iconLabel, BorderLayout.WEST);


        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setOpaque(false);


        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 12));
        textPanel.add(titleLabel);


        JLabel durationLabel = new JLabel(duration);
        durationLabel.setFont(new Font("Arial", Font.PLAIN, 9));
        durationLabel.setForeground(Color.GRAY);
        textPanel.add(durationLabel);


        JLabel levelLabel = new JLabel(level);
        levelLabel.setFont(new Font("Arial", Font.PLAIN, 9));
        levelLabel.setForeground(Color.GRAY);
        textPanel.add(levelLabel);


        cardPanel.add(textPanel, BorderLayout.CENTER);

        return cardPanel;
    }
}
