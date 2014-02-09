public class whileValue {

 
    public static void main(String[] args) {
  	int valorActual = 0;
        int lim = Integer.parseInt(args[0].toString());
   		while ( valorActual <= lim ){
                    
               System.out.println("El valor actual es: "+valorActual);     
                valorActual = valorActual+1;    
                } 			
       }
}