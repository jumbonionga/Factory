package abstractFactory;

public class AbstractFactory {
    public static IAbstractFactory getFactory(String factory) {
        if(factory.equalsIgnoreCase("notificacion")) {
            return new NotificacionFactory();
        } else if (factory.equalsIgnoreCase("urgencia")) {
            return new UrgenciaFactory();
        }

        throw new IllegalArgumentException("Unknown factory type");
    }
}
