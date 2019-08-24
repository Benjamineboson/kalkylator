import java.util.Scanner;
public class Kalkylator {
    private static boolean killSwitch;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double talEtt = 0;
        int i = 1;
        while (!killSwitch) {
            String rakneSatt;
            System.out.println("Knappa in tal #1: ");
            talEtt = felHantering(talEtt);
            String talEttToString = String.valueOf(talEtt);
            System.out.println("Välj räknesätt: ");
            rakneSatt = scan.next();
            if (rakneSatt.charAt(0) == '+') {
                plusFleraParam(talEttToString);
            }else if (rakneSatt.charAt(0) == '-') {
                minusFleraParam(talEttToString);
            }else if (rakneSatt.charAt(0) == '*') {
                gangerFleraParam(talEttToString);
            }else if (rakneSatt.charAt(0) == '/') {
                delatFleraParam(talEttToString);
            }
                System.out.println("För att börja räkna tryck 1, för att avsluta programmet tryck 2: ");
                i = scan.nextInt();
                if (i == 2){
                    killSwitch = true;
                }
        }
    }



    static double felHantering(double talEtt){
        Scanner scan = new Scanner(System.in);
        try {
            talEtt = Double.parseDouble(scan.next());
            return(talEtt);
        }catch (NumberFormatException exception){
            System.out.print("Använd bara siffror! Försök igen!"+"\n");
            killSwitch = true;
            return(talEtt);
        }
    }


    static double felHanteringTva(double talEtt){
        Scanner scan = new Scanner(System.in);
        try {
            talEtt = Double.parseDouble(scan.next());
            return(talEtt);
        }catch (NumberFormatException exception){
            System.out.print("Använd bara siffror! Försök igen!"+"\n");
            return(talEtt);
        }
    }


    public static double plus(double plusEtt, double plusTva) {
        double plusSvar = plusEtt + plusTva;
        System.out.println("Resultatet är: " + plusSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
        return plusSvar;
    }


    public static double minus(double minusEtt, double minusTva) {
        double minusSvar = minusEtt - minusTva;
        System.out.println("Resultatet är: " + minusSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
        return minusSvar;
    }


    public static double ganger(double gangerEtt, double gangerTva) {
        double gangerSvar = gangerEtt * gangerTva;
        System.out.println("Resultatet är: " + gangerSvar);
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
    return gangerSvar;
    }


    public static double delat(double delatEtt, double delatTva) {
        double delatSvar = delatEtt / delatTva;
        String temp = String.valueOf(delatSvar);
        if (temp.contains("NaN")){
            System.out.println("Nu blev det fel! Försök igen och dela inte 0 med 0.");
        }else {
            System.out.println("Resultatet är: " + temp);
        }
        System.out.println("För att fortsätta tryck 1, För att avbryta tryck 2: ");
    return delatSvar;
    }


    public static void plusFleraParam (String talEttToString) {
        Scanner scan = new Scanner(System.in);
        byte keepAlive = 0;
        double talEtt = 0;
        double talTva = Double.parseDouble(talEttToString);
        while (keepAlive < 2) {
            System.out.print(talTva+" + ");
            talEtt = felHanteringTva(talEtt);
            double svar = talEtt + talTva;
            talTva = svar;
            System.out.println("= " + talTva);
            System.out.print("För att fortsätta addera med tal: "+talTva+" tryck 1, för att avbryta tryck 2: ");
            keepAlive = scan.nextByte();
            String svarToString = String.valueOf(svar);
        }
        return;
    }


    public static void minusFleraParam (String talEttToString) {
        Scanner scan = new Scanner(System.in);
        byte keepAlive = 0;
        double talEtt = 0;
        double talTva = Double.parseDouble(talEttToString);
        while (keepAlive < 2) {
            System.out.print(talTva+" - ");
            talEtt = felHanteringTva(talEtt);
            double svar = talTva - talEtt;
            talTva = svar;
            System.out.println("= " + talTva);
            System.out.print("För att fortsätta subtrahera med tal: "+talTva+" tryck 1, för att avbryta tryck 2: ");
            keepAlive = scan.nextByte();
            String svarToString = String.valueOf(svar);
        }
        return;
    }


    public static void gangerFleraParam (String talEttToString) {
        Scanner scan = new Scanner(System.in);
        byte keepAlive = 0;
        double talEtt = 0;
        double talTva = Double.parseDouble(talEttToString);
        while (keepAlive < 2) {
            System.out.print(talTva+" * ");
            talEtt = felHanteringTva(talEtt);
            double svar = talTva * talEtt;
            talTva = svar;
            System.out.println("= " + talTva);
            System.out.print("För att fortsätta multiplicera med tal: "+talTva+" tryck 1, för att avbryta tryck 2: ");
            keepAlive = scan.nextByte();
            String svarToString = String.valueOf(svar);
        }
        return;
    }


    public static void delatFleraParam (String talEttToString) {
        Scanner scan = new Scanner(System.in);
        byte keepAlive = 0;
        double talEtt = 0;
        double talTva = Double.parseDouble(talEttToString);
        while (keepAlive < 2) {
            System.out.print(talTva+" / ");
            talEtt = felHanteringTva(talEtt);
            double svar = talTva / talEtt;
            talTva = svar;
            String temp = String.valueOf(talTva);
            if (temp.contains("NaN")){
                System.out.println("Nu blev det fel! Försök igen och dela inte 0 med 0.");
            }else {
                System.out.println("= " + talTva);
            }
            System.out.print("För att fortsätta dividera med tal: "+talTva+" tryck 1, för att avbryta tryck 2: ");
            keepAlive = scan.nextByte();
            String svarToString = String.valueOf(svar);
        }
        return;
    }

}



