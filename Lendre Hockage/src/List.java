import java.util.Scanner;

public class List {
    public static void items(){
        System.out.println("1)Колбаса \n2)Сыр \n3)Книга 'Кого-нибудь' \n4)Телефон \n5)Консерва из Андрея в соб.с. \n6)Мидии \n");
        Scanner scan = new Scanner(System.in);
        String S;
        boolean flag = false;
        while (flag == false) {
            System.out.println("Вы хотите добавить что-нибудь в Вашу корзину?\n1.Да    2.Нет");
            S = scan.next();
            switch(S){
                case "1": System.out.println("Что именно?");break;
                case "2": if (S == "2")flag = true; break;
            }
        }
    }
}
