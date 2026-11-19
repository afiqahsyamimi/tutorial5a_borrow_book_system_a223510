/*
TUTORIAL 5A
STUDENT NAME: AFIQAH SYAMIMI BINTI MOHD SOUFI
MATRIC NUMBER: A223510
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenuGUI extends JFrame implements ActionListener
{
    private JLabel lblTitle;
    private JButton btnStudent;
    private JButton btnBook;
    private JButton btnBorrow;

    public MainMenuGUI()
    {
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();

        lblTitle = new JLabel("~~ BORROW BOOK SYSTEM ~~");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 14));

        titlePanel.add(lblTitle);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,1,0,10));

        btnStudent = new JButton("Add Student Info");
        btnBook = new JButton("Add Book Info");
        btnBorrow = new JButton("Borrow Book");

        btnStudent.setPreferredSize(new Dimension(180,40));
        btnBook.setPreferredSize(new Dimension(180,40));
        btnBorrow.setPreferredSize(new Dimension(180,40));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.add(btnStudent);
        p2.add(btnBook);
        p3.add(btnBorrow);

        buttonPanel.add(p1);
        buttonPanel.add(p2);
        buttonPanel.add(p3);

        pane.add(titlePanel, BorderLayout.NORTH);
        pane.add(buttonPanel, BorderLayout.CENTER);

        btnStudent.addActionListener(this);
        btnBook.addActionListener(this);
        btnBorrow.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnStudent)
        {
            JOptionPane.showMessageDialog(this,"Add Student Info");
        }

        else if(e.getSource()==btnBook)
        {
            JOptionPane.showMessageDialog(this,"Add Book Info");
        }

        else if(e.getSource()==btnBorrow)
        {
            JOptionPane.showMessageDialog(this,"Borrow Book");
        }
    }

    public static void main(String[] args)
    {
        MainMenuGUI frame = new MainMenuGUI();

        frame.setTitle("Main Menu");
        frame.setSize(250,230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
