public class ThreadJoining extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+ " : " + i);
        }
    }

    public static void main(String[] args) {
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
        t1.start();
        try {
            t1.join(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}


//Output :
//
//        Thread-0 : 1
//        Thread-0 : 2
//        Thread-0 : 3
//        Thread-1 : 1
//        Thread-2 : 1
//        Thread-0 : 4
//        Thread-1 : 2
//        Thread-2 : 2
//        Thread-1 : 3
//        Thread-2 : 3
//        Thread-1 : 4
//        Thread-2 : 4
