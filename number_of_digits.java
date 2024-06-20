public class number_of_digits{
    
    public static int countDigits(int n){
        // Write your code here.
        //here we can say that if n==0 then we can return 0. this is our base case.
        if(n==0)return 0;
        int smallOutput = countDigits(n/10);
        int output = smallOutput + 1;
        return output;
    }

    public static void main(String[] args){
        System.out.println(countDigits(0));
    }
}