public class BmiService {

    public double calculate(int weight, double height) {
        double result = weight / (height * height);  // формула вес/рост в 2
        return result;
    }

}

