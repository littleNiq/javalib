/*
 * zframe.java
 *
 * Created on __DATE__, __TIME__
 */

package d;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import c.testDao;

import b.test;

import a.DBManager;

/**
 *
 * @author  __USER__
 */
public class frame extends javax.swing.JFrame {

	/** Creates new form zframe */
	public frame() {
		initComponents();
		ImageIcon img = new ImageIcon("images/01.jpg");
		JLabel bg = new JLabel(img);
		bg.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		this.getLayeredPane().add(bg, new Integer(Integer.MIN_VALUE));
		JPanel jp = (JPanel) this.getContentPane();
		jp.setOpaque(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		tnod = new javax.swing.JTextField();
		tsex = new javax.swing.JTextField();
		taddress = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		tname = new javax.swing.JTextField();
		temail = new javax.swing.JTextField();
		tphone = new javax.swing.JFormattedTextField();
		tadd = new javax.swing.JButton();
		tchaxun = new javax.swing.JButton();
		tdelete = new javax.swing.JButton();
		tallshow = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		tphonepath = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		abc = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u57fa\u672c\u4fe1\u606f");
		setBackground(new java.awt.Color(255, 255, 255));
		setResizable(false);

		jLabel1.setText("id");

		jLabel2.setText("sex");

		jLabel3.setText("address");

		jLabel4.setText("name");

		jLabel5.setText("tel");

		jLabel6.setText("email");

		tphone
				.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
						new javax.swing.text.NumberFormatter(
								new java.text.DecimalFormat("00000000000"))));

