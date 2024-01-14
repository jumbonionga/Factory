import abstractFactory.AbstractFactory;
import abstractFactory.IAbstractFactory;
import abstractFactory.INotificacion;
import abstractFactory.IUrgencia;

public class Main {
    public static void main(String[] args) {

        // Single factory
        singleFactory.DocumentFactory factory = new singleFactory.DocumentFactory();
        singleFactory.IDocument doc = factory.createDocument("pdf");
        doc.open();
        doc.close();

        // Abstract factory
        IAbstractFactory fabricaNotificacion = AbstractFactory.getFactory("notificacion");
        IAbstractFactory fabricaUrgencia = AbstractFactory.getFactory("urgencia");
        INotificacion email = fabricaNotificacion.getNotificacion("app");
        email.enviarMensaje("Llega notificacion");
        IUrgencia urgente = fabricaUrgencia.getUrgencia("regular");
        urgente.definirUrgencia();
    }
}