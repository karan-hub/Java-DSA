package RecursionBasic;

public class power {
    public static void main(String[] args) {

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
        if ( base %2==1) return helper(power -1 , base ,result*base);
        else  return helper(power/2 ,base*2 ,result);
    }
}
