package HW_10;

public class Man implements Person{
    @Override
    public void talk() {
        System.out.println("HW_10.Man is talking");
    }

    @Override
    public void walk() {
        System.out.println("HW_10.Man is walking");
    }

    @Override
    public void run() {
        System.out.println("HW_10.Man is running");
    }
}
