public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 85; // вес в кг
        double height = 1.63;  // рост в м
        double iBM = service.calculate(weight, height);
        System.out.println("ИМТ = " + iBM);
    }
}
