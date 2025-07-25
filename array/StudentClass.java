public class StudentClass {
String stu_name ;
int age ;
String house;

StudentClass(String stu_name,int age,String house){
    this.stu_name=stu_name;
    this.age=age;
    this.house =house;
}

    @Override
    public String toString() {
        return "StudentClass{" +
                "stu_name='" + stu_name + '\'' +
                ", age=" + age +
                ", house='" + house + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudentClass st=new StudentClass("Nitin",21,"Green");
        System.out.println(st);
    }
}
