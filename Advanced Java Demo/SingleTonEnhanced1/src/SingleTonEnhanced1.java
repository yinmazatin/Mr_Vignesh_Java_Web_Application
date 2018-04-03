
public class SingleTonEnhanced1 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() 
            {
                SIngletonClass sc1 = SIngletonClass.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() 
            {
                SIngletonClass sc2 = SIngletonClass.getInstance();
            }
        });
        
        t1.start();
        t2.start();
    }
}
