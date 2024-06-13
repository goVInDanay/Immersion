public class greater {
    public static void main(String[] args) {
        int []arr={-2,6,1,-6,9,6};
        int max=arr[0];
        for(int i:arr){
            if(max<i)
                max=i;
        }
        int max2=0;
        for (int j : arr) {
            if (j != max && j > max2)
                max2 = j;
        }
        System.out.println(max2);
    }
}
