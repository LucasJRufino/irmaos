


import java. time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ListaAcesso {
    static String Lista = "";

    public static void add( String usuario, String acao){
        LocalDateTime current = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = current.format(formatter);
        
    Lista += usuario + " | " + acao + " | " + formatted + "\n";
    }
    
    public static String read(){
    return Lista;
    }
}
