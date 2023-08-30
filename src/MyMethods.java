public class MyMethods {


    public static int dividers(int num) {
        if (num == 1 || num == 2) {
            return 0;
        } else {
            return 6;
            //if (num % 2 == 0) {}
            //for (int i = 3; i <= Math.sqrt(num); i = i + 2) {if (num % i == 0) {return 5;}
        } // End of dividers */
    }


    public static int powerOfDiv (int num, int div){
        // we already know that num is divided by div.
        // This method returns the power of div in num.
        int pow = 0;
        do {
            pow++;
            num= num/div;
        }while (num%div==0);
        return pow;
    } // end of powerOfDiv

// End of MyMethods
}

