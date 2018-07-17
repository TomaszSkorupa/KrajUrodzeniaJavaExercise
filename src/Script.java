import java.util.Scanner;

public class Script {

    public static String MiejsceUrodzenia;
    public static int OstatniCharacter;
    public static String KrajUrodzenia;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz Miejsce urodzenia w formie - Kraj/Miasto");
        MiejsceUrodzenia = input.nextLine();

        if ((MiejsceUrodzenia != null) && (MiejsceUrodzenia != "") && (!MiejsceUrodzenia.isEmpty())) {

            if (MiejsceUrodzenia.contains("/")) {

                for (int i = 0; (MiejsceUrodzenia.length() >= (i + 1)); i++) {

                    //System.out.println(MiejsceUrodzenia.substring((i),(i + 1))+i);

                    if (MiejsceUrodzenia.substring((i), (i + 1)).contains("/")) {

                        OstatniCharacter = (i);
                        System.out.println("Numer ostatniego znaku przed slashem to: " + OstatniCharacter);

                        KrajUrodzenia = MiejsceUrodzenia.substring(0, OstatniCharacter);

                        System.out.println("");
                        System.out.println("Kraj urodzenia to: " + KrajUrodzenia);
                    }
                }
            } else

                System.out.println("Miejsce urodzenia to: " + MiejsceUrodzenia);

        } else {

            System.out.println("Miejsce urodzenia nie ma wartości, wpisz coś");
        }
    }
}








