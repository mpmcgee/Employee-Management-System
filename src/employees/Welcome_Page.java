package employees;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Welcome_Page implements ActionListener {
    JFrame f;
    JLabel id,ll;
    JButton b;

    Welcome_Page() {

        f = new JFrame("Employee Management System");
        f.setBackground(Color.blue);
        f.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel ll = new JLabel(i3);

        ll.setBounds(0, 150, 1360, 530);
        f.add(ll);

        b = new JButton("Continue");
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);

        b.setBounds(500, 500, 300, 70);
        b.addActionListener(this);

        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setLayout(null);

        JLabel lid = new JLabel("Employee Management System");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("arial", Font.PLAIN, 70));
        lid.setForeground(Color.BLACK);
        id.add(lid);

        id.add(b);
        f.add(id);

        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360, 750);
        f.setLocation(200, 100);

        // blink
        while (true) {
            lid.setVisible(false);
            try {
                Thread.sleep(500);

            } catch (Exception e) {}


        }
    }
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b){
                f.setVisible(false);
                new login();
            }
        }
    public static void main(String[] args){
            Welcome_Page f = new Welcome_Page();
        }
}
