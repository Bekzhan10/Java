public class Triangle {
    int firstSide;
    int secondSide;
    int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public int findPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    public double findArea() {
        double s = (firstSide + secondSide + thirdSide) / 2.0;
        return Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
    }
}
