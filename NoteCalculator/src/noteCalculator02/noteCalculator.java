/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noteCalculator02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author RawaaMoh
 */
public class noteCalculator extends JFrame {

    private JTextField txtMidterm = new JTextField();
    private JTextField txtFinal = new JTextField();
    private JTextField txtLab = new JTextField();
    private JTextField txtTerm = new JTextField();
    private JTextField txtLetter = new JTextField();

    private JButton btnCalculate = new JButton("Calculate");

    private Random rn = new Random();

    public noteCalculator() {

        JPanel panel01 = new JPanel(new GridLayout(5, 2));

        panel01.setBorder(new TitledBorder("Enter Midterm, Final, Lab notes:"));
        
        panel01.add(new JLabel("Midterm note :"));
        panel01.add(txtMidterm);
        panel01.add(new JLabel("Final note :"));
        panel01.add(txtFinal);
        panel01.add(new JLabel("Lab note :"));
        panel01.add(txtLab);
        panel01.add(new JLabel("Term note :"));
        panel01.add(txtTerm);
        panel01.add(new JLabel("Letter note :"));
        panel01.add(txtLetter);
        
        txtTerm.setEditable(false);
        txtLetter.setEditable(false);

        JPanel panel02 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel02.add(btnCalculate);

        add(panel01, BorderLayout.CENTER);
        add(panel02, BorderLayout.SOUTH);

        this.setFocusable(true);

        btnCalculate.addActionListener(new ButtonListener());
        btnCalculate.addMouseListener(new MouseListner());

        this.addWindowListener(new WindowListener());
        this.addKeyListener(new keyListener());

    }

    private class keyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
//            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_R) {
                txtMidterm.setText(Integer.toString(rn.nextInt(101)));
                txtFinal.setText(Integer.toString(rn.nextInt(101)));
                txtLab.setText(Integer.toString(rn.nextInt(101)));
            }
        }

        @Override
        public void keyReleased(KeyEvent ke) {
//            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    private class WindowListener extends WindowAdapter {

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("The Program Iconified");
            txtMidterm.setText(Integer.parseInt(txtMidterm.getText().trim()) - 10 + "");
        }
        
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Closing..");
        }

    }

    private class MouseListner extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            btnCalculate.setForeground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btnCalculate.setForeground(null);
        }

    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            double midterm = Double.parseDouble(txtMidterm.getText());
            int Final = Integer.parseInt(txtFinal.getText());
            double lab = Double.parseDouble(txtLab.getText());

            student stu = new student(midterm, Final, lab);

            txtTerm.setText(String.format("%.2f", stu.getTermNote()));
            txtLetter.setText(stu.getLetterNote());

        }

    }

    public static void main(String[] args) {
        noteCalculator frame = new noteCalculator();
        
        frame.pack();
        frame.setTitle("Note Calculator");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(350, 250);  

    }
}
