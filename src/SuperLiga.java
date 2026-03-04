public class SuperLiga {
    private Equipos[] equipos;
    private final int NUM_MAX_EQUIPOS;


    public  SuperLiga(int num_equipos){
        equipos = new Equipos[num_equipos];
        NUM_MAX_EQUIPOS = num_equipos;
    }

    /**
     * Busca un equipo por codigo
     * @param codigo codigo del equipo
     * @return el equipo encontrado o null
     */
    public Equipos buscarEquipo(int codigo){
        boolean equipoEncontrado = true;
        Equipos equipo = null;

        for(int i=0; i < NUM_MAX_EQUIPOS && equipoEncontrado; i++){
            if(equipos[i] != null && equipos[i].getCodigo() == codigo){
                equipo = equipos[i];
                equipoEncontrado = false;
            }
        }
        return equipo;
    }

    /**
     * Busca la primera poscion libre
     * @return la posicion libre o -1
     */
    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for(int i=0; i < NUM_MAX_EQUIPOS && seguirBuscando; i++){
            if(equipos[i] == null){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }

    /**
     * Añade un equipo
     * @param equipo equipo recibido
     * @return true si lo ha registrado o false si no ha podido
     */
    public boolean registrarEquipo(Equipos equipo){
        boolean equipoRegistrado = false;
        int posicionEquipo;

        if (buscarEquipo(equipo.getCodigo()) == null){
            posicionEquipo = buscarPrimerHuecoLibre();
            if(posicionEquipo >= 0){
                equipos[posicionEquipo] = equipo;
                equipoRegistrado = true;
            }
        }
        return equipoRegistrado;

    }

    /**
     * Muestra todos los equipos registrados
     * @return los equipos registrados
     */
    public String mostrarEquipos(){
        StringBuilder sb = new StringBuilder("Equipos registrados: \n");
        for(int i=0; i < NUM_MAX_EQUIPOS; i++){
            if(equipos[i] != null){
                sb.append(equipos[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Cuenta todos los equipo que hay
     * @return el numero de equipos que hay
     */
    public int contarEquipos(){
        int contador = 0;

        for(int i=0; i < NUM_MAX_EQUIPOS; i++){
            if(equipos[i] != null){
                contador++;
            }
        }
        return contador;
    }
}
