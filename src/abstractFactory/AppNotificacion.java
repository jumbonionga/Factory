package abstractFactory;

public class AppNotificacion implements INotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviar por app:\n"+mensaje);
    }
}
