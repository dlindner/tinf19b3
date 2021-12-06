package de.dhbw.tinf19b3.pattern.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class MeinFenster {

	public static void main(String[] args) {
		MeinFenster fenster = new MeinFenster();
		SwingUtilities.invokeLater(fenster::zeigeAn);
	}
	
	public MeinFenster() {
		super();
		System.out.println("constructor");
	}
	
	{
		System.out.println("object initializer");
	}
	
	private void zeigeAn() {
		JFrame frame = new JFrame("Alles ist gut");
		JButton jimKnopf = new JButton("Don't Panic!");
		
		ActionListener konkreterBeobachter = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				System.out.println("Wirklich, alter Stil: " + getClass());
				System.out.println("Thread: " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				throw new NullPointerException();
			}
		};
		jimKnopf.addActionListener(konkreterBeobachter);
		
		ActionListener zweiter = e -> {
			System.out.println("Wirklich: " + getClass());
		};
		System.out.println(zweiter.getClass().getName());
		jimKnopf.addActionListener(zweiter);
		
		jimKnopf.addActionListener(e -> {
			System.out.println("Wirklich, knapp: " + getClass());
		});
		
		jimKnopf.removeActionListener(zweiter);
		jimKnopf.removeActionListener(zweiter);
		
		frame.getContentPane().add(jimKnopf);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
