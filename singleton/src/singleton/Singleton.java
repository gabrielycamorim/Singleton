package singleton;

public final class Singleton {
	private static Singleton instancia;
    public String value;

    private Singleton(String value) {
       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstancia(String value) {
        if (instancia == null) {
            instancia = new Singleton(value);
        }
        return instancia;
    }
}

