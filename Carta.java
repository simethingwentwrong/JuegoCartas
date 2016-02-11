
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // valor que tomara la carta
    private int valor;
    // palo que tiene la carta
    private String palo;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor, String palo)
    {
        this.valor = valor;
        this.palo = palo;

    }

    /**
     *  devuelve una cadena con el nombre de la carta.
     */
    public String getNombre()
    {
        String nombre;
        if(valor == 1)
        {
            nombre = ( "A de " + palo); 
        }
        else if(valor == 11)
        {
            nombre = ( "J de " + palo);
        }
        else if(valor == 12)
        {
            nombre = ( "Q de " + palo);
        }
        else if(valor == 13)
        {
            nombre = ( "K de " + palo);
        }
        else
        {
            nombre = ( valor + " de " + palo);
        }
        return nombre;

    }

    /**
     * retorna un entero con el valor correspondiente a la carta 
     */
    public int getValor()
    {
        return valor;
    }

    /**
     *  retorna una cadena que contiene el palo correspondiente a la carta
     */
    public String getPalo()
    {
        return palo;
    }
}
