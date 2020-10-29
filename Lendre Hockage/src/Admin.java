import java.util.Scanner;

public class Admin {
    public static void Menu1(){
        System.out.println("Вы вошли как администратор!");
        System.out.println("Что бы вы хотели сделать: \n1.   2.    3.   ");
        Scanner scan = new Scanner(System.in);
        String Act = scan.next();
        switch (Act)
        {
            case "1":
            case "2":
            case "3":
        }
    }
}
