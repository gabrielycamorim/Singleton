package singleton;

public class Teste {
	public static void main(String[] args) {
        System.out.println("Resultado:" + "\n");
        Thread threadOla = new Thread(new ThreadOla());
        Thread threadTudoBem = new Thread(new ThreadTudoBem());
        threadOla.start();
        threadTudoBem.start();
    }

    static class ThreadOla implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstancia("Ola");
            System.out.println(singleton.value);
        }
    }

    static class ThreadTudoBem implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstancia("TudoBem");
            System.out.println(singleton.value);
        }
    }
}
