/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programfirst;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author val12
 */
public class MyFrame extends JFrame {
    
    public MyFrame(){
    super("Моя программа");
        setResizable(true);
        setLayout(new BorderLayout());
        setBounds(100,200,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
       
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.setBackground(Color.lightGray);
        panel.setBorder(new EmptyBorder(20,0,20,0));      
        
        
        
        
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0,0,15,5);
        JLabel namel = new JLabel("Имя: ");
        c.gridx = 0;
        c.gridy = 0;
        panel.add(namel,c);
        c.gridx = 1;
        JTextField nameTF = new JTextField();
        nameTF.setPreferredSize(new Dimension(200,40));
        panel.add(nameTF, c);
        JLabel emaill = new JLabel("E-mail: ");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(emaill,c);
        JTextField emailTF = new JTextField();
        emailTF.setPreferredSize(new Dimension(200,40));
        c.gridx = 1;
        panel.add(emailTF,c);
        
        
        JPanel top = new JPanel();
        
        top.setLayout(new BorderLayout());
        top.setBackground(Color.LIGHT_GRAY);
        top.setBorder(new EmptyBorder(0,0,300,0));  
        JCheckBox tp_1 = new JCheckBox("HTML");
        JCheckBox tp_2 = new JCheckBox("JavaScript");
        JCheckBox tp_3 = new JCheckBox("PHP");
        top.setLayout(new GridBagLayout());
        GridBagConstraints t = new GridBagConstraints();
        
        t.fill = GridBagConstraints.BOTH;
        t.insets = new Insets(0,0,0,5);
        t.gridx = 0;
        t.gridy = 0;
        top.add(tp_1, t);
        t.gridy = 1;
        top.add(tp_2, t);
         t.gridy = 2;
        top.add(tp_3, t);
        t.gridy = 2;
         t.gridx = 2;
        JButton button = new JButton ("Подписаться");
        button.setFont(new Font("Arial",Font.ITALIC,22));
        button.setPreferredSize(new Dimension(200,25));
        top.add(button, t);
        
          add(panel, BorderLayout.BEFORE_FIRST_LINE);
          add(top, BorderLayout.CENTER);
    }
    
}
