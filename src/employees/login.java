package employees;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

 class login implements ActionListener {

        JFrame f;
        JLabel l1, l2;
        JTextField t1;
        JPasswordField t2;
        JButton b1, b2;

        login() {

            f = new JFrame("Login");

            f.setBackground(Color.white);

            l1 = new JLabel("Username");
            l1.setBounds(40, 20, 100, 30);
            f.add(l1);

            l2 = new JLabel("Password");
            l2.setBounds(40, 70, 100, 30);
            f.add(l2);

            t1=new JTextField();
            t1.setBounds(150, 20, 150, 30);
            f.add(t1);

            t2=new JPasswordField();
            t2.setBounds(150, 70, 150, 30);
            f.add(t2);

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/avatar.png"));
            Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel l3 = new JLabel(i3);
            l3.setBounds(350, 20, 150, 150);
            f.add(l3);

            b1 = new JButton("Login");
            b1.setBounds(40, 140, 120, 30);
            b1.setFont(new Font("times", Font.BOLD,15));
            b1.addActionListener(this);
            b1.setBackground(Color.BLUE);
            b2.setForeground(Color.WHITE);
            f.add(b2);

            b2 = new JButton("Cancel");
            b1.setBounds(180, 140, 120, 30);
            b1.setFont(new Font("times", Font.BOLD,15));
            b2.addActionListener(this);
            b1.setBackground(Color.BLUE);
            b2.setForeground(Color.WHITE);
            f.add(b2);

            f.getContentPane().setBackground(Color.WHITE);

            f.setVisible(true);
            f.setSize(600, 300);
            f.setLocation(400, 300);

        }

        public void actionPerformed(ActionEvent ae){

            try {
                conn c1 = new conn();
                String un = t1.getText();
                String pwd = t2.getText();

                String query = "SELECT * from login where username='" + un + "' and password='" + pwd + "'";

                ResultSet rs = c1.s.executeQuery(query);
                if (rs.next()) {
                    new details().f.setVisible(true);
                    f.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                    f.setVisible(false);
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        public static void main(String[] args){
            login l = new login();

        }
    }