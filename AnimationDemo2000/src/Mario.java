

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
		moveByAmount(dir*5, 0);
	}

	public void jump() {
		// JUMP!
		moveByAmount(0, -MARIO_HEIGHT);
	}

	public void act(ArrayList<Shape> obstacles) {
		// FALL (and stop when a platform is hit)
		
		for(Shape s : obstacles) {
			if(!s.intersects(this)) {
				moveByAmount(0, MARIO_HEIGHT/5);
			}
		}
	}


}
