import java.util.*;
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    //Variable que representa el número de jugadores
    private int numeroDeJugadores;
    //ArrayList que representa los jugadores que hay en el juego
    private ArrayList<Jugador> jugadores;
    //ArrayList que representa las cartas de un mazo
    private Mazo mazo;
    /**
     * Constructor de la clase Juego
     */
    public Juego(int numeroDeJugadores)
    {
        jugadores = new ArrayList<Jugador>();
        mazo = new Mazo();
        if (numeroDeJugadores < 2 || numeroDeJugadores > 8){
            numeroDeJugadores = 4;
        }
        else{
            this.numeroDeJugadores = numeroDeJugadores;
        }
        int id = 0;
        while (numeroDeJugadores > id ){
            jugadores.add(new Jugador(id));
            id++;
        }
    }
    
    
    /**
     * Método que nos permite repartir las cartas del mazo a los jugadores
     */
    public void repartir(){
        ArrayList<Carta> copiaMazo = new ArrayList<Carta>();
        int cartasSobrantes = copiaMazo.size() % numeroDeJugadores;
        while (mazo.quedan() != cartasSobrantes){    
            for (Jugador jugador : jugadores){
                    jugador.recibirCarta(mazo.tomarPrimera());
                }
        }
    }

    /**
     * Muestra por pantalla el id de cada jugador junto a las cartas que tiene en la mano
     */
    public void mostrarCartasJugadores(){
        for(Jugador jugador : jugadores){
            for (Carta carta : jugador.cartasQueTieneEnLaMano()){
                System.out.println(jugador.getId() + ":" + carta.getNombre());
            }
        }
    }
}