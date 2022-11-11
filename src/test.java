public class test {
    public static void main(String[] args) {
        paddle p1 = new paddle(1, 5);
        paddle p2 = new paddle(9,5);

        System.out.println("" + p1.getY() + " " + p2.getY());
        p1.moveUp();
        p2.moveDown();
        System.out.println("" + p1.getY() + " " + p2.getY());

        ball b = new ball(5,5);
        b.move();
        b.bounce();
        b.move();
    }
}
