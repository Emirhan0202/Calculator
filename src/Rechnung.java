/**
 * Author: Emirhan Bekmez
 * Date: 11.05.2022
 * Version: 0.1
 **/

public class Rechnung {
    /**
     * Erstellen der Instanzvariablen
     **/
    private double linkerWert;
    private double rechterWert;
    private String operatorR;

    /**
     * Erstellen einer Konstruktors fürs Rechnen mit zwei Werten
     **/
    public Rechnung(double linkerWert, double rechterWert, String operatorR) {
        this.linkerWert = linkerWert;
        this.rechterWert = rechterWert;
        this.operatorR = operatorR;
    }

    /**
     * Erstellen einer Konstruktors fürs Rechnen mit einem linken Wert
     **/
    public Rechnung(double linkerWert, String operatorR) {
        this.linkerWert = linkerWert;
        this.rechterWert = 0;
        this.operatorR = operatorR;
    }

    /**
     * Erstellen einer Methode für das Rechnen mit verschiedenen Operatoren(+,-,*,/,wurzel und potenzen)
     **/
    public double rechne(){
        if (operatorR.equals("+")){
            return linkerWert + rechterWert;
        }

        if (operatorR.equals("-")){
            return linkerWert - rechterWert;
        }

        if (operatorR.equals("*")){
            return linkerWert * rechterWert;
        }

        if (operatorR.equals("/")){
            return linkerWert / rechterWert;
        }

        if (operatorR.equals("w")){
            return Math.sqrt(linkerWert);
        }

        if (operatorR.equals("^")){
            return Math.pow(linkerWert, rechterWert);
        }
        // Rückgabe wert bei keinem zutreffenden if-bedienungen
        return -1;
    }
}

