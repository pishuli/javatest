
package com.lynn_pee.loginframe;

import java.awt.*;
import javax.swing.*;

public class LoginFrame extends JFrame{
	
	JTextField userTextField;  
	JTextField pwdTextField;
	
    void CreateFrame(String title){
		JFrame loginFrame = new JFrame(title);
		
		loginFrame.setSize(350,200);
		
		/*���ô��ھ���Ч��ͬloginFrame.setLocationRelativeTo(null)*/
		//loginFrame.setLocationRelativeTo(null);
		{
		    Toolkit kit = Toolkit.getDefaultToolkit();    // ���幤�߰�
            Dimension screenSize = kit.getScreenSize();   // ��ȡ��Ļ�ĳߴ�
            //System.out.println(screenSize);
            //System.out.printf("%d,%d",loginFrame.getWidth(), loginFrame.getHeight());
            loginFrame.setLocation((screenSize.width-loginFrame.getWidth())/2, 
            		    (screenSize.height-loginFrame.getHeight())/2);
		}
		
		JPanel mainPanel = new JPanel();
		Box htemp = Box.createHorizontalBox();
		Box vtemp = Box.createVerticalBox();  
		Box buttonBox = Box.createVerticalBox();
		
		userTextField = new JTextField();
		userTextField.setPreferredSize(new Dimension(150,25));
		
		pwdTextField  = new JTextField();
		pwdTextField.setPreferredSize(new Dimension(150,25));
		vtemp.add(userTextField);
		vtemp.add(pwdTextField);
		JLabel loginIcon = new JLabel(new ImageIcon("E:\\java\\proj\\javatest\\res\\login.png"));
		htemp.add(loginIcon);
        htemp.add(Box.createHorizontalStrut(10));
		htemp.add(vtemp);
		
		mainPanel.add(htemp);
		mainPanel.add(new JButton("��¼"));
		mainPanel.add(new JButton("ע��"));
		//mainPanel.setLocationRelativeTo(null);
		loginFrame.add(mainPanel);
		loginFrame.setResizable(false);
        loginFrame.setVisible(true);
		//loginFrame.setLocation(400,300);
		
	}
    public static void main(String args[]){
    	LoginFrame login = new LoginFrame();
    	login.CreateFrame("ϵͳ��¼");
    	//login.setlo
    }
}
