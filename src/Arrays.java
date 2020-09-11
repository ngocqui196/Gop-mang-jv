import java.util.stream.IntStream;

public class Arrays {
    public static void main(String[] args) {
        int[] Arr1 = {4,2,5,1};
        int[] Arr2 = {8,3,7,6,9};
        int[] Arr3 = new int[Arr1.length + Arr2.length];

        for (int i = 0; i < Arr1.length; i++) {
            Arr3[i] = Arr1[i];
        }
        for (int i = 0; i < Arr2.length; i++) {
            Arr3[i + Arr1.length] = Arr2[i];
        }
        for (int i = 0; i < Arr3.length; i++) {
            System.out.println(Arr3[i]);
        }
    }

 }
