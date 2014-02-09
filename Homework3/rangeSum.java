public class rangeSum {

  public static void main(String[] args) {

     int num1= Integer.parseInt(args[0].toString());
     int num2= Integer.parseInt(args[1].toString());
        if (num1<num2){
    for(int i = num1; i<=num2;i++){
        int x=i;
        System.out.print(""+x+" ");
        
    }
    }
    else if (num2<num1){
        for(int i = num2; i<=num1;i++){
        int x=i;
        System.out.print(""+x+" ");
    }
    }
}
}
