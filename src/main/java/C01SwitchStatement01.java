
      import java.util.Scanner;
    public class C01SwitchStatement01 {
        public static void main(String[] args) {
            // Example: 1 Type code that gives you name of the day after you give number of the day
            //   2 ----> "Monday"      1 ---> "Sunday"
            Scanner input = new Scanner(System.in);

            // First Way
            System.out.println(" Please enter day number ...");
            byte dayNum = input.nextByte();
            if (dayNum==1){
                System.out.println("Sunday");
            } else if (dayNum==2){
                System.out.println("Monday");
            } else if (dayNum==3){
                System.out.println("Tuesday");
            } else if (dayNum==4){
                System.out.println("Wednesday");
            } else if (dayNum==5){
                System.out.println("Thurday");
            } else if (dayNum==6){
                System.out.println("Friday");
            } else if (dayNum==7){
                System.out.println("Saturday");
            } else {
                System.out.println("Please Enter a Valid Day Number!...");
            }

            // Second Way
            byte dayNumber = input.nextByte();
            switch (dayNumber){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Please Enter a Valid Day Number");

            }
        }

    }


