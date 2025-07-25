public class Gcd {
    static int cd(int x, int y){

        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;

        }
        return y;
    }

    public static void main(String[] args) {
       int ans = cd(12,15);
       System.out.println(ans);
    }

}
