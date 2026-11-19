import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddBookInfoGUI extends JFrame implements ActionListener
{
    private JLabel lblTitle;
    private JLabel lblAuthor;
    private JLabel lblBooks;
    
    private JTextField txtTitle;
    private JTextField txtAuthor;

    private JButton btnAdd;
    private JButton btnList;

    private JTextArea txtBooks;

    private Book[] books;
    private int bookCount;

    public AddBookInfoGUI()
    {
        books = new Book[10];
        bookCount = 0;

        Container pane = getContentPane();
        pane.setLayout(null);

        // Labels
        lblTitle = new JLabel("Book Title:");
        lblTitle.setBounds(30,30,100,20);

        lblAuthor = new JLabel("Author:");
        lblAuthor.setBounds(30,55,100,20);

        lblBooks = new JLabel("Books:");
        lblBooks.setBounds(30,120,100,20);

        // TextFields
        txtTitle = new JTextField();
        txtTitle.setBounds(170,30,170,20);

        txtAuthor = new JTextField();
        txtAuthor.setBounds(170,55,170,20);

        // Buttons
        btnAdd = new JButton("Add");
        btnAdd.setBounds(130,85,70,25);

        btnList = new JButton("List");
        btnList.setBounds(210,85,70,25);

        // TextArea
        txtBooks = new JTextArea();
        txtBooks.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(txtBooks);

        scrollPane.setBounds(30,145,430,90);

        // Add Components
        pane.add(lblTitle);
        pane.add(lblAuthor);
        pane.add(lblBooks);

        pane.add(txtTitle);
        pane.add(txtAuthor);

        pane.add(btnAdd);
        pane.add(btnList);

        pane.add(scrollPane);

        btnAdd.addActionListener(this);
        btnList.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnAdd)
        {
            String title = txtTitle.getText();

            String author = txtAuthor.getText();

            Book b = new Book(title, author);

            books[bookCount] = b;
            bookCount++;

            txtTitle.setText("");
            txtAuthor.setText("");
        }

        if(e.getSource() == btnList)
        {
            txtBooks.setText("");

            for(Book b : books)
            {
                txtBooks.append("Book title : " + b.getTitle() + " (Author : " + b.getAuthor() + ")\n");
            }
        }
    }

    public static void main(String[] args)
    {
        AddBookInfoGUI frame = new AddBookInfoGUI();

        frame.setTitle("Add Book Info");
        frame.setSize(520,320);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
