package com.bitcamp.project.khj;

import java.awt.EventQueue;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import com.bitcamp.project.kms.main2;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delview extends JFrame {

	private JPanel contentPane;
	private FirstDTO fdto;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delview frame = new Delview();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @param fdto 
	 */
	public Delview(FirstDTO fdto) {
		this.fdto=fdto;
		FirstDAO fdao=new FirstDAO(fdto);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC608\uC57D\uB0B4\uC5ED \uC911 \uC0AD\uC81C\uD558\uC2E4 \uB0B4\uC5ED\uC744 \uC120\uD0DD\uD558\uC138\uC694.");
		lblNewLabel.setBounds(343, 36, 238, 15);
		contentPane.add(lblNewLabel);
		
				
		JLabel lblNewLabel_1 = new JLabel("열차번호");
		lblNewLabel_1.setBounds(121, 91, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("열차명");
		lblNewLabel_2.setBounds(201, 91, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("출발역");
		lblNewLabel_3.setBounds(283, 91, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("출발시간");
		lblNewLabel_4.setBounds(363, 91, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("도착역");
		lblNewLabel_5.setBounds(449, 91, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("도착시간");
		lblNewLabel_6.setBounds(529, 91, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("요금");
		lblNewLabel_7.setBounds(608, 91, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("좌석");
		lblNewLabel_8.setBounds(698, 91, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("일자");
		lblNewLabel_9.setBounds(791, 91, 162, 15);
		contentPane.add(lblNewLabel_9);
		
		
		JButton button = new JButton("\uBA54\uC778\uD654\uBA74\uC73C\uB85C \uB3CC\uC544\uAC00\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main2 m=new main2(fdto.getMid());
				m.setVisible(true);
				dispose();
			}
		});
		button.setBounds(801, 10, 171, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\uC608\uC57D\uD654\uBA74\uC73C\uB85C \uB3CC\uC544\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstView fv=new FirstView(fdto.getMid());
				fv.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 10, 176, 23);
		contentPane.add(btnNewButton);
		
		List<String> arr=fdao.getRev();
		
		int size=arr.size();
		String[]rsv=new String[size];
		String[]tnumber=new String[size];
		String[]tname=new String[size];
		String[]dsname=new String[size];
		String[]dtime=new String[size];
		String[]asname=new String[size];
		String[]atime=new String[size];
		String[]fair=new String[size];
		String[]seat=new String[size];
		String[]date=new String[size];
		
		int r=0;
		for(int i=0;i<arr.size();i++) {
			String s=arr.get(i);
			String[]ar=s.split(",");
			rsv[i]=ar[0];
			tnumber[i]=ar[1];
			tname[i]=ar[2];
			dsname[i]=ar[3];
			dtime[i]=ar[4];
			asname[i]=ar[5];
			atime[i]=ar[6];
			fair[i]=ar[7];
			seat[i]=ar[8];
			date[i]=ar[9];
		}
		
		int y=130;
		JRadioButton[]rb1=new JRadioButton[size];
		ButtonGroup bg=new ButtonGroup();
		
		for(int j=0; j<size;j++) {
		JRadioButton rb=new JRadioButton(rsv[j]);
		rb.setBounds(8, y, 115, 23);
		bg.add(rb);
		contentPane.add(rb);
		
		JLabel lbl = new JLabel(tnumber[j]);
		lbl.setBounds(121, y, 57, 15);
		contentPane.add(lbl);
		
		JLabel l2 = new JLabel(tname[j]);
		l2.setBounds(201, y, 57, 15);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel(tname[j]);
		l3.setBounds(283, y, 57, 15);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel(atime[j]);
		l4.setBounds(363, y, 57, 15);
		contentPane.add(l4);
		
		JLabel l5 = new JLabel(asname[j]);
		l5.setBounds(449, y, 57, 15);
		contentPane.add(l5);
		
		JLabel l6 = new JLabel(atime[j]);
		l6.setBounds(529, y, 57, 15);
		contentPane.add(l6);
		
		JLabel l7 = new JLabel(fair[j]);
		l7.setBounds(608, y, 57, 15);
		contentPane.add(l7);
		
		JLabel l8 = new JLabel(seat[j]);
		l8.setBounds(690, y, 57, 15);
		contentPane.add(l8);
		
		JLabel l9 = new JLabel(date[j]);
		l9.setBounds(800, y, 162, 15);
		contentPane.add(l9);
		
		y+=21;
		} //checkbox 생성까지 만듬. selected된거 구할 차례.

		JButton btn_del = new JButton("\uC0AD\uC81C\uD558\uAE30");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			
				Enumeration<AbstractButton> em=bg.getElements();
				String st=null;
				while(em.hasMoreElements()) {
					AbstractButton ab=em.nextElement();
					JRadioButton jr=(JRadioButton)ab;
					
					if(jr.isSelected()) {
					st=jr.getText();
					int rs=Integer.parseInt(st);
					fdto.setRn(rs);
					}		
				}
				
				int rs=fdao.del();
				
				if(rs>0) {
					JOptionPane.showMessageDialog(contentPane, "삭제를 성공하였습니다.", "삭제성공!",JOptionPane.PLAIN_MESSAGE);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "삭제를 실패했니다.", "삭제실패!",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btn_del.setBounds(875, 428, 97, 23);
		contentPane.add(btn_del);
		
	}
}
