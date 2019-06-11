import java.util.Scanner;

public class Script {

    static String[] Kraje = new String[] {"Polska", "Finlandia", "Szwecja", "Norwegia", "Islandia", "Dania", "Niemcy", "Włochy"};
    static String MiejsceUrodzenia;
    static int OstatniCharacter;
    static String KrajUrodzenia;
    static Boolean TechBoolean;
    static int TechInt;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz Miejsce urodzenia w formie - Kraj/Miasto");
        MiejsceUrodzenia = input.nextLine();

        if ((MiejsceUrodzenia != null) && (MiejsceUrodzenia != "") && (!MiejsceUrodzenia.isEmpty())) {

            for (int i = 0; (Kraje.length >= (i+1) ); i++) {

                if (MiejsceUrodzenia.contains(Kraje[i])) {

                   TechInt = 1;
                    //;TechBoolean = true;
                }
            }

            switch (TechInt) {
                case 1:

                    //if (TechBoolean = true); {

                    if (MiejsceUrodzenia.contains("/")) {

                        for (int i = 0; (MiejsceUrodzenia.length() >= (i + 1)); i++) {

                            //System.out.println(MiejsceUrodzenia.substring((i),(i + 1))+i);

                            if (MiejsceUrodzenia.substring((i), (i + 1)).contains("/")) {

                                OstatniCharacter = (i);
                                System.out.println("Numer ostatniego znaku przed slashem(ale nie z Guns&Roses :P) to: " + OstatniCharacter);

                                KrajUrodzenia = MiejsceUrodzenia.substring(0, OstatniCharacter);

                                System.out.println("");
                                System.out.println("Kraj urodzenia to: " + KrajUrodzenia);
                            }
                        }

                    } else

                        System.out.println("Miejsce urodzenia to: " + MiejsceUrodzenia);
                    break;

                default:
                    System.out.println("Wpisanego kraju nie ma na liście, spróbuj ponownie");
            //}
            }
        } else

            System.out.println("Miejsce urodzenia nie ma wartości, wpisz coś ponownie");
    }
}








