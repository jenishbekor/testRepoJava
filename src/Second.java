public class Second {

    public static int sum(int a, int b){
        int result=a+b;
        return result;
    }
    // Methods -  function
    public static boolean isEven(int n){
        if(n%2==0)
            return true;
        return false;
    }

    public static void main(String[] args) {

        int n= sum(3,4);
        System.out.println(n);

        System.out.println("Hello");

        if(isEven(n)){
            System.out.println("It is even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
