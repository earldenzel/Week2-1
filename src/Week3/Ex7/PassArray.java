package Week3.Ex7;

public class PassArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};

        System.out.printf("Effects of passing reference to entire array: %n"
                + "The values of the original array are: %n%n");

        //traditional
        //for (int i = 0; i < myArray.length ; i++) {
        //    System.out.printf(" %d", myArray[i]);
        //}

        //enhanced for loop
        for(int val : myArray){
            System.out.printf(" %d", val);
        }

        modifyArray(myArray);
        System.out.printf("%nModified:%n");
        for(int val : myArray){
            System.out.printf(" %d", val);
        }

        modifyElement(myArray[4]);
        for(int val : myArray){
            System.out.printf(" %d", val);
        }
    }

    //public static void modifyArray(int[] array2){
    //    for(int val : array2){
    //        val *= 2;
    //    }
    //    //int val here is local and is "stuck" and will therefore not work
    //    //enhanced for loop is usually used for "reading"
    //}

    public static void modifyArray(int[] array2){
        for (int i = 0; i < array2.length; i++) {
            array2[i] *= 2;
        }
    }


    public static void modifyElement(int element){
        element *= 2;
        System.out.printf("%nValue of element in modifyElement %d%n", element);
    }

}
