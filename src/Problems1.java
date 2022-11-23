public class Problems1 {

    public static void main(String[] args) {
        /*
        * 0,1,1,2,3,5,8,13,21,...nth number
position  0,1,2,3,4,5,6,7,8,....nth position
        *
        *
        * int a=0
        * int b=1;
        * int count=2;
        * while(count<=n){
        * int temp=b;
        * b=b+a;
        * a=temp;
        * count++;
        *
        *
        * */
        int n = 10;
        int count = 2;
        int a = 0;
        int b = 1;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
        printFindTheNumberOccuring();
        revereNumber();
    }

    public static void printFindTheNumberOccuring() {
        /* find the number occuring count
         * n=1278798
         * out like count =2 number 7
         * */
        int n = 1278798;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }

    public static void revereNumber() {
        /* reverse Number
         * int n=15908
         * int out=80951
         */
        int n = 15908;
        int out = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            out = out * 10 + rem;
        }
        System.out.println(out);
    }
}
