
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
    public void getNombre()
    {

        if(valor == 1)
        {
            System.out.println( "A de " + palo); 
        }
        else if(valor == 11)
        {
            System.out.println( "J de " + palo);
        }
        else if(valor == 12)
        {
            System.out.println( "Q de " + palo);
        }
        else if(valor == 13)
        {
            System.out.println( "K de " + palo);
        }
        else
        {
            System.out.println( valor + " de " + palo);
        }

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
