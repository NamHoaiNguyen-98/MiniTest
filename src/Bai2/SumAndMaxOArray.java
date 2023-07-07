package Bai2;

public class SumAndMaxOArray {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,3,5,6,8,14,25};
        int sum =0;
        int max = arr[0];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i]>max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Tổng các phần tử trong mảng là: "+sum);
        System.out.println("Phần tử lớn nhất trong mảng có giá trị là : "+max+ " có chỉ số là: "+index);

    }
}
