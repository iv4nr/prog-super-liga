public class Equipos {

    private int codigo;
    private String nombre;
    private String pais;
    private int puntos;

    /**
     * Metodo constructor de Equipos
     * @param codigo codigo del equipo
     * @param nombre nombre del equipo
     * @param pais pais del equipo
     * @param puntos puntos del equipo
     */
    public Equipos(int codigo, String nombre, String pais, int puntos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.puntos = puntos;
    }

    /**
     *Devuelve el codigo del equipo
     * @return int codigo del equipo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Devuelve el nombre del equipo
     * @return String nombre del equipo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la ciudad del equipo
     * @return String ciudad del equipo
     */
    public String getpais() {
        return pais;
    }

    /**
     * Devuelve los puntos del equipo
     * @return int puntos del equipo
     */
    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Equipo { ");
        sb.append(String.format("Codigo: %d", codigo));
        sb.append(String.format(", Nombre: %s", nombre));
        sb.append(String.format(", Pais: %s", pais));
        sb.append(String.format(", Puntos: %d", puntos));
        sb.append(" }");
        return sb.toString();
    }

    /**
     * Actualiza el numero de puntos que tiene un equipo.
     * Comprueba que el nuemro recibido sea mayor que 0.
     * @param numPuntos nueva cantidad de puntos
     * @return true si ha podido cambiarse, false si no ha podido
     */
    public boolean actualizarPuntos(int numPuntos) {
        boolean resultado;

        if(numPuntos <= 0) {
            resultado = false;
        } else  {
            this.puntos = numPuntos;
            resultado = true;
        }
        return resultado;
    }



}
