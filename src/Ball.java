/**
 * Created by student on 04.03.2015.
 */
public class Ball {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        x=0.0;
        y=0.0;
    }

    public void setXY(double x, double y) {

        this.x=x;
        this.y=y;
    }

    public void move (double xDisp, double yDisp) {

        x+=xDisp;
        y+=yDisp;
    }

    public void setXYSpeed() {
        double speed = 5;
    }
    


    public String toString() {
        return String.format( "x="+x+"  y="+y);
    }

}
