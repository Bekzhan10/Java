package HW_10;

public class Student {
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
//    Напишите класс HW_10.Student с полем grade типа int. Затем создайте несколько
//        экземпляров вашего класса и добавьте их в коллекцию. Затем выполните итерацию по вашему
//        набору (используя foreach или iterator) и покажите, что будет получено в результате.