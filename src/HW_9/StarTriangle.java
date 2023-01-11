package HW_9;

public class StarTriangle {
    public int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
      StringBuilder res = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                res.append("[]");
            }
            res.append("\n");
        }
        return res.toString();
    }
}
