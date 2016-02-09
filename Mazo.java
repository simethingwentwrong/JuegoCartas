import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // array list de las cartas del mazo
    private ArrayList <Carta> mazo;
    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        mazo = new ArrayList <Carta>();
        mazo.add(new Carta(1,"corazones"));
        mazo.add(new Carta(2,"corazones"));
        mazo.add(new Carta(3,"corazones"));
        mazo.add(new Carta(4,"corazones"));
        mazo.add(new Carta(5,"corazones"));
        mazo.add(new Carta(6,"corazones"));
        mazo.add(new Carta(7,"corazones"));
        mazo.add(new Carta(8,"corazones"));
        mazo.add(new Carta(9,"corazones"));
        mazo.add(new Carta(10,"corazones"));
        mazo.add(new Carta(11,"corazones"));
        mazo.add(new Carta(12,"corazones"));
        mazo.add(new Carta(13,"corazones"));
        
        mazo.add(new Carta(1,"diamantes"));
        mazo.add(new Carta(2,"diamantes"));
        mazo.add(new Carta(3,"diamantes"));
        mazo.add(new Carta(4,"diamantes"));
        mazo.add(new Carta(5,"diamantes"));
        mazo.add(new Carta(6,"diamantes"));
        mazo.add(new Carta(7,"diamantes"));
        mazo.add(new Carta(8,"diamantes"));
        mazo.add(new Carta(9,"diamantes"));
        mazo.add(new Carta(10,"diamantes"));
        mazo.add(new Carta(11,"diamantes"));
        mazo.add(new Carta(12,"diamantes"));
        mazo.add(new Carta(13,"diamantes"));
        
        mazo.add(new Carta(1,"picas"));
        mazo.add(new Carta(2,"picas"));
        mazo.add(new Carta(3,"picas"));
        mazo.add(new Carta(4,"picas"));
        mazo.add(new Carta(5,"picas"));
        mazo.add(new Carta(6,"picas"));
        mazo.add(new Carta(7,"picas"));
        mazo.add(new Carta(8,"picas"));
        mazo.add(new Carta(9,"picas"));
        mazo.add(new Carta(10,"picas"));
        mazo.add(new Carta(11,"picas"));
        mazo.add(new Carta(12,"picas"));
        mazo.add(new Carta(13,"picas"));
        
        mazo.add(new Carta(1,"treboles"));
        mazo.add(new Carta(2,"treboles"));
        mazo.add(new Carta(3,"treboles"));
        mazo.add(new Carta(4,"treboles"));
        mazo.add(new Carta(5,"treboles"));
        mazo.add(new Carta(6,"treboles"));
        mazo.add(new Carta(7,"treboles"));
        mazo.add(new Carta(8,"treboles"));
        mazo.add(new Carta(9,"treboles"));
        mazo.add(new Carta(10,"treboles"));
        mazo.add(new Carta(11,"treboles"));
        mazo.add(new Carta(12,"treboles"));
        mazo.add(new Carta(13,"treboles"));
    }

    /**
     * baraja el mazo de cartas.
     */
    public void barajar()
    {
        Collections.shuffle(mazo);
    }
    
    /**
     * retorna la primera carta del mazo y modifica el estado del mazo para reflejar que esa carta ya no se encuentra en el mazo. En caso de que no queden cartas en el mazo devuelve null.
     */
    public Carta tomarPrimera()
    {
        Carta primera = null;
        if (mazo.size() > 0)
        {
            primera = mazo.get(0);
            mazo.remove(0);
        }
        return primera;
    }
    
    /**
     * retorna el número de cartas que quedan en el mazo.
     */
    public int quedan()
    {
        return mazo.size();
    }

}
