package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
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
                                                                                // impos�s
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float c = (float)((f - 32) * 5) / 9;
        return Float.parseFloat(String.format("%.1f", c)); // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
    }

}
