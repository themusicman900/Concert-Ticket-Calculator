/**
 *
 * @author nick
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TicketForm extends JFrame {


    private static final int FRAME_WIDTH = 370;
    private static final int FRAME_HEIGHT = 515;
    private static final int FRAME_X = 150;
    private static final int FRAME_Y = 250;

    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtNum3;
    private JTextField txtNum4;
    private JTextField txtNum5;
    private JTextField txtNum6;
    private JButton btnCount;
    private JButton btnCancel;
    private JTextArea txtOutput;
    
    private JLabel lblBottom;
    private JLabel lblPrompt1;
    private JLabel lblPrompt2;
    private JLabel lblPrompt3;
    private JLabel lblPrompt4;
    private JLabel lblPrompt5;
    

    // private variables
    private Boolean firstEdit;

    public static void main(String[] args) {
        TicketForm numCount = new TicketForm();
        numCount.setVisible(true);
        numCount.setResizable(false);
    }

    public TicketForm() {

        this.setTitle("Concert Ticket Calculator");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocation(FRAME_X, FRAME_Y);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        lblBottom = new JLabel();
        lblPrompt1 = new JLabel("Count");
        lblPrompt2 = new JLabel("Price ($)");
        lblPrompt3 = new JLabel("Enter For Seat A: ");
        lblPrompt4 = new JLabel("Enter For Seat B: ");
        lblPrompt5 = new JLabel("Enter For Seat C: ");
        
        firstEdit = true;
        
        

        btnCount = new JButton("Create Report");
        btnCount.setFont(new Font("Courier", Font.PLAIN, 14));
        btnCount.setLocation(50, 50);
        btnCount.setSize(200, 200);
        btnCount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            }
        });

        btnCancel = new JButton("Reset");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        btnCancel.setFont(new Font("Courier", Font.PLAIN, 14));
        btnCancel.setLocation(50, 50);
        btnCancel.setSize(200, 200);

        txtNum1 = new JTextField();
        txtNum1.setColumns(12);
        txtNum1.setFont(new Font("Courier", Font.PLAIN, 14));
        
        txtNum2 = new JTextField();
        txtNum2.setColumns(12);
        txtNum2.setFont(new Font("Courier", Font.PLAIN, 14));
        
        txtNum3 = new JTextField();
        txtNum3.setColumns(12);
        txtNum3.setFont(new Font("Courier", Font.PLAIN, 14));
        
        txtNum4 = new JTextField();
        txtNum4.setColumns(12);
        txtNum4.setFont(new Font("Courier", Font.PLAIN, 14));
        
        txtNum5 = new JTextField();
        txtNum5.setColumns(12);
        txtNum5.setFont(new Font("Courier", Font.PLAIN, 14));
        
        txtNum6 = new JTextField();
        txtNum6.setColumns(12);
        txtNum6.setFont(new Font("Courier", Font.PLAIN, 14));

        txtOutput = new JTextArea();
        txtOutput.setBorder(BorderFactory.createTitledBorder("Report"));
        txtOutput.setColumns(35);
        txtOutput.setRows(20);
        txtOutput.setFont(new Font("Courier", Font.BOLD, 10));
        txtOutput.setEditable(false);
        txtOutput.setLineWrap(true);
        txtOutput.setWrapStyleWord(true);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        this.add(contentPanel);

        // construct inputPanel JPanel to hold input controls
        JPanel inputPanel = new JPanel();
        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter Data"));
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.LINE_AXIS));
        
        
        inputPanel.add(lblPrompt1);
        inputPanel.add(lblPrompt2);
        
        inputPanel.add(lblPrompt3);
        inputPanel.add(txtNum1);
        inputPanel.add(txtNum2);
        
        inputPanel.add(lblPrompt4);
        inputPanel.add(txtNum3);
        inputPanel.add(txtNum4);
        
        inputPanel.add(lblPrompt5);
        inputPanel.add(txtNum5);
        inputPanel.add(txtNum6);
        
        
        
        // construct the outputPanel JPanel to hold output controls
        JPanel outputPanel = new JPanel();
        outputPanel.add(lblBottom);
        outputPanel.add(txtOutput);

        // construct buttonPanel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnCount);
        buttonPanel.add(btnCancel);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
        
        //setting the layout for the app
        contentPanel.add(inputPanel, BorderLayout.NORTH);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);
        contentPanel.add(outputPanel, BorderLayout.CENTER);
        

    }


        // ------------------------------------------- event handlers
    public void actionPerformed(ActionEvent event) {

        if ((event.getSource() == btnCount) || (event.getSource() == txtNum1)) {
            // click ok or enter on textfield
            if (firstEdit == true){
                txtOutput.setText(txtNum1.getText() + " ");
                firstEdit = false;
            } else {
                txtOutput.append(txtNum1.getText() + " ");
            }
        } else {
            // click reset
            txtNum1.setText("");
            txtNum1.requestFocusInWindow();
            firstEdit = true;
        }
        
        
         if ((event.getSource() == btnCount) || (event.getSource() == txtNum2)) {
            // click ok or enter on textfield
            if (firstEdit == true){
                txtOutput.setText(txtNum2.getText() + " ");
                firstEdit = false;
            } else {
                txtOutput.append(txtNum2.getText() + " ");
            }
        } else {
            // click reset
            txtNum2.setText("");
            txtNum2.requestFocusInWindow();
            firstEdit = true;
        }
        
          if ((event.getSource() == btnCount) || (event.getSource() == txtNum3)) {
            // click ok or enter on textfield
            if (firstEdit == true){
                txtOutput.setText(txtNum3.getText() + " ");
                firstEdit = false;
            } else {
                txtOutput.append(txtNum3.getText() + " ");
            }
        } else {
            // click reset
            txtNum3.setText("");
            txtNum3.requestFocusInWindow();
            firstEdit = true;
        }
         
          if ((event.getSource() == btnCount) || (event.getSource() == txtNum4)) {
            // click ok or enter on textfield
            if (firstEdit == true){
                txtOutput.setText(txtNum4.getText() + " ");
                firstEdit = false;
            } else {
                txtOutput.append(txtNum4.getText() + " ");
            }
        } else {
            // click reset
            txtNum4.setText("");
            txtNum4.requestFocusInWindow();
            firstEdit = true;
        }
          
           if ((event.getSource() == btnCount) || (event.getSource() == txtNum5)) {
            // click ok or enter on textfield
            if (firstEdit == true){
                txtOutput.setText(txtNum5.getText() + " ");
                firstEdit = false;
            } else {
                txtOutput.append(txtNum5.getText() + " ");
            }
        } else {
            // click reset
            txtNum5.setText("");
            txtNum5.requestFocusInWindow();
            firstEdit = true;
        }
          
           if ((event.getSource() == btnCount) || (event.getSource() == txtNum6)) {
            // click ok or enter on textfield
            if (firstEdit == true){
                txtOutput.setText(txtNum6.getText() + " ");
                firstEdit = false;
            } else {
                txtOutput.append(txtNum6.getText() + " ");
            }
        } else {
            // click reset
            txtNum6.setText("");
            txtNum6.requestFocusInWindow();
            firstEdit = true;
        }
          
          
         
    }
    

    }
