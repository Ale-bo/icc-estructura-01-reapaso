
import Models.Persona;
import Controllers.PersonaController;
import Views.ViewsConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {

            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel",40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
        };
        PersonaController Pc= new PersonaController();
        ViewsConsole vc = new ViewsConsole();

        

        vc.printMessage("Listado de personas");
        vc.printPersonsArray(personas);

        vc.printMessage("Listado de personas ordenados");
        Pc.ordenarPorEdad(personas);
        vc.printPersonsArray(personas);
        
        Persona PersonaBuscada = Pc.buscarPorEdad(personas, 40);
        if (PersonaBuscada == null) {
            vc.printMessage("No se encontro la persona con edad 40");
        } else {
            vc.printMessage("La persona con edad 40 es " + PersonaBuscada);
            vc.printMessage(PersonaBuscada.toString());
        }

        vc.printMessage("Buscar persona con edad 99");
        Persona PersonaBuscada2 = Pc.buscarPorEdad(personas, 99);
        if (PersonaBuscada2 == null) {
            vc.printMessage("No se encontro la persona con edad 99");
        } else {
            vc.printMessage("La persona con edad 99 es " + PersonaBuscada2);
            vc.printMessage(PersonaBuscada2.toString());
        }
        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
