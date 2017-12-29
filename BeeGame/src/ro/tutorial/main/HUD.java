package ro.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {

	public static int HEALTH = 100;
	
	public void tick() {
		HEALTH--;
		HEALTH = Game.clamp(HEALTH, 0, 100);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(15, 15, 200, 16);
		g.setColor(Color.GREEN);
		g.fillRect(15, 15, HEALTH*2, 16);
		g.setColor(Color.WHITE);
		g.drawRect(15, 15, 200, 16);
	}
	
}
