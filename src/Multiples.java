import static javax.management.Query.or;

public class Multiples {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; i < 1000; i++) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf5 || multipleOf3)
            {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
