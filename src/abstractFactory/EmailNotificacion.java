package abstractFactory;

public class EmailNotificacion implements INotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviar por correo:\n"+mensaje);
    }
}
