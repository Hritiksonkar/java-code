public class HelloRunnable implements Runnable{
    public void run();{
        System.out.println("Hello frome a threde");
    }

    public static void main(String[] args) {
        (new Thread()).start(); 
    Runnable runnable=new HelloRunnable();
    Thread obj =new Thread(runnable);
    obj.start();
    obj.run();
    }
        

    }

        
    
    

