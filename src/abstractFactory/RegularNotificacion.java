package abstractFactory;

public class RegularNotificacion implements IUrgencia {

    @Override
    public void definirUrgencia() {
        System.out.println("Mensaje regular");
    }
}
