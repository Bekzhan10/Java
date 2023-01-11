package HW_9;

public class Temperature {
    private double value;
    private char scale;

    public char getScale() {
        return scale;
    }

    public double getValue() {
        return value;
    }

    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    public Temperature(int value, char scale) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(int value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    public double getTemperatureC() {
        if(scale=='F')
            return (5*(value - 32) / 9);
        return value;
    }

    public double getTemperatureF() {
        if(scale=='C')
            return (9*(value / 5) + 32);
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
}

//        Три метода для установки полей: один для установки значения, один для установки шкалы ('F' или 'C'),
//        и один для установки обоих.
//        Метод для возврата шкалы.
