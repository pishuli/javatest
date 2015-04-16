
package com.lynn_pee.loginframe;

import java.awt.*;
import javax.swing.*;

public class LoginFrame extends JFrame{
	
	JTextField userTextField;  
	JTextField pwdTextField;
	
    void CreateFrame(String title){
		JFrame loginFrame = new JFrame(title);
		
		loginFrame.setSize(350,200);
		
		/*设置窗口居中效果同loginFrame.setLocationRelativeTo(null)*/
		//loginFrame.setLocationRelativeTo(null);
		{
		    Toolkit kit = Toolkit.getDefaultToolkit();    // 定义工具包
            Dimension screenSize = kit.getScreenSize();   // 获取屏幕的尺寸
            //System.out.println(screenSize);
            //System.out.printf("%d,%d",loginFrame.getWidth(), loginFrame.getHeight());
            loginFrame.setLocation((screenSize.width-loginFrame.getWidth())/2, 
            		    (screenSize.height-loginFrame.getHeight())/2);
		}
		
		JPanel mainPanel = new JPanel();
		Box mainBox = Box.createVerticalBox();
		Box htemp = Box.createHorizontalBox();
		Box vtext = Box.createVerticalBox();  
		Box buttonBox = Box.createHorizontalBox();
		
		userTextField = new JTextField();
		userTextField.setPreferredSize(new Dimension(150,25));
		
		pwdTextField  = new JTextField();
		pwdTextField.setPreferredSize(new Dimension(150,25));
		vtext.add(userTextField);
		vtext.add(pwdTextField);
		JLabel loginIcon = new JLabel(new ImageIcon("E:\\java\\proj\\javatest\\res\\login.png"));
		htemp.add(loginIcon);
        htemp.add(Box.createHorizontalStrut(10));
		htemp.add(vtext);
		
		buttonBox.add(Box.createHorizontalStrut(100));
		buttonBox.add(new JButton("登录"));
		buttonBox.add(new JButton("注册"));
		
		mainBox.add(htemp);
		mainBox.add(Box.createVerticalStrut(10));
		mainBox.add(buttonBox);
		mainPanel.add(mainBox);
		//mainPanel.setLocationRelativeTo(null);
		loginFrame.add(mainPanel);
		loginFrame.setResizable(false);
        loginFrame.setVisible(true);
		//loginFrame.setLocation(400,300);
		
	}
    public static void main(String args[]){
    	LoginFrame login = new LoginFrame();
    	login.CreateFrame("系统登录");
    	//login.setlo
    }
}
