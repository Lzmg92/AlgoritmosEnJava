public class productToNumber {

 
    public static void main(String[] args) {
  	int x = Integer.parseInt(args[0].toString());    
        int res=0;
      
       for (int i=x; i>0; i--){
          int ac=i;
        if(i==x){
              res=i;           
        } else { 
          res= res*ac;
          } if (i>1){
           System.out.print(""+i+"x");   
       }else {
              System.out.println(1+"="+res);
          }     
       }      
          
    }
}
     