public class SynBlock{
    void printTable(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }//end of the method
}
class Thread1 extends Thread{
    SynBlock t;
    Thread1(SynBlock t){
        this.t=t;
    }
    public void run(){
        t.printTable(6);
    }
}
class Thread2 extends Thread{
    SynBlock t;
    Thread2(SynBlock t){
        this.t=t;
    }
    public void run(){
        t.printTable( 50);
    }
}
class TestSynchronizedBlock1{
    public static void main(String args[]){
        SynBlock obj = new SynBlock();//only one object
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}
