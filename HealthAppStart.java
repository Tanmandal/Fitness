import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HealthAppStart {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Health App Layout");
        frame.setSize(300, 680);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);
        frame.add(mainPanel, BorderLayout.CENTER);


        ImageIcon imageIcon = new ImageIcon("flash.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the image
        mainPanel.add(imageLabel);


        mainPanel.add(Box.createRigidArea(new Dimension(0, -4)));


        JLabel titleLabel = new JLabel("Wherever You Are");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);


        JLabel healthLabel = new JLabel("Health Is Number One");
        healthLabel.setFont(new Font("Arial", Font.BOLD, 18));
        healthLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(healthLabel);


        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));


        JLabel subtitleLabel = new JLabel("There is no instant way to a healthy life");
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        subtitleLabel.setForeground(Color.GRAY);
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(subtitleLabel);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        ImageIcon buttonIcon2 = new ImageIcon("shiftbar.png");
        JButton imageButton2 = new JButton(buttonIcon2);


       imageButton2.setBorderPainted(false);
       imageButton2.setFocusPainted(false);
       imageButton2.setContentAreaFilled(false);


       imageButton2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               JOptionPane.showMessageDialog(frame, "Image button2 clicked!");
           }
       });
       imageButton2.setAlignmentX(Component.CENTER_ALIGNMENT);
       mainPanel.add(imageButton2);


        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        ImageIcon buttonIcon = new ImageIcon("getstarted.png");
        JButton imageButton = new JButton("Get Started", buttonIcon);


        imageButton.setHorizontalTextPosition(JButton.CENTER);
        imageButton.setVerticalTextPosition(JButton.CENTER);
        imageButton.setFont(new Font("Arial", Font.BOLD, 16));
        imageButton.setForeground(Color.WHITE);


        imageButton.setBorderPainted(false);
        imageButton.setFocusPainted(false);
        imageButton.setContentAreaFilled(false);


        imageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "Image button clicked!");
            }
        });


        imageButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(imageButton);



        frame.setVisible(true);
    }
}
