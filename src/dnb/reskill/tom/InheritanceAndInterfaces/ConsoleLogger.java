package dnb.reskill.tom.InheritanceAndInterfaces;

public class ConsoleLogger implements Logger{
    public void logStringMessage(String msg){
        System.err.println(msg);
    }
}
