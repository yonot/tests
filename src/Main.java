

public class Main {
    public static void main(String[] args) {

        short base = 2;
        for (int num = 3; num < 29; num++) {
            int p = MyMethods.powerOfDiv (num,base);
            System.out.printf("%d is divisible by %d to the power of %d.%n",num,base,p);

        }



    }
}