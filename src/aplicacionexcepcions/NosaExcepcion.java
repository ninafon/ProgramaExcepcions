
package aplicacionexcepcions;

public class NosaExcepcion extends Exception{
    
    public NosaExcepcion(){
        super(" non dividas entre 0 ");        
    }
    
    public NosaExcepcion (String mensaxe) {
        super(mensaxe);
       
}
    
}
