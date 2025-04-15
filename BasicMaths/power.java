package BasicMaths;

public class power {
    public static void main(String[] args) {
        System.out.println(pow(2,-2));

    }
//for positive power
    public  static  double pow(int x ,  int n){
        double result =1.0 ;
        double base =x ;
        int power = n;

        if (power < 0) {
            base = 1.0 / base;
            power = -power;
        }

        while (power > 0){
            if (power %2==1){
                result *= base;
                power--;
            }else {
                base *=base;
                power /=2;
            }
        }

        return result;
    }
}
