/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Hoang_Anh
 */
public class Bai5 extends JFrame {
    JTextField txtSoa,txtSob,txtSoc,txtKetqua;
    JButton btnGiai,btnXoaTrang,btnThoat;
    public Bai5() {
        super("Giải phương trình bậc 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(taoTieuDe(),BorderLayout.NORTH);
        con.add(taoVungNhap(),BorderLayout.CENTER);
        con.add(taoVungThaoTac(),BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        
    }
    
    private JPanel taoTieuDe(){
        JPanel pn = new JPanel();
        JLabel lblTieuDe = new JLabel("Giải phương trình bậc 2");
        Font font = new Font("Arial",Font.BOLD,20);
        lblTieuDe.setFont(font);
        lblTieuDe.setForeground(Color.red);
        pn.add(lblTieuDe);
        return pn;
        
    }
    
    private JPanel taoVungNhap(){
        JPanel pnGrid = new JPanel();
        pnGrid.setLayout(new GridLayout(4,2,10,10));
        txtSoa = new JTextField(15);
        txtSob = new JTextField(15);
        txtSoc = new JTextField(15);
        txtKetqua = new JTextField(15);
        txtKetqua.setEditable(false);
        
        pnGrid.add(new JLabel("a:"));
        pnGrid.add(txtSoa);
        pnGrid.add(new JLabel("b:"));
        pnGrid.add(txtSob);
        pnGrid.add(new JLabel("c:"));
        pnGrid.add(txtSoc);
        pnGrid.add(new JLabel("Ket Qua:"));
        pnGrid.add(txtKetqua);
        
        JPanel pnBorder = new JPanel();
        pnBorder.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red),"Nhập a,b,c"));
        pnBorder.add(pnGrid);
        return pnBorder;
    }
    
    private JPanel taoVungThaoTac(){
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pnFlow.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red),"Chọn thao tác"));
        
        btnGiai = new JButton("Giải");
        btnXoaTrang = new JButton("Xoá Trắng");
        btnThoat = new JButton("Thoát");
        
        pnFlow.add(btnGiai);
        pnFlow.add(btnXoaTrang);
        pnFlow.add(btnThoat);
        
        return pnFlow;
        
    }
    
    public static void main(String[] args) {
        new Bai5().setVisible(true);
    }
    
    
}
