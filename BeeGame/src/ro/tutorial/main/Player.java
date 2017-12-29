package ro.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {
	
	Random r = new Random();
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
//		
//		velX = r.nextInt(5) + 1;
//		velY = r.nextInt(5);
		
	}

	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 37);
		y = Game.clamp(y, 0, Game.HEIGHT - 59);
		
	}

	public void render(Graphics g) {
//		if (id == ID.Palyer) g.setColor(Color.white);
//		else if (id == ID.Palyer2) g.setColor(Color.red);
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
	

}
