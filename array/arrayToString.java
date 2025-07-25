public class arrayToString {


    public static void main(String[] args) {
        String[] arr = new String[]{"hello","My","name","is","Nitin"};
        StringBuilder sd = new StringBuilder();
        for(String str : arr){
            sd.append(str).append(" ");
        }
        System.out.println(sd);
    }
}
