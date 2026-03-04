public class Main {
    public static void main(String[] args) {

        SuperLiga PrimeraDivision = new SuperLiga(18);

        Equipos equipo1 = new Equipos(1, "Real Madrid","España",56);
        Equipos equipo2 = new Equipos(2,"Bayer de Munich", "Alemania", 45);
        Equipos equipo3 = new Equipos(3, "Arsenal", "Inglaterra", 50);

        System.out.println("Equipo registrado = " + PrimeraDivision.registrarEquipo(equipo1));
        System.out.println("Equipo registrado = " + PrimeraDivision.registrarEquipo(equipo2));
        System.out.println("Equipo registrado = " + PrimeraDivision.registrarEquipo(equipo3));

        System.out.println("El equipo buscado: " + PrimeraDivision.buscarEquipo(1));
        System.out.println("El equipo buscado: " + PrimeraDivision.buscarEquipo(5));

        System.out.println("Los equipos registrados son: " + PrimeraDivision.contarEquipos());

        System.out.println(PrimeraDivision.mostrarEquipos());

    }
}