		tadd.setText("add");
		tadd.setActionCommand("\u6dfb\u52a0\u4fe1\u606f");
		tadd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				taddActionPerformed(evt);
			}
		});

		tchaxun.setText("search");
		tchaxun.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tchaxunActionPerformed(evt);
			}
		});

		tdelete.setText("delete");
		tdelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tdeleteActionPerformed(evt);
			}
		});

		tallshow.setText("show all");
		tallshow.setActionCommand("show all");
		tallshow.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tallshowActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null } },
				new String[] { "id", "name", "sex", "tel", "address", " email",
						"path" }) {
			Class[] types = new Class[] { java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		tphonepath.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jButton1.setLabel("\u66f4\u65b0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setLabel("\u4e0a\u4f20");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setLabel("\u5220\u9664\u56fe\u7247");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setLabel("\u5220\u9664");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		abc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id",
				"sex", "name" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addContainerGap()
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
																								tdelete,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								250,
																								Short.MAX_VALUE)
																						.addComponent(
																								tchaxun,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								250,
																								Short.MAX_VALUE)
																						.addComponent(
																								tadd,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								250,
																								Short.MAX_VALUE)
																						.addComponent(
																								tallshow,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								250,
																								Short.MAX_VALUE)
																						.addComponent(
																								abc,
																								0,
																								250,
																								Short.MAX_VALUE))
																		.addGap(
																				73,
																				73,
																				73)
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
																																jLabel2)
																														.addComponent(
																																jLabel1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																27,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jLabel5,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																47,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel4))
																										.addGap(
																												97,
																												97,
																												97))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel6)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addComponent(
																												tnod)
																										.addComponent(
																												temail,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												125,
																												Short.MAX_VALUE)
																										.addComponent(
																												tsex))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												taddress,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												125,
																												Short.MAX_VALUE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												tphone,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												125,
																												Short.MAX_VALUE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												tname,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												125,
																												Short.MAX_VALUE))))
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																553,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(13, 13, 13)
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
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jButton4,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																179,
																																Short.MAX_VALUE)
																														.addComponent(
																																jButton3,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																179,
																																Short.MAX_VALUE))
																										.addGap(
																												9,
																												9,
																												9))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jButton2,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																176,
																																Short.MAX_VALUE)
																														.addComponent(
																																jButton1,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																176,
																																Short.MAX_VALUE))
																										.addContainerGap())))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				38,
																				38,
																				38)
																		.addComponent(
																				tphonepath,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				138,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));
		layout
				.setVerticalGroup(layout
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
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												21,
																												21,
																												21)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																tphonepath,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																140,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								tnod,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jLabel1)
																																						.addComponent(
																																								abc,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING)
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												tsex,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addGap(
																																												26,
																																												26,
																																												26)
																																										.addComponent(
																																												taddress,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												javax.swing.GroupLayout.PREFERRED_SIZE))
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addGroup(
																																												layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.BASELINE)
																																														.addComponent(
																																																tdelete)
																																														.addComponent(
																																																jLabel2))
																																										.addGap(
																																												18,
																																												18,
																																												18)
																																										.addGroup(
																																												layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.BASELINE)
																																														.addComponent(
																																																tchaxun,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																25,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)
																																														.addComponent(
																																																jLabel3))
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																																		.addGap(
																																				26,
																																				26,
																																				26)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								tadd)
																																						.addComponent(
																																								tphone,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)))))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												138,
																												138,
																												138)
																										.addComponent(
																												jLabel5)))
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												6,
																												6,
																												6)
																										.addComponent(
																												jLabel4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												19,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												tname,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGap(
																				23,
																				23,
																				23)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												43,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												jButton3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												43,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												24,
																												24,
																												24)
																										.addComponent(
																												jButton1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												43,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												jButton2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												44,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																temail,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel6))
																										.addGap(
																												29,
																												29,
																												29)
																										.addComponent(
																												jScrollPane1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												211,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				193,
																				193,
																				193)
																		.addComponent(
																				tallshow)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		setBounds((screenSize.width - 821) / 2, (screenSize.height - 517) / 2,
				821, 517);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		addblank();
	}

	//删除照片
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		tphonepath.setIcon(null);
		//jButton3.setEnabled(false);
		jButton2.setEnabled(true);
	}

	//上传照片
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileFilter(new myFileFilter());
		File f = new File(System.getProperty("user.dir"));
		fileChooser.setCurrentDirectory(f);
		fileChooser.showOpenDialog(this);
		File selFile = fileChooser.getSelectedFile();
		if (selFile != null) {
			fPath = selFile.getAbsolutePath();
			ImageIcon icon = new ImageIcon(selFile.getAbsolutePath());
			Image imageBefor = icon.getImage();
			Image imageAfter = imageBefor.getScaledInstance(tphonepath
					.getWidth(), tphonepath.getHeight(), Image.SCALE_DEFAULT);
			icon.setImage(imageAfter);
			tphonepath.setIcon(icon);
			//jButton2.setEnabled(false);
			jButton3.setEnabled(true);
		}

	}

	class myFileFilter extends FileFilter {

		@Override
		public boolean accept(File f) {
			// TODO Auto-generated method stub
			if (f.isDirectory()) {
				return true;
			}
			String fname = f.getName();
			if (fname.endsWith(".jpg") || fname.endsWith("png")) {
				return true;
			}
			return false;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "图片文件(.jpg,.png)";
		}

	}

	//更新信息
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String o = tnod.getText();
		test txl = new test(tnod.getText(), tname.getText(), tsex.getText(),
				tphone.getText(), taddress.getText(), temail.getText(), fPath);
		testDao.updateTxl(txl, o);
		testDao.updatePicturePath(o, fPath);
		JOptionPane.showMessageDialog(this, "更新成功");
	}

	//显示所有
	private void tallshowActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:\
		String sql = "select * from student ";
		Vector<test> v = testDao.findByNo(sql);
		Vector<Vector> model = new Vector<Vector>();
		if (v.isEmpty()) {
			JOptionPane.showMessageDialog(this, "没有符合条件的数据！");
		} else {
			for (int i = 0; i < v.size(); i++) {
				Vector<Object> vline = new Vector<Object>();
				test t = v.get(i);
				vline.add(t.getNo());
				vline.add(t.getName());
				vline.add(t.getSex());
				vline.add(t.getPhone());
				vline.add(t.getAddress());
				vline.add(t.getEmail());
				vline.add(t.getPhotopath());
				model.add(vline);
			}
		}
		Vector<String> a = new Vector<String>();
		a.add("编号");
		a.add("姓名");
		a.add("性别");
		a.add("电话");
		a.add("地址");
		a.add("email");
		a.add("照片路径");
		jTable1.setModel(new DefaultTableModel(model, a));
	}

	//查询信息
	private void tchaxunActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String q = (String) abc.getSelectedItem();
		//通过编号查找
		if (q == "编号") {
			String no = tnod.getText();
			String sql = "select * from student where sno='" + no + "'";
			Vector<test> v2 = testDao.findByNo(sql);
			Vector<Vector> model = new Vector<Vector>();
			if (v2.isEmpty()) {
				JOptionPane.showMessageDialog(this, "没有符合条件的数据！");
			} else {
				for (int i = 0; i < v2.size(); i++) {
					Vector<Object> vline = new Vector<Object>();
					test t = v2.get(i);
					vline.add(t.getNo());
					vline.add(t.getName());
					vline.add(t.getSex());
					vline.add(t.getPhone());
					vline.add(t.getAddress());
					vline.add(t.getEmail());
					vline.add(t.getPhotopath());
					model.add(vline);
				}
			}
			Vector<String> v1 = new Vector<String>();
			v1.add("id");
			v1.add("name");
			v1.add("sex");
			v1.add("tel");
			v1.add("adress");
			v1.add("email");
			v1.add("path");
			jTable1.setModel(new DefaultTableModel(model, v1));

		}
		//通过姓名查找
		else if (q == "name") {
			String name = tname.getText();
			String sq = "select * from student where sname='" + name + "'";
			Vector<test> v2 = testDao.findByName(sq);
			Vector<Vector> model = new Vector<Vector>();
			if (v2.isEmpty()) {
				JOptionPane.showMessageDialog(this, "没有符合条件的数据！");
			} else {
				for (int i = 0; i < v2.size(); i++) {
					Vector<Object> vline = new Vector<Object>();
					test t = v2.get(i);
					vline.add(t.getNo());
					vline.add(t.getName());
					vline.add(t.getSex());
					vline.add(t.getPhone());
					vline.add(t.getAddress());
					vline.add(t.getEmail());
					vline.add(t.getPhotopath());
					model.add(vline);
				}
			}
			Vector<String> v1 = new Vector<String>();
			v1.add("id");
			v1.add("name");
			v1.add("sex");
			v1.add("tel");
			v1.add("address");
			v1.add("email");
			v1.add("path");
			jTable1.setModel(new DefaultTableModel(model, v1));
			tname.setText(null);
		}
		//通过性别查找 
		else if (q == "sex") {
			String sex = tsex.getText();
			String sq = "select * from student where ssex='" + sex + "'";
			Vector<test> v2 = testDao.findBySex(sq);
			Vector<Vector> model = new Vector<Vector>();
			if (v2.isEmpty()) {
				JOptionPane.showMessageDialog(this, "没有符合条件的数据！");
			} else {
				for (int i = 0; i < v2.size(); i++) {
					Vector<Object> vline = new Vector<Object>();
					test t = v2.get(i);
					vline.add(t.getNo());
					vline.add(t.getName());
					vline.add(t.getSex());
					vline.add(t.getPhone());
					vline.add(t.getAddress());
					vline.add(t.getEmail());
					vline.add(t.getPhotopath());
					model.add(vline);
				}
			}
			Vector<String> v1 = new Vector<String>();
			v1.add("id");
			v1.add("name");
			v1.add("sex");
			v1.add("tel");
			v1.add("adress");
			v1.add("email");
			v1.add("path");
			jTable1.setModel(new DefaultTableModel(model, v1));
			tsex.setText(null);
		}
		//通过地址查找
		else if (q == "address") {
			String address = taddress.getText();
			String sq = "select * from student where saddress='" + address
					+ "'";
			Vector<test> v2 = testDao.findByAddress(sq);
			Vector<Vector> model = new Vector<Vector>();
			if (v2.isEmpty()) {
				JOptionPane.showMessageDialog(this, "无符合条件的数据！");
			} else {
				for (int i = 0; i < v2.size(); i++) {
					Vector<Object> vline = new Vector<Object>();
					test t = v2.get(i);
					vline.add(t.getNo());
					vline.add(t.getName());
					vline.add(t.getSex());
					vline.add(t.getPhone());
					vline.add(t.getAddress());
					vline.add(t.getEmail());
					vline.add(t.getPhotopath());
					model.add(vline);
				}
			}
			Vector<String> v1 = new Vector<String>();
			v1.add("id");
			v1.add("name");
			v1.add("sex");
			v1.add("tel");
			v1.add("address");
			v1.add("email");
			v1.add("path");
			jTable1.setModel(new DefaultTableModel(model, v1));
			taddress.setText(null);
		}
	}

	private void addblank() {
		tnod.setText(null);
		tname.setText(null);
		tphone.setText(null);
		taddress.setText(null);
		tsex.setText(null);
		temail.setText(null);
		tphonepath.setIcon(null);
	}

	//删除信息 
	private void tdeleteActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String no = tnod.getText();
		testDao.deletetxl(no);
		JOptionPane.showMessageDialog(this, "删除成功");
		addblank();
	}

	//添加信息
	private void taddActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String sno = tnod.getText();
		String sname = tname.getText();
		String ssex = tsex.getText();
		String sphone = tphone.getText();
		String saddress = taddress.getText();
		String semail = temail.getText();
		if (sno.trim().length() == 0 || sname.trim().length() == 0
				|| ssex.trim().length() == 0 || sphone.trim().length() == 0
				|| saddress.trim().length() == 0) {
			JOptionPane.showMessageDialog(this, "所添加项不能为空");
		} else {
			test bean = new test(sno, sname, ssex, sphone, saddress, semail,
					fPath);
			testDao.add(bean);
			JOptionPane.showMessageDialog(this, "添加成功");
			addblank();
		}
	}

	//单击表格事件 
	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int b = jTable1.getSelectedRow();
		String strno = jTable1.getModel().getValueAt(b, 0).toString();
		String sql = "select * from student where sno='" + strno + "'";
		Vector<test> v = testDao.findByNo(sql);
		test a = v.get(0);
		tnod.setText(a.getNo());
		tname.setText(a.getName());
		tsex.setText(a.getSex());
		tphone.setText(a.getPhone());
		taddress.setText(a.getAddress());
		temail.setText(a.getEmail());
		String s = a.getPhotopath();
		if (s != null) {
			ImageIcon icon = new ImageIcon(s);
			Image imageBefor = icon.getImage();
			Image imageAfter = imageBefor.getScaledInstance(tphonepath
					.getWidth(), tphonepath.getHeight(), Image.SCALE_DEFAULT);
			icon.setImage(imageAfter);
			tphonepath.setIcon(icon);
		}
		tphonepath.setText(a.getPhone());
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JComboBox abc;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JButton tadd;
	private javax.swing.JTextField taddress;
	private javax.swing.JButton tallshow;
	private javax.swing.JButton tchaxun;
	private javax.swing.JButton tdelete;
	private javax.swing.JTextField temail;
	private javax.swing.JTextField tname;
	private javax.swing.JTextField tnod;
	private javax.swing.JFormattedTextField tphone;
	private javax.swing.JLabel tphonepath;
	private javax.swing.JTextField tsex;
	private String fPath=null;
	// End of variables declaration//GEN-END:variables

}