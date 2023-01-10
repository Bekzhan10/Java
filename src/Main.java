public class Main {
    public static void main(String[] args) {

        StarTriangle starTriangle1 = new StarTriangle(5);
        System.out.println(starTriangle1);

        Square square1 = new Square();
        System.out.println(square1.findArea());
        System.out.println(square1.findDiagonal());
        System.out.println(square1.findPerimeter());

        Temperature temperature1 = new Temperature(32,'F');
        System.out.println(temperature1.getTemperatureC());
        System.out.println(temperature1.getTemperatureF());
    }
}
