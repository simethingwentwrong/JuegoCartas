import java.util.*;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    //Variable que representa el numero de identificación del jugador
    private int id;
    //Variable que representa las cartas que tiene el jugador
    private ArrayList<Carta> cartasDelJugador;
    private Mazo cartas;
    //Variable que representa el número de cartas que tiene el jugador
    private int numeroDeCartas;
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(int id)
    {
        int index = 0;
        this.id= id;
        cartas = new Mazo();
        cartasDelJugador = new ArrayList<>();
        index++;
        cartas.barajar();
        numeroDeCartas = 0;
        
    }

    /**
     * 
     */
    public int getId()
    {
       return id;
    }
    
    /**
     * 
     */
    public int getNumeroDeCartas(){
        return numeroDeCartas;
    }
    
    /**
     * Método que le permite al jugador recibir una carta
     */
    public void recibirCarta(Carta unaCarta){
       cartasDelJugador.add(unaCarta);
       numeroDeCartas++;
    }
    
    /**
     * Muestra las cartas que tiene en la mano
     */
    public ArrayList<Carta> cartasQueTieneEnLaMano(){
        return cartasDelJugador;
    }
}
