

package aplicacionexcepcions;

public class AplicacionExcepcions {

    
    public static void main(String[] args) {
       Division obxDivi = new Division();
       obxDivi.dividirConCaptura(10,2);
       obxDivi.dividirConCaptura(8,0);
       try{
       obxDivi.dividirSenCapturar(6, 0);
       }catch(ArithmeticException e){
           System.out.println(" error en main "+ e.getMessage());
       }
        try{
       obxDivi.dividirConNosaExcepcion(12, 0);
       }catch(NosaExcepcion e){
           System.out.println(" error en main "+ e.getMessage());
       }
       
    }  
}
