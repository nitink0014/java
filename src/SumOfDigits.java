public class SumOfDigits {

    static int sum(int n){
        if(n>=0&&n<=9){
            return n;
        }
        return sum(n/10) +n%10;
    }
    public static void main(String[] args) {
       int ans= sum(1224);
        System.out.println(ans);
    }
}
