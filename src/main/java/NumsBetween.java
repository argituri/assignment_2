public class NumsBetween {
    // Main method (implementation not required?)
    public static void main(String[] args) {
        String strArg = args[0].trim();
        String[] strArr = strArg.split(",");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        int result = howManyBetween(intArr);
        System.out.println("Result: " + result);
    }


    // Method to return how many numbers between
    public static int howManyBetween(int[] arr){
        if (arr.length < 2){
            return -1;
        }
        int difference = Integer.MAX_VALUE;

        // Calculate the difference between two numbers and set the result as
        // the new difference if it is smaller than the previous difference
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i != j){
                    if (Math.abs(arr[i] - arr[j]) < difference && Math.abs(arr[i] - arr[j]) > 1){
                        difference = Math.abs(arr[i] - arr[j]);
                    }
                }
            }
        }
        // Check that a difference was found and that it is larger than 1 (because no numbers fit in between of numbers with a difference of 1)
        if (difference != Integer.MAX_VALUE && difference > 1){
            return (difference - 1);
        }
        return 0;
    } // NumsBetween
}
