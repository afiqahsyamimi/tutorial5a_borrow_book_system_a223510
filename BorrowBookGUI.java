import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorrowBookGUI extends JFrame implements ActionListener
{
    private JLabel lblStudent;
    private JLabel lblBook;
    private JLabel lblInfo;
    private JLabel lblBorrowInfo;

    private JComboBox<String> cboStudent;
    private JComboBox<String> cboBook;

    private JButton btnBorrow;

    public BorrowBookGUI()
    {
        Container pane = getContentPane();
        pane.setLayout(null);

        // Labels
        lblStudent = new JLabel("Student Name & Matric:");
        lblStudent.setBounds(10, 20, 150, 20);

        lblBook = new JLabel("Book Title & Author:");
        lblBook.setBounds(10, 50, 150, 20);

        lblInfo = new JLabel("Borrow Information:");
        lblInfo.setBounds(10, 220, 150, 20);

        // Student ComboBox
        cboStudent = new JComboBox<String>();

        cboStudent.addItem("Ali Imran (A123456)");
        cboStudent.addItem("Siti Aminah (A147895)");
        cboStudent.addItem("Abu Bakar (A112365)");

        cboStudent.setBounds(170, 20, 300, 25);

        // Book ComboBox
        cboBook = new JComboBox<String>();

        cboBook.addItem("Harry Potter (J K Rowling)");
        cboBook.addItem("Lord of The Ring (J R R Tolkien)");
        cboBook.addItem("The Secret of Lost Stone (Melissa Payne)");

        cboBook.setBounds(170, 50, 300, 25);

        // Borrow Button
        btnBorrow = new JButton("Borrow");
        btnBorrow.setBounds(140, 85, 80, 25);

        // Borrow Information Output
        lblBorrowInfo = new JLabel("");
        lblBorrowInfo.setBounds(10, 240, 550, 20);

        // Add Components
        pane.add(lblStudent);
        pane.add(lblBook);
        pane.add(lblInfo);

        pane.add(cboStudent);
        pane.add(cboBook);

        pane.add(btnBorrow);

        pane.add(lblBorrowInfo);

        // Register event listener
        btnBorrow.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnBorrow)
        {
            String studentName = "";
            String matricNumber = "";
            String bookTitle = "";

            int student = cboStudent.getSelectedIndex();
            int book = cboBook.getSelectedIndex();

            // Determine selected student
            if(student == 0)
            {
                studentName = "Ali Imran";
                matricNumber = "A123456";
            }
            else if(student == 1)
            {
                studentName = "Siti Aminah";
                matricNumber = "A147895";
            }
            else if(student == 2)
            {
                studentName = "Abu Bakar";
                matricNumber = "A112365";
            }

            // Determine selected book
            if(book == 0)
            {
                bookTitle = "Harry Potter";
            }
            else if(book == 1)
            {
                bookTitle = "Lord of The Ring";
            }
            else if(book == 2)
            {
                bookTitle = "The Secret of Lost Stone";
            }

            // Display Borrow Information
            lblBorrowInfo.setText(
                studentName + " with matric number " +
                matricNumber + " has borrow a book with title " +
                bookTitle + "."
            );
        }
    }

    public static void main(String[] args)
    {
        BorrowBookGUI frame = new BorrowBookGUI();

        frame.setTitle("Borrow Book");
        frame.setSize(600, 330);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}