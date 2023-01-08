public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Алиса";
        student1.surname = "Смит";
        student1.address = "Коктем-2";
        student1.id = 24;

        Student student2 = new Student();
        student2.name = "Азамат";
        student2.surname = "Shamsuddin";
        student2.address = "Коктем-2";
        student2.id = 11;

        Student student3 = new Student();
        student3.name = "Кристина";
        student3.surname = "Sanders";
        student3.address = "Коктем-2";
        student3.id = 35;

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.println(triangle1.findPerimeter());
        System.out.println(triangle1.findArea());

        Rectangle rectangle1 = new Rectangle(5,9);
        System.out.println(rectangle1.returnArea());

        Rectangle rectangle2 = new Rectangle(10,14);
        System.out.println(rectangle2.returnArea());

        Average average1 = new Average(3,4,5);
        System.out.println(average1.findAverage());

        Movie movie1 = new Movie("Фокус","RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой","20th Century Studios");
    }
}
/*
Домашнее задание №8
5. Создайте класс 'Movie'. Экземпляр класса Movie представляет фильм. Этот класс имеет следующие три переменные класса:

        3) Создайте экземпляры класса Movie с названием "Фокус", студией "RatPac-Dune Entertainment" и
        рейтингом "R" и с названием "Главный герой" и студией "20th Century Studios"
*/