public class SIngletonClass 
{
    private static SIngletonClass single;
    private SIngletonClass()
    {
        System.out.println("A new object created...");
    }
    public static synchronized SIngletonClass getInstance()
    {
        if(single==null)
        {
            single=new SIngletonClass();
        }
        return single;
    }
}
