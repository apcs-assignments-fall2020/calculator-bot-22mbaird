import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int m1 = Math.max(a, b);
        int m2 = Math.max( b, c);
        int m3 = Math.min( m1, m2);
        return m3;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a , int b) {
        int aba = Math.abs(a);
        int abb = Math.abs(b);
        int maxmag = Math.max(aba,abb);
        return maxmag;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a,int b) {
        double c = Math.sqrt(Math.pow(a,2)*Math.pow(b,2));
        return c; // REPLACE WITH YOUR CODE
    }
    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(medi1, medi2, medi3)); // should be 2
        System.out.println(magnitude(mgi1, mgi2)); // should be -7
        System.out.println(pythagoras(p1, p2)); // should be 5.0

        String x = ("median");
        String y = ("magnitude");
        String z = ("phythogoras");

        Scanner scan = new Scanner(System.in);
        System.out.print("Which method? ");
        String mthd = scan.next();

        boolean d = x.equals(mthd);
        boolean e = y.equals(mthd);
        boolean f = z.equals(mthd);

         if (d = true){
            Scanner med1 = new Scanner(System.in);
            System.out.print("Integer: ");
            String a = med1.next();
            Scanner med2 = new Scanner(System.in);
            System.out.print("Integer: ");
            String c = med2.next();
            Scanner med3 = new Scanner(System.in);
            System.out.print("Integer: ");
            String b = med3.next();
            int medi1 = Integer.parseInt(a);
            int medi2= Integer.parseInt(c);
            int med13 = Integer.parseInt(b);

            med1.close();
            med2.close();
            med3.close();


        }
         if (e = true){
            Scanner mag1 = new Scanner(System.in);
            System.out.print("Integer: ");
            String mg1 = mag1.next();
            Scanner mag2 = new Scanner(System.in);
            System.out.print("Integer: ");
            String mg2 = mag2.next();
            int mgi1 = Integer.parseInt(mg1);
            int mgi2 = Integer.parseInt(mg2);
            mag1.close();
            mag2.close();
            
        }
        if (f = true){
             Scanner py1 = new Scanner(System.in);
            System.out.print("Integer: ");
            String p1 = py1.next();
            Scanner py2 = new Scanner(System.in);
            System.out.print("Integer: ");
            String p2 = py2.next();
            int pi1 = Integer.parseInt(p1);
            int pi2 = Integer.parseInt(p2);
            py1.close();
            py2.close();
           
        }
        else{
            System.out.println("Error");
        }
        scan.close();
    }
}
