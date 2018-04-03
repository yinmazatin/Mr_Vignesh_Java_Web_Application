package singletonpatternbasic;
public class SingletonClass 
{
    static SingletonClass stc = new SingletonClass();
    private SingletonClass()
    {
    }
    public void sayHello()
    {
        System.out.println("Hello...");
    }
    
    public static SingletonClass getInstance()
    {
        return stc;
    }
}
