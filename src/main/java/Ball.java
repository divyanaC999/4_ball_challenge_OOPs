import processing.core.PApplet;

public class Ball{
    private final float y;
    private final int speed;
    private float x;

    public Ball(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void move() {
        x += speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(x, y, 15, 15);
    }
}