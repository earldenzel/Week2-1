package Week4.Ex3;

//Define time in a 24-hour format, but accommodate 12 hours
public class SimpleTime {
    private int hour;
    private int minute;
    private int second;

    public SimpleTime(){
        this(0,0,0);
    }


    public SimpleTime(int hour){
        this(hour, 0,0);
    }

    public SimpleTime(int hour, int minute){
        this(hour, minute, 0);
    }

    public SimpleTime(int hour, int minute, int second){
        if (hour < 0 || hour >=24){
            throw new IllegalArgumentException("Hour must be 0-23");
        }
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("Minute must be 0-59");
        }
        if (second < 0 || second >= 60){
            throw new IllegalArgumentException("Second must be 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //copy constructor
    public SimpleTime(SimpleTime time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // getters
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >=24){
            throw new IllegalArgumentException("Hour must be 0-23");
        }

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("Minute must be 0-59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60){
            throw new IllegalArgumentException("Second must be 0-59");
        }
        this.second = second;
    }

    //ability to set time
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >24 ||
                minute < 0 || minute > 60 ||
                second < 0 || second > 60)
        {
            throw new IllegalArgumentException("Hour, minute, and/or second was out of range");
        }

        //assuming the value are correct
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString(){
        return String.format("%24s: %s%n%24s: %s",
                "this.toUniversalString()",this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }


    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute,
                second,
                ((hour > 12) ? "AM" : "PM"));
    }
}
