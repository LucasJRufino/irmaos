

public class ListaAcesso {
    static String Lista = "";

    public static void add( String usuario, String acao){
    Lista += usuario + " | " + acao + " | " + java.time.LocalDate.now() + "\n";
    }
    
    public static String read(){
    return Lista;
    }
}
