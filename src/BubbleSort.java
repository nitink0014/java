public class BubbleSort {


    static void Bubble(int [] a){
        int n = a.length;

        for(int i =0; i<n-1; i++){
            boolean flag = false;
            for(int j=0;j<n-i-1; j++){

                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                    flag=true;
                }
            }
            if(!flag){
                return;
            }
        }


    }

    public static void main(String[] args) {

int[] a = {3,4,6,5,7,8};
Bubble(a);
    for(int i : a){
        System.out.print(i+" ");
    }
    }
}
