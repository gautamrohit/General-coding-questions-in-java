  
class Call_me{
    synchronized void call(String msg)
    {
        System.out.print("["+msg);
    
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
        System.out.println("Interrupted");
    }
    System.out.println("]");
}}
class caller implements Runnable{
    String msg;
    Call_me target;
    Thread t;
    public caller(Call_me targ, String s)
    {
        target=targ;
        msg=s;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        target.call(msg);
    }
}

public class Synchronization {
    public static void main(String args[]){
        Call_me target=new Call_me();
        caller obj1=new caller(target,"hello");
        caller obj2=new caller(target,"synchronized");
        caller obj3=new caller(target,"world");
        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }
    
}
