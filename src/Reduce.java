public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int stepCounter = 0;

        while (n != 0) {
            boolean isEven = n % 2 == 0;
            boolean isOdd = n % 2 == 1;
            if (isEven) {
                stepCounter += 1;
                n = n / 2;
            }
            else if (isOdd) {
                stepCounter += 1;
                n = n - 1;
            }
        }
        System.out.println(stepCounter);
    }
}
