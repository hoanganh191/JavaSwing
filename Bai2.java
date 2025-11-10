/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Hoang_Anh
 */
public class Bai2 extends JFrame {
    JButton btn1,btn2,btn3,btn4,btn5;
    public Bai2(){
       super("Demo bai 2");
        setSize(550,220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        btn1 = new JButton("Flow layout");
        btn2 = new JButton("Add các control");
        btn3 = new JButton("Trên 1 dòng");
        btn4 = new JButton("Hết chỗ chứa");
        btn5 = new JButton("Thì xuống dòng");
        
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        
        Container con = getContentPane();
        con.add(pnFlow);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Bai2();
    }
}
