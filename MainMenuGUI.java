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

        pane.setLayout(new GridLayout(4,1,10,10));

        lblTitle = new JLabel("~~ BORROW BOOK SYSTEM ~~", SwingConstants.CENTER);

        btnStudent = new JButton("Add Student Info");

        btnBook = new JButton("Add Book Info");

        btnBorrow = new JButton("Borrow Book");

        pane.add(lblTitle);
        pane.add(btnStudent);
        pane.add(btnBook);
        pane.add(btnBorrow);

        btnStudent.addActionListener(this);
        btnBook.addActionListener(this);
        btnBorrow.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnStudent)
        {
            JOptionPane.showMessageDialog(this,"Open Add Student Info GUI");
        }

        else if(e.getSource() == btnBook)
        {
            JOptionPane.showMessageDialog(this,"Open Add Book Info GUI");
        }

        else if(e.getSource() == btnBorrow)
        {
            JOptionPane.showMessageDialog(this,
"Open Borrow Book GUI");
        }
    }

    public static void main(String[] args)
    {
        MainMenuGUI frame = new MainMenuGUI();

        frame.setTitle("Main Menu");
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}