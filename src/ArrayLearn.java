import java.util.Arrays;

public class ArrayLearn {
    void arraySample(){
        //primitive datatype array
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(Arrays.toString(arr));
        arr[2]=90;
        System.out.println(Arrays.toString(arr));

        //object  type array

        String[] arrs=new String[5];
        arrs[0]="wkghiu";
        arrs[1]="woigfiu";
        arrs[2]="kjebgiue";
        arrs[3]="jergbiu";
        arrs[4]="jergiuh";
        System.out.println(Arrays.toString(arrs));
        arrs[2]="{g3hiuo}";
        System.out.println(Arrays.toString(arrs));
    }
}
