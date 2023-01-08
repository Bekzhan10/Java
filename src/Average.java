public class Average {
    int first;
    int sec;
    int third;

    public Average(int first, int sec, int third) {
        this.first = first;
        this.sec = sec;
        this.third = third;
    }

    public double findAverage() {
        return (first + sec + third) / 3.0;
    }
}
