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

//        Ваш класс должен иметь конструктор с параметром width, который указывает на количество [] в последней строке треугольника.
//
//        Кроме того, должен быть метод toString(), который вычисляет строку, представляющую треугольник, и возвращает
//        строку, состоящую из [] и символов новой строки.
//
//        Использование класса:
//        StarTriangle small = new StarTriangle(3);
//        System.out.println(small.toString());
//
//        Выходные данные:
//        []
//        [][]
//        [][][]
