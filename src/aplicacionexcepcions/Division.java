
package aplicacionexcepcions;

public class Division {
    
    public void dividirConCaptura (int numerador,int denominador){
      try{  
        System.out.println(numerador +"/"+ denominador +" ="+ numerador/denominador);
        System.out.println(" despois da operacion ");
      }catch(ArithmeticException ex){
          System.out.println(" erro na division "+ ex.toString()); 
          
      }
        finally{
          System.out.println(" ***** a sentenza finally executase sempre");
      }
    } 
    
      public void dividirSenCapturar(int nume, int deno)throws ArithmeticException {
          System.out.println(" operacion: "+ nume/deno);          
      }
      
      public void dividirConNosaExcepcion(int nume,int deno)throws NosaExcepcion{
          if(deno == 0)
              throw new NosaExcepcion(" ollo, non dividas entre 0 ");
          else
              System.out.println(" solucion :"+ nume/deno);
                  
          
          
          
      
      }
      
      
    }
    

