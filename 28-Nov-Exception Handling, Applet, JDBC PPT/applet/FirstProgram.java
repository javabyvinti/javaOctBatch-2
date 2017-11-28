package com.bmpl.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class FirstProgram extends Applet{

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Welcome", 100, 100);
		g.drawRect(10, 10, 100, 30);
	}
	
}
