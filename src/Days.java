import java.util.Scanner;

public enum Days {

    MONDAY(1),
    TUESDAY(2);

    private int num;

    Days(int num) {
        this.num = num;
    }
    public String getMethod(){
        return "I am learning java";
    }

    public String getMethod2(){
        return "I am learning english";
    }


    }

