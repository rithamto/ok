package ObjectClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JButton;
/**
 *
 * @author TuyenPVT
 */
public class setBtnBg {
    public static void setBg(JButton btn) {
        btn.setBackground(new java.awt.Color(240, 248, 255));
        btn.setForeground(new java.awt.Color(96, 134, 240));
    }

    public static void resetBg(JButton btn) {
        btn.setBackground(new java.awt.Color(96, 134, 240));
        btn.setForeground(new java.awt.Color(240, 248, 255));
    }
}
