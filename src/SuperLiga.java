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


}
