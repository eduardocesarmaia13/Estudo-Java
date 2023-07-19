import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] carros = {"BMW", "Tesla", "Jeep", "Fiat"};
        carros[2] = "Ferrari";
        System.out.println(Arrays.toString(carros));
        System.out.println(carros[2]);
    }
}