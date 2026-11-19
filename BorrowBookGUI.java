import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorrowBookGUI extends JFrame implements ActionListener
{
    private JLabel lblStudent;
    private JLabel lblBook;
    private JLabel lblInfo;
    private JLabel lblBorrowInfo;

    private JComboBox cboStudent;
    private JComboBox cboBook;

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

        lblBorrowInfo = new JLabel("");
        lblBorrowInfo.setBounds(10, 240, 550, 20);

        // Student objects
        Student student1 = new Student(
            "Ali Imran", "A123456"
        );

        Student student2 = new Student(
            "Siti Aminah", "A147895"
        );

        Student student3 = new Student(
            "Abu Bakar", "A112365"
        );

        // Student ComboBox
        cboStudent = new JComboBox();

        cboStudent.addItem(student1);
        cboStudent.addItem(student2);
        cboStudent.addItem(student3);

        cboStudent.setBounds(170, 20, 300, 25);

        // Book objects
        Book book1 = new Book(
            "Harry Potter", "J K Rowling"
        );

        Book book2 = new Book(
            "Lord of The Ring", "J R R Tolkien"
        );

        Book book3 = new Book(
            "The Secret of Lost Stone", "Melissa Payne"
        );

        // Book ComboBox
        cboBook = new JComboBox();

        cboBook.addItem(book1);
        cboBook.addItem(book2);
        cboBook.addItem(book3);

        cboBook.setBounds(170, 50, 330, 25);

        // Borrow Button
        btnBorrow = new JButton("Borrow");
        btnBorrow.setBounds(140, 85, 80, 25);

        // Add Components
        pane.add(lblStudent);
        pane.add(lblBook);
        pane.add(lblInfo);
        pane.add(lblBorrowInfo);

        pane.add(cboStudent);
        pane.add(cboBook);

        pane.add(btnBorrow);

        // Register event listener
        btnBorrow.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnBorrow)
        {
            Student student =
                (Student)cboStudent.getSelectedItem();

            Book book =
                (Book)cboBook.getSelectedItem();

            // Borrow selected book
            book.borrowBy(student);

            // Display borrow information
            lblBorrowInfo.setText(
                student.getName() +
                " with matric number " +
                student.getMatric() +
                " has borrow a book with title " +
                book.getTitle() + "."
            );
        }
    }

    public static void main(String[] args)
    {
        BorrowBookGUI frame = new BorrowBookGUI();

        frame.setTitle("Borrow Book");
        frame.setSize(600, 330);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        frame.setVisible(true);
    }
}