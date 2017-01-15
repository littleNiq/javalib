/*
 * login.java
 *
 * Created on __DATE__, __TIME__
 */

package d;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import c.userdao;
import d.frame;

/**
 *
 * @author  __USER__
 */
public class login extends javax.swing.JFrame {

	/** Creates new form login */
	public login() {
		initComponents();
		ImageIcon img = new ImageIcon("images/02.jpg");
		JLabel bg = new JLabel(img);
		bg.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		this.getLayeredPane().add(bg, new Integer(Integer.MIN_VALUE));
		JPanel jp = (JPanel) this.getContentPane();
		jp.setOpaque(false);//透明
		java.util.Date NowTime = new java.util.Date();

		SimpleDateFormat formatter = new SimpleDateFormat(
				"yyyy年MM月dd日 HH:mm:ss");

		Date currentTime = new Date();

		String dateString = formatter.format(currentTime);
		//jTextField2.getText(dateString);
		//System.out.println("现在时间是：");
		//jFormattedTextField1.setText(dateString);
		jLabel5.setText(dateString);
		// System.out.println(dateString);

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel5 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u767b\u5f55\u754c\u9762");
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel1.setText("\u7528\u6237\u540d\uff1a");

		jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel2.setText("\u5bc6\u3000\u7801\uff1a");

		jButton1.setText("\u767b\u3000\u5f55");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u91cd\u3000\u7f6e");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField1ActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 36));

		jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 30));
		jLabel3
				.setText("  \u963f  \u72f8  \u68a6  \u4e4b  \u57ce  \u6b22  \u8fce  \u60a8");

		jButton3.setText("\u6ce8\u518c");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				107,
																				107,
																				107)
																		.addComponent(
																				jLabel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				521,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				125,
																				125,
																				125)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jLabel1,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								129,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jLabel2))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING)
																																						.addComponent(
																																								jPasswordField1,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								332,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jTextField1,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								332,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jButton3,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				122,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				40,
																																				40,
																																				40)
																																		.addComponent(
																																				jButton1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				127,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																				39,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jButton2,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				117,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				21,
																																				21,
																																				21)))
																										.addGap(
																												258,
																												258,
																												258))
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								434,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addGap(20, 20, 20)
										.addComponent(
												jLabel5,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												45, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												77,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																48,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(38, 38, 38)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																44,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addGap(
																				72,
																				72,
																				72)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								71,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								67,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								71,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGap(109, 109, 109)));

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		setBounds((screenSize.width - 702) / 2, (screenSize.height - 558) / 2,
				702, 558);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String name = jTextField1.getText();
		String pwd = new String(jPasswordField1.getPassword());
		if (name.trim().length() != 0 && pwd.trim().length() != 0) {
			if (userdao.find(name, pwd)) {
				new frame().setVisible(true);
				this.dispose();
			} else
				JOptionPane.showMessageDialog(this, "用户名或密码不正确");

		} else
			JOptionPane.showMessageDialog(this, "用户名或密码不能为空");
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(null);
		jPasswordField1.setText(null);
		jTextField1.requestFocus(true);

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		String name = jTextField1.getText();
		String pwd = new String(jPasswordField1.getPassword());
		if (name.trim().length() != 0 && pwd.trim().length() != 0) {
			if (userdao.find(name, pwd)) {
				new frame().setVisible(true);
				this.dispose();

			} else
				JOptionPane.showMessageDialog(this, "用户名或密码不正确");

		} else
			JOptionPane.showMessageDialog(this, "用户名或密码不能为空");
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// TODO add your handling code here:
		zhuce af = new zhuce();
		af.setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new login().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}