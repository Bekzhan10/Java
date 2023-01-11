package HW_8;
public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int returnArea() {
        return length * width;
    }
}
