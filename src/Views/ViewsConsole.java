package Views;
import Models.Persona;

public class ViewsConsole {

    public void printPersonsArray(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
        System.out.println(personas [i] + "-");
        }
    }
    public void printMessage(String menssage) {
        System.out.println(menssage);
    }
    
}
