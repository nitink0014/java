package nitin;

public class testArguments {

    public static String concatenate(String... str){
        StringBuilder sb = new StringBuilder();
        for(String i : str ){
            sb.append(i).append(" ");
        }
        return sb.toString();

    }

    public static void main(String[] args) {
    String str =concatenate("Hello","My","Name","is","Nitin");
        System.out.println(str);
    }
}
