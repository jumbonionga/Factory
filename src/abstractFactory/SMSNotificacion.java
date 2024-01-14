package abstractFactory;

public class SMSNotificacion implements INotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviar por SMS:\n"+mensaje);
    }
}
