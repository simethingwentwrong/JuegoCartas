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
    private ArrayList<Carta> mazo;
    /**
     * Constructor de la clase Juego
     */
    public Juego(int numeroDeJugadores)
    {
        if (numeroDeJugadores < 2 || numeroDeJugadores > 8){
            numeroDeJugadores = 4;
        }
        else{
            this.numeroDeJugadores = numeroDeJugadores;
        }
    }
    
    public void añadirJugadores(Jugador jugador){
        jugadores.add(jugador);
    }

    /**
     * Método que nos permite repartir las cartas del mazo a los jugadores
     */
    public void repartir(){
        ArrayList<Carta> copiaMazo = new ArrayList<Carta>();
        int cartasSobrantes = copiaMazo.size() % numeroDeJugadores;
        while (mazo.size() != cartasSobrantes){    
            for (Jugador jugador : jugadores){
                    jugador.recibirCarta();
                    mazo.remove(0);
                }
        }
    }

    /**
     * Muestra por pantalla el id de cada jugador junto a las cartas que tiene en la mano
     */
    public void mostrarCartasJugadores(){
        for(Jugador jugador : jugadores){
            System.out.println(jugador.getId() + ": " + jugador.cartasQueTieneEnLaMano());
        }
    }
}