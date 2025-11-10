/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN1;

import javax.swing.JFrame;

/**
 *
 * @author Hoang_Anh
 */
public class Bai1 extends JFrame {
    public Bai1(){
        super("Demo Windown");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Bai1 ui = new Bai1();
        ui.setSize(400,300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
    
}
