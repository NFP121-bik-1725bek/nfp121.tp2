package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        int f;
        float c;
        for(String arg: args) {
            f = Integer.parseInt(arg);
            c = fahrenheitEnCelsius(f);
            System.out.println(f + "\u00B0F -> " + c + "\u00B0C");
        } // ligne,
                                                                                // format
                                                                                // imposés
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float c = (float)((f - 32) * 5) / 9;
        return Float.parseFloat(String.format("%.1f", c)); // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }

}
