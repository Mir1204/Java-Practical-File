import java.util.Scanner;

public class pra33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number N (total numbers to sum): ");
        int N = scanner.nextInt();
        
        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();
        
        int sum = 0;
        Thread[] threads = new Thread[numThreads];
        Summation.sum = new int[numThreads]; 
        
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Summation(N, i, numThreads));
            threads[i].start();
        }
        
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        for (int i = 0; i < numThreads; i++) {
            sum += Summation.sum[i];
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("23DCS086 Mir");
    }
}

class Summation implements Runnable {
    static int[] sum;
    int N, start, numThreads;
    
    Summation(int N, int start, int numThreads) {
        this.N = N;
        this.start = start;
        this.numThreads = numThreads;
    }
    
    @Override
    public void run() {
        for (int i = start + 1; i <= N; i += numThreads) {
            sum[start] += i;
        }
    }
}
