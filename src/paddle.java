public class paddle {
    private int x;
    private int y;
    private int width = 10;

    public paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp(){
        y = y-10;
    }

    public void moveDown(){
        y = y+10;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }
}
