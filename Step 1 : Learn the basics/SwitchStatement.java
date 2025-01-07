
public class SwitchStatement {
    public static void main(String[] args) {
        List<Double> arr = Arrays.asList(5.0, 10.0);
        int choice = 2;
        double result = switchCase(choice, arr);
        System.out.println("The result is: " + result);
    }

    static double switchCase(int choice, List<Double> arr) {
        // code here
        switch (choice) {
            case 1:
                double R = arr.get(0);
                return Math.PI * (R * R);

            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                return L * B;
            default:
                return choice;

        }
    }
}
