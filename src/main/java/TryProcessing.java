import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 500;
    public static final int WIDTH = 700;

    public static final float ballAtY1 = HEIGHT * 1 / 5;
    public static final float ballAtY2 = HEIGHT * 2 / 5;
    public static final float ballAtY3 = HEIGHT * 3 / 5;
    public static final float ballAtY4 = HEIGHT * 4 / 5;

    private static final int SPEED_1 = 1;
    private static final int SPEED_2 = 2;
    private static final int SPEED_3 = 3;
    private static final int SPEED_4 = 4;

    List<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Ball ball1 = new Ball(0, (int) ballAtY1, SPEED_1);
        Ball ball2 = new Ball(0, (int) ballAtY2, SPEED_2);
        Ball ball3 = new Ball(0, (int) ballAtY3, SPEED_3);
        Ball ball4 = new Ball(0, (int) ballAtY4, SPEED_4);

        balls = Arrays.asList(ball1, ball2, ball3, ball4);
    }

    @Override
    public void draw() {
        balls.forEach(Ball::move);
        balls.forEach(Ball -> Ball.draw(this));
    }
}