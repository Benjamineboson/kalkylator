import java.util.Scanner;
public class Kalkylator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        double talEtt = 0;
        double talTva = 0;
        byte x = 1;
        while (i <= 1) {
            x = 1;
            String rakneSatt;


            System.out.println("Knappa in tal #"+x+": ");
            talEtt = felHantering(talEtt);
            x++;

            System.out.println("Välj räknesätt: ");
            rakneSatt = scan.next();

            System.out.println("Knappa in tal #"+x+": ");
            talTva = felHanteringTva(talTva);
            x++;

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

    static double felHantering(double talEtt){
        Scanner scan = new Scanner(System.in);
        try {
            talEtt = Double.parseDouble(scan.next());
            return(talEtt);
        }catch (NumberFormatException exception){
            System.out.print("Använd bara siffror! Försök igen!"+"\n");
            return(talEtt);

        }

    }


    static double felHanteringTva(double talTva){
        Scanner scan = new Scanner(System.in);

        try {
            talTva = Double.parseDouble(scan.next());
            return(talTva);
        }catch (NumberFormatException exception){
            System.out.print("Använd bara siffror! Försök igen!"+"\n");
            return(talTva);
        }
    }



    public static void plus(double plusEtt, double plusTva) {
        double plusSvar = plusEtt + plusTva;
        System.out.println("Resultatet är: " + plusSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
    }


    static void minus(double minusEtt, double minusTva) {
        double minusSvar = minusEtt - minusTva;
        System.out.println("Resultatet är: " + minusSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
    }

    static void ganger(double gangerEtt, double gangerTva) {
        double gangerSvar = gangerEtt * gangerTva;
        System.out.println("Resultatet är: " + gangerSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
    }

    static void delat(double delatEtt, double delatTva) {
        double delatSvar = delatEtt / delatTva;
        String temp = String.valueOf(delatSvar);
        if (temp.contains("NaN")){
            System.out.println("Nu blev det fel! Försök igen och dela inte 0 med 0.");
        }else {
            System.out.println("Resultatet är: " + temp);
        }
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
        }


        // For loop som går antal ggr som antalet nummer använda.length

}


