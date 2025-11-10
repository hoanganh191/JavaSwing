/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Hoang_Anh
 */
public class Bai4 extends JFrame {
    JPanel pnBorder,pnNorth,pnSouth,pnEast,pnWest,pnCenter;
    public Bai4() {
        super("Border Layout");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        pnNorth = new JPanel();
        pnNorth.setBackground(Color.red);
        pnNorth.setPreferredSize(new Dimension(0, 100)); // Set preferred height
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        
        pnSouth = new JPanel();
        pnSouth.setBackground(Color.GREEN);
        pnSouth.setPreferredSize(new Dimension(0, 100)); // Set preferred height
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        
        pnWest = new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnWest.setPreferredSize(new Dimension(100, 0)); // Set preferred width
        pnBorder.add(pnWest,BorderLayout.WEST);
        
        pnEast = new JPanel();
        pnEast.setBackground(Color.ORANGE);
        pnEast.setPreferredSize(new Dimension(100, 0)); // Set preferred width
        pnBorder.add(pnEast,BorderLayout.EAST);
        
        pnCenter = new JPanel();
        pnCenter.setBackground(Color.YELLOW);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        getContentPane().add(pnBorder);
        
    }
    
    public static void main(String[] args) {
        new Bai4();
    }
    
}
