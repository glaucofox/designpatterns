package designpatterns.creational.singleton.example2;

public class Singleton 
{
    public static void main(String[] args) {
        Foo camisa9 = Foo.getInstance();
        Foo camisa10 = Foo.getInstance();
    
        camisa9.name = "Ronaldo";
        System.out.println("Alterado camisa 9 ");
        displayNames(camisa9, camisa10);
        
        camisa10.name = "Romario";
        System.out.println("Alterado camisa 10");
        displayNames(camisa9, camisa10);
    }
    
    public static void displayNames(Foo camisa9, Foo camisa10) {
        System.out.println("Nome do camisa 9: " + camisa9.name);
        System.out.println("Nome do camisa 10: " + camisa10.name);
    }
    
}
