public class printNumbers{

    public static void print(int n){
        //Write your code here
        // we are gonna use recursion for tackling this problem.
        // Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.

        if(n==0)return;
        print(n-1);
        System.out.print(n+" ");

    }   
    public static void main(String[] args) {
        print(5);
    }
}