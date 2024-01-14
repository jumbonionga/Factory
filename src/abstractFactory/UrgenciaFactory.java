package abstractFactory;

public class UrgenciaFactory implements IAbstractFactory {

    @Override
    public INotificacion getNotificacion(String notificacion) {
        return null;
    }

    @Override
    public IUrgencia getUrgencia(String urgencia) {
        if(urgencia.equalsIgnoreCase("urgente")) {
            return new UrgenteNotificacion();
        } else if(urgencia.equalsIgnoreCase("regular")) {
            return new RegularNotificacion();
        }
        throw new IllegalArgumentException("Unknown urgency type");
    }
}
