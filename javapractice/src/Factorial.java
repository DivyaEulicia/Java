// 5!=5*4*3*2*1

public class Factorial{
  public static void main(String[] args){
       int num=5, i, fact=1;
         for(i=1;i<=num;i++){
             fact=fact*i;
         }
        System.out.println(fact);

}
}