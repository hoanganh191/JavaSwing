/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Hoang_Anh
 */
public class Bai3 extends JFrame{
    JButton btn1,btn2,btn3;
    public Bai3() {
        super("Bai 3 theo truc X_AXIS Demo");
        this.setVisible(true);
        this.setSize(500,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.X_AXIS));
        pnBox.setBorder(BorderFactory.createTitledBorder("BoxLayout theo X_AXIS")); //Thay doi o day
        
        Font font = new Font("Arial",Font.BOLD | Font.ITALIC,25);
        btn1 = new JButton("BoxLayout");
        btn1.setForeground(Color.red);
        btn1.setFont(font);
        pnBox.add(btn1);
        
        btn2 = new JButton("X_AXIS");
        btn2.setForeground(Color.BLUE);
        btn2.setFont(font);
        pnBox.add(btn2);
        
        btn3 = new JButton("Y_AXIS");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);
        pnBox.add(btn3);
        
        this.getContentPane().add(pnBox);
        
    }
    
    public static void main(String[] args) {
        new Bai3();
    }
    
    
}
