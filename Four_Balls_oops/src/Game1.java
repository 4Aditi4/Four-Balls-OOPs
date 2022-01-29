import processing.core.PApplet;

public class Game1 extends PApplet
{

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int RADIUS = 10;


    public static void main(String[] args)
    {
        PApplet.main("Game1");
    }
    public class Ball
    {
        private int radius;
        private int velx;
        private int vely;
        private int velocity;
        Ball(int velx,int vely,int radius,int velocity)
        {
            this.velx= velx;
            this.vely=vely;
            this.velocity=velocity;
            this.radius=radius;
        }
        public void draw()
        {
            ellipse(velx,vely,radius,radius);
            velx+=velocity;
        }
    }

   Ball b1 = new Ball(0, HEIGHT/5*1, RADIUS, 1);
    Ball b2 = new Ball(0, HEIGHT/5*2, RADIUS, 2);
    Ball b3 = new Ball(0, HEIGHT/5*3, RADIUS, 3);
    Ball b4 = new Ball(0, HEIGHT/5*4, RADIUS, 4);

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    public void draw()
    {
      drawCircle();
    }
    public void drawCircle()
    {
        b1.draw();
        b2.draw();
        b3.draw();
        b4.draw();
    }
}
