/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_java;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 ============ VietHoang ============
 */
public class  Test_java extends JFrame{
    public Test_java(){
        JLabel label=new JLabel("ILVU <3", SwingConstants.CENTER);
        label.setForeground(Color.red);
        label.setFont(new Font(Font.MONOSPACED,Font.BOLD,25)) ;
        this.setSize(750,90);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(label);
        this.getContentPane().setBackground( Color.DARK_GRAY);
    }
    public static void main(String[] args) {
        new Test_java().setVisible(true);
    }
}
