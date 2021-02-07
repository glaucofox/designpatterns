package designpatterns.creational.singleton.example2;

public class Foo 
{
    static Foo obj = new Foo();
    public String name = "";
    
    private void Foo() 
    {
    
    }
    
    public static Foo getInstance()
    {
        return obj;
    }
}
