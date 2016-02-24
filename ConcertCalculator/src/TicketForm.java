/**
 *
 * @author Nicholas Bollong
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.java.dev.designgridlayout.DesignGridLayout;


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
    private JScrollPane outputPanel;
    
    private JLabel lblBottom;
    private JLabel lblPrompt1;
    private JLabel lblPrompt2;
    private JLabel lblPrompt3;
    private JLabel lblPrompt4;
    private JLabel lblPrompt5;
    
    DesignGridLayout layout;
    ReportPrice reportPrice = new ReportPrice(this);

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
        lblPrompt1 = new JLabel("                                       Count");
        lblPrompt2 = new JLabel("                    Price ($)");
        lblPrompt3 = new JLabel("Enter For Seat A:");
        lblPrompt4 = new JLabel("Enter For Seat B:");
        lblPrompt5 = new JLabel("Enter For Seat C:");
        
        firstEdit = true;
       
        btnCount = new JButton("Create Report");
        btnCount.setFont(new Font("Courier", Font.BOLD, 14));
        btnCount.setLocation(50, 50);
        btnCount.setSize(200, 200);
        btnCount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txtOutput.setText(reportPrice.getReport());
            }
        });

        btnCancel = new JButton("Reset");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtNum3.setText("");
                txtNum4.setText("");
                txtNum5.setText("");
                txtNum6.setText("");
                txtOutput.setText("");
            }
        });
        btnCancel.setFont(new Font("Courier", Font.BOLD, 14));
        btnCancel.setLocation(50, 50);
        btnCancel.setSize(200, 200);

        txtNum1 = new JTextField();
        txtNum1.setColumns(12);
        txtNum1.setFont(new Font("Mono", Font.PLAIN, 14));
        
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
        txtOutput.setColumns(54);
        txtOutput.setRows(18);
        txtOutput.setFont(new Font("Monospaced", Font.BOLD, 12));
        txtOutput.setEditable(false);
        txtOutput.setLineWrap(true);
        txtOutput.setWrapStyleWord(true);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        this.add(contentPanel);

        // construct inputPanel JPanel to hold input controls
        JPanel inputPanel = new JPanel();
        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter Data"));
        layout = new DesignGridLayout(inputPanel);
       
        layout.row().grid().add(lblPrompt1).add(lblPrompt2);
        layout.row().grid().add(lblPrompt3).add(txtNum1).add(txtNum2);
        layout.row().grid().add(lblPrompt4).add(txtNum3).add(txtNum4);
        layout.row().grid().add(lblPrompt5).add(txtNum5).add(txtNum6); 
        
        
        // construct the outputPanel JPanel to hold output controls
        outputPanel = new JScrollPane(txtOutput);
        

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

    public JTextField getTxtNum1() {
        return txtNum1;
    }

    public JTextField getTxtNum2() {
        return txtNum2;
    }

    public JTextField getTxtNum3() {
        return txtNum3;
    }

    public JTextField getTxtNum4() {
        return txtNum4;
    }

    public JTextField getTxtNum5() {
        return txtNum5;
    }

    public JTextField getTxtNum6() {
        return txtNum6;
    }


          
          
         
    }
    


