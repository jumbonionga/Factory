package abstractFactory;

public interface IAbstractFactory {
    INotificacion getNotificacion(String notificacion);
    IUrgencia getUrgencia(String urgencia);
}
