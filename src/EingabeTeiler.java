/**
 * Author: Emirhan Bekmez
 * Date: 28.04.2022
 * Version: 0.1
 **/


public class EingabeTeiler {

    private final String rechenAufgabe;

    public EingabeTeiler(String rechenAufgabe) {
        this.rechenAufgabe = rechenAufgabe;
    }

    public Rechnung parser() {

        String aufgabe = rechenAufgabe.trim();
        aufgabe = aufgabe.replace(" ", "");
        String operatorRegex= "";
        String operator= "";
        Rechnung rechnung=null;

        String[] split =null;

        double links = 0;
        double rechts = 0;

        if(aufgabe.contains("+")) {
            split=aufgabe.split("[\\+]+");
            links = Double.parseDouble(split[0]);
            rechts = Double.parseDouble(split[1]);
            rechnung = new Rechnung(links, rechts, "+");

        }else if (aufgabe.contains("-")){
            split=aufgabe.split("-");
            links = Double.parseDouble(split[0]);
            rechts = Double.parseDouble(split[1]);
            rechnung = new Rechnung(links, rechts, "-");

        }else if (aufgabe.contains("*")){
            split=aufgabe.split("[\\*]+");
            links = Double.parseDouble(split[0]);
            rechts = Double.parseDouble(split[1]);
            rechnung = new Rechnung(links, rechts, "*");

        }else if (aufgabe.contains("/")){
            split=aufgabe.split("/");
            links = Double.parseDouble(split[0]);
            rechts = Double.parseDouble(split[1]);
            rechnung = new Rechnung(links, rechts, "/");

        }else if(aufgabe.contains(("w"))){
            split=aufgabe.split("w");
            links = Double.parseDouble(split[0]);
            rechnung = new Rechnung(links, "w");
        }else if(aufgabe.contains(("^"))){
            split=aufgabe.split("[\\^]+");
            links = Double.parseDouble(split[0]);
            rechts = Double.parseDouble(split[1]);
            rechnung = new Rechnung(links, rechts, "^");

        }

        return rechnung;
    }
}



