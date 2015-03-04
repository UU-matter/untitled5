/**
 * Created by student on 04.03.2015.
 */
public class TestBall {

    public static void main(String[] args) {
        Ball b1 = new Ball(20,40);
        System.out.println("x="+b1.getX()+"  y="+b1.getY());
        b1.move(100,120);
        System.out.println(b1);
    }
}
