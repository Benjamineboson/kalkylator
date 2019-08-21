import java.util.Scanner;
public class kalkylator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;

        while (i <= 1) {
            double talEtt;
            double talTva;
            String rakneSatt;

    System.out.println("Knappa in tal #1: ");
    talEtt = Double.parseDouble(scan.next());

    System.out.println("Välj räknesätt: ");
    rakneSatt = scan.next();

    System.out.println("Knappa in tal #2: ");
    talTva = Double.parseDouble(scan.next());


            if (rakneSatt.charAt(0) == '+') {
                plus(talEtt, talTva);
            } else if (rakneSatt.charAt(0) == '-') {
                minus(talEtt, talTva);
            } else if (rakneSatt.charAt(0) == '*') {
                ganger(talEtt, talTva);
            } else {
                delat(talEtt, talTva);

            }
            i = scan.nextInt();
        }

    }

    private static void plus(double plusEtt, double plusTva) {
        double plusSvar = plusEtt + plusTva;
        System.out.println("Resultatet är: " + plusSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
    }

    private static void minus(double minusEtt, double minusTva) {
        double minusSvar = minusEtt - minusTva;
        System.out.println("Resultatet är: " + minusSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
    }

    private static void ganger(double gangerEtt, double gangerTva) {
        double gangerSvar = gangerEtt * gangerTva;
        System.out.println("Resultatet är: " + gangerSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
    }

    private static void delat(double delatEtt, double delatTva) {
        double delatSvar = delatEtt / delatTva;
        String temp = String.valueOf(delatSvar);
        if (temp.contains("NaN")){
            System.out.println("Nu blev det fel! Försök igen och dela inte 0 med 0.");
        }else {
            System.out.println("Resultatet är: " + temp);
        }
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
        }


}


