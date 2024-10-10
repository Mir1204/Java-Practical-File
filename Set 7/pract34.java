public class pract34 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        
    }
}

class Thread1 extends Thread {
    public void run() {
        int i=0;
        while (i<5) {
            int n = (int) (Math.random() * 100);
            System.out.println("Generated number: " + n);
            if (n % 2 == 0) {
                new Thread2(n).start();
            } else {
             
                new Thread3(n).start();
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
        System.out.println("23DCS086 Mir");
    }
}

class Thread2 extends Thread {
    private int n;

    Thread2(int n) {
        this.n = n;
        setName("EvenThread"); 
    }

    public void run() {
        System.out.println(getName() + ": Square of " + n + " is " + (n * n));
    }
}

class Thread3 extends Thread {
    private int n;

    Thread3(int n) {
        this.n = n;
        setName("OddThread"); 
    }

    public void run() {
        System.out.println(getName() + ": Cube of " + n + " is " + (n * n * n));
    }
}
