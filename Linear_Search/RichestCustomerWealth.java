package Linear_Search;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 }
        }));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int customer = 0; customer < accounts.length; customer++) {
            for (int accoutn = 0; accoutn < accounts[customer].length; accoutn++) {
                sum += accounts[customer][accoutn];
            }
            if (sum > ans) {
                ans = sum;
            }
            sum = 0;
        }

        return ans;

    }
}