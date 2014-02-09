public class FlipFlop {

 
    public static void main(String[] args) {
  	
    int x = Integer.parseInt(args[0].toString());
      
        for (int contador = 0;contador <=x;contador++) {
        if(contador%3==0 && contador%5==0)
        {
            System.out.print("FlipFlop ");
        }
        else if(contador%3==0)
        {
            System.out.print("Flip ");
        }
        else if(contador%5==0)
        {
            System.out.print("Flop ");
        }
        else
        {
            System.out.print(contador+" ");
        }
   
        }
    }
    }