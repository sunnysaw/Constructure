import java.util.Scanner;

/*
In this section we will see about constructor by using of different class how they function and execution:
__________________________________________________________________________________________________________
Question : for given number find the sum , sub , and multi of that number and print that number:
_________________________________________________________________________________________________
Approach : first we make a another class in existing class then we make a constructor for sum , sub , and for multi
           then take input from user and calculate it by using constructor and then finally we print the result.
 */
class  math{
    int a ;
    int b;
     math(int x, int y){
        a = x;
        b =y;
     }
     int sum(int x , int y){
      int ans = x + y ;
      return ans;
     }
     int multiple(int x , int y ){
         int ans = x * y ;
         return ans;
     }
     int sub(int x , int y ){
         int ans = x / y ;
         return ans;
     }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int c = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second number :");
        int d = sc.nextInt();
        System.out.println();
        math ab = new math(c,d);
        System.out.println("sub of two number are :" + ab.sub(c,d));
        System.out.println("sum of two number are :" + ab.sum(c,d));
        System.out.println("sum of two number are :" + ab.multiple(c,d));
    }
}