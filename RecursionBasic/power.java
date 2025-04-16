package RecursionBasic;

public class power {
    public static void main(String[] args) {

        System.out.println(pow(2 ,-2.0));
    }

    static  double pow(double x , double n){
        double result =1.0;
        double base = x;
        double power =n;

        if (power <0){
            base = 1.0/base;
            power = -power;
        }
        return   helper(power ,base ,result);

    }
    static  double helper(double power , double base ,  double result){
        if (power ==0){
            return  result;
        }
        if ( power %2==1) return helper(power -1 , base ,result*base);
        else  return helper(power/2 ,base*base ,result);
    }
}
