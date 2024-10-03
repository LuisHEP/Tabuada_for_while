public class Mult {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int y = 1; y <= 10; y++) {
                System.out.println(i + " x " + y + " = " + (i * y));
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 10) {
            System.out.println("Tabuada do " + i + ":");
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
