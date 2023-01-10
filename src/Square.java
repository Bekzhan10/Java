import java.util.Scanner;

public class Square {
    public int a;

    public Square() {
        System.out.println("Enter a length of a side of a square");
        Scanner scan = new Scanner(System.in);
        this.a = scan.nextInt();
    }

    public int findArea() {
        return a*a;
    }

    public int findPerimeter() {
        return a*4;
    }

    public double findDiagonal() {
        return (a * Math.sqrt(2));
    }

}
//        Создайте программу, которая вычисляет площадь, периметр и длину диагонали квадрата со стороной a,
//        которую ваша программа должна считать из пользовательского ввода с помощью класса Scanner.
