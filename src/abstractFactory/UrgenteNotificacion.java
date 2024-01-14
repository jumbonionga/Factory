package abstractFactory;

public class UrgenteNotificacion implements IUrgencia {

    @Override
    public void definirUrgencia() {
        System.out.println("Mensaje Urgente");
    }
}
