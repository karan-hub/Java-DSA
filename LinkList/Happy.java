package LinkList;

public class Happy {


        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;

            do {
                slow = squareSum(slow);        // 1 step
                fast = squareSum(squareSum(fast)); // 2 steps
                System.out.println("slow: " + slow + ", fast: " + fast);

                if (fast == 1) return true; // Happy number always ends at 1
            } while (slow != fast);

            return false; // If loop happens and never reaches 1
        }

        public int squareSum(int n) {
            int result = 0;
            while (n > 0) {
                int d = n % 10;
                result += d * d;
                n /= 10;
            }
            return result;
        }

        public static void main(String[] args) {
            Happy h = new Happy();
            boolean result = h.isHappy(2); // Try 19 also, it's happy

            if (result)
                System.out.println("Is Happy");
            else
                System.out.println("Not Happy");
        }
    }


