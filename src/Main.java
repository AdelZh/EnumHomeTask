import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Days days=Days.MONDAY;
        Days days1=Days.TUESDAY;


        Scanner scanner=new Scanner(System.in);

        while(true){
            int num=scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println(days.name());
                    System.out.println(days.getMethod());
                        break;
                     case 2:
                         System.out.println(days1.name());
                         System.out.println(days1.getMethod2());
                        break;
                        case 3:
                    System.exit(0);
            }
        }}}


