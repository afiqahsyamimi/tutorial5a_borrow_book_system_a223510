import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddStudentInfoGUI extends JFrame implements ActionListener
{
    private JLabel lblName;
    private JLabel lblMatric;
    private JLabel lblStudents;

    private JTextField txtName;
    private JTextField txtMatric;

    private JButton btnAdd;
    private JButton btnList;

    private JTextArea txtStudents;

    private Student[] students;
    private int studentCount;

    public AddStudentInfoGUI()
    {
        students = new Student[10];
        studentCount = 0;

        Container pane = getContentPane();
        pane.setLayout(null);

        // Labels
        lblName = new JLabel("Name:");
        lblName.setBounds(30, 30, 80, 20);

        lblMatric = new JLabel("Matric:");
        lblMatric.setBounds(30, 55, 80, 20);

        lblStudents = new JLabel("Students:");
        lblStudents.setBounds(30, 120, 100, 20);

        // Text Fields
        txtName = new JTextField();
        txtName.setBounds(170, 30, 170, 20);

        txtMatric = new JTextField();
        txtMatric.setBounds(170, 55, 170, 20);

        // Buttons
        btnAdd = new JButton("Add");
        btnAdd.setBounds(130, 85, 70, 25);

        btnList = new JButton("List");
        btnList.setBounds(210, 85, 70, 25);

        // Text Area
        txtStudents = new JTextArea();
        txtStudents.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(txtStudents);
        scrollPane.setBounds(30, 145, 430, 90);

        // Add Components
        pane.add(lblName);
        pane.add(lblMatric);
        pane.add(lblStudents);

        pane.add(txtName);
        pane.add(txtMatric);

        pane.add(btnAdd);
        pane.add(btnList);

        pane.add(scrollPane);

        // Event Handling
        btnAdd.addActionListener(this);
        btnList.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnAdd)
        {
            String name = txtName.getText();
            String matric = txtMatric.getText();

            Student s = new Student(name, matric);

            students[studentCount] = s;
            studentCount++;

            txtName.setText("");
            txtMatric.setText("");
        }

        if(e.getSource() == btnList)
        {
            txtStudents.setText("");

            for(int i = 0; i < studentCount; i++)
            {
                Student s = students[i];

                txtStudents.append("Name : " + s.getName() + " (" + s.getMatric() + ")\n");
            }
        }
    }

    public static void main(String[] args)
    {
        AddStudentInfoGUI frame = new AddStudentInfoGUI();

        frame.setTitle("Add Student Info");
        frame.setSize(520, 320);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}