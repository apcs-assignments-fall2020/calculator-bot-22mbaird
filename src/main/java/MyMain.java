import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int m1 = Math.max(int a,int b);
        int m2 = Math.max(int b,int c);
        int m3 = Math.min(int m1,int m2);
        return int m3;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int aba = Math.abs(int a);
        int abb = Math.abs(int b);
        int maxmag = Math.max(int aba, int abb);
        return int maxmag;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = Math.sqrt(Math.pow(a,2)*Math.pow(b,2))
        return c; // REPLACE WITH YOUR CODE
    }
    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        String x = ("median");
        String y = ("magnitude");
        String z = ("phythogoras");

        Scanner scan = new Scanner(System.in);
        System.out.print("Which method? ");
        String mthd = next.scan();

        boolean d = x.equals(mthd);
        boolean e = y.equals(mthd);
        boolean f = z.equals(mthd);

         if (d = true){
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Integer: ");
            int a = next.scan1();
            Scanner scan3 = new Scanner(System.in);
            System.out.print("Integer: ");
            int c = next.scan3();
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Integer: ");
            int b = next.scan2();
        }
         if (e = true){
             Scanner scan1 = new Scanner(System.in);
            System.out.print("Integer: ");
            int a = next.scan1();
            Scanner scan3 = new Scanner(System.in);
            System.out.print("Integer: ");
            int c = next.scan3();
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Integer: ");
            int b = next.scan2();
        }
        if (f = true){
             Scanner scan1 = new Scanner(System.in);
            System.out.print("Integer: ");
            int a = next.scan1();
            Scanner scan3 = new Scanner(System.in);
            System.out.print("Integer: ");
            int c = next.scan3();
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Integer: ");
            int b = next.scan2();
        }
        else{
            System.out.println("Error")
        }
    }
}
