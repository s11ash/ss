public class ExtendedBreakErr {
    public static void main(String[] args) {

        for (int x = 0; x < 3; x++)  {
            System.out.println("Значение x равно " + x);
        }
        for (int y = 0; y < 50; y++)  {
            if (y == 10) break;

            if (y == 25) break;
            System.out.println("y равно " + y); {
                System.out.println("y равно 25");
            }
        }

    }
}
