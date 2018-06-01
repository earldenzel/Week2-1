package Week4.Ex1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
        displayTime("After time object is created", time);

        time.setTime(13,27,0);
        displayTime("After calling setTime", time);

        //Exception handling
        try {
            time.setTime(99, 99, 99);
        }
        catch (Exception e){
            System.out.printf("Exception: %s%n%n", e.getMessage());

        }
    }

    public static void displayTime(String beginningString, Time1 t){
        System.out.printf("%s%nUniversal Time %s%nStandard Time: %s%n",
                beginningString,
                t.toUniversalString(),
                t.toString());
    }

}
