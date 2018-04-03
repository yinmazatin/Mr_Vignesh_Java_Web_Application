package singletonpatternbasic;
public class MainClass 
{
    public static void main(String[] args) 
    {
        SingletonClass stc = SingletonClass.getInstance();
        SingletonClass stc1 = SingletonClass.getInstance();
        stc.sayHello();
        stc1.sayHello();
    }
}
