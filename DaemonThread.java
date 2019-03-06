class DaemonThread extends Thread{
    public void run(){
        System.out.println("This thread is a daemon thread : " + Thread.currentThread().isDaemon());
    }
}
class NDThread{
    public static void main(String[] args){
        DaemonThread dt = new DaemonThread();
        System.out.println("Behaviour before setDaemon(): " + dt.isDaemon());
        dt.setDaemon(true);
        dt.start();
        System.out.println("Behaviour after setDaemon(): " + dt.isDaemon());
    }
}
