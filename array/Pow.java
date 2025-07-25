public class Pow {
    static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        return pow(p,q-1)*p;
    }

    public static void main(String[] args) {
     int ans =   pow(5,3);
        System.out.println(ans);
    }

}
