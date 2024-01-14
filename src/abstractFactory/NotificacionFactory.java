package abstractFactory;

public class NotificacionFactory implements IAbstractFactory{

    @Override
    public INotificacion getNotificacion(String notificacion) {
        if(notificacion.equalsIgnoreCase("email")) {
            return new EmailNotificacion();
        } else if(notificacion.equalsIgnoreCase("sms")) {
            return new SMSNotificacion();
        } else if(notificacion.equalsIgnoreCase("app")) {
            return new AppNotificacion();
        }

        throw new IllegalArgumentException("Unknown notification type");
    }

    @Override
    public IUrgencia getUrgencia(String urgencia) {
        return null;
    }
}
