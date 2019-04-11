public class singletonTask {
    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                SunLife obj = SunLife.getInstance();

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SunLife obj = SunLife.getInstance();


            }
        });

        t1.start();
        t2.start();

    }
}

class SunLife {
    public static SunLife obj;

    private SunLife() {

        System.out.println("instance created");

    }

    public static synchronized SunLife getInstance() {
        if (obj == null) {
            obj = new SunLife();
        }
        return obj;
    }
}
