public class TwoStrings {

    String name ;
    String last_name;

    TwoStrings(String name, String last_name){
        this.name=name;
        this.last_name = last_name;
    }

    public static void main(String[] args) {
        TwoStrings st = new TwoStrings("Nitin" , "Kumar");
        String Fullname = st.name+" "+st.last_name;
        System.out.println(Fullname.toUpperCase());
    }
}
