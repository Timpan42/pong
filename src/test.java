public class test {
    public static void main(String[] args) {
        paddle p1 = new paddle(10, 50);
        paddle p2 = new paddle(90,50);

        System.out.println("" + p1.getY() + " " + p2.getY());
        p1.moveUp();
        p2.moveDown();
        System.out.println("" + p1.getY() + " " + p2.getY());
    }
}
