public class Equipos {

    private int codigo;
    private String nombre;
    private String ciudad;
    private int puntos;

    /**
     * Metodo constructor de Equipos
     * @param codigo codigo del equipo
     * @param nombre nombre del equipo
     * @param ciudad ciudad del equipo
     * @param puntos puntos del equipo
     */
    public Equipos(int codigo, String nombre, String ciudad, int puntos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
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
    public String getCiudad() {
        return ciudad;
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
        sb.append(String.format(", Ciudad: %s", ciudad));
        sb.append(String.format(", Puntos: %d", puntos));
        sb.append(" }");
        return sb.toString();
    }



}
