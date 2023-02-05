public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.82;
        double weight = 80;
        double index = service.calculate(height, weight);
        System.out.println(index);
        System.out.println();
        Double imt = service.calculate(height, weight);
        if (imt < 18.5) {
            System.out.println("Ваш индекс массы тела: " + imt);
            System.out.println("Дефицит массы тела: значение меньше 18.5");
        } else if (imt < 25) {
            System.out.println("Ваш индекс массы тела: " + imt);
            System.out.println("Нормальная масса тела: значение в диапазоне 18.5 - 25");
        } else if (imt < 30) {
            System.out.println("Ваш индекс массы тела: " + imt);
            System.out.println("Избыточная масса тела: значение в диапазоне 25 - 30");
        } else {
            System.out.println("Ваш индекс массы тела: " + imt);
            System.out.println("Ожирение: значение больше 30");
        }
    }
}