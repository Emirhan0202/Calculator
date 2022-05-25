/**
 * Author: Emirhan Bekmez
 * Date: 28.04.2022
 * Version: 0.1
 **/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Gebe eine Rechnung ein in der Form (Zahl + - * / (w -für wurzel) ^ für potenzieren Zahl2) ");
            String eingabe = sc1.nextLine();
            EingabeTeiler eingabeTeiler = new EingabeTeiler(eingabe);
            Rechnung rechnung = eingabeTeiler.parser();
            System.out.println(rechnung.rechne());
        }
    }
}
