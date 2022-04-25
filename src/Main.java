import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] users = {{"user", "user", String.valueOf(Roles.USER)}, {"admin", "admin", String.valueOf(Roles.ADMIN)}, {"moderator", "moderator", String.valueOf(Roles.MODERATOR)}};
        System.out.println(menu(1));
    }
    //Вывод меню
    public static int menu (int menu_type) {
        if (menu_type == 0){
            System.out.println("1 Выполнить вход под другим пользователем \n" +
                "2 Создать новую заметку \n" +
                "3 Поиск заметки по названию \n" +
                "4 Выход из приложения \n");

        System.out.println("Choose menu item: ");
        Scanner scr = new Scanner(System.in);
        int menu_item = scr.nextInt();
        return (menu_item);
        } else {
            System.out.println("1 Вывести заметку в консоль \n" +
                    "2 Изменить название заметки \n" +
                    "3 Заменить слово в заметке \n" +
                    "4 Заменить тело заметки \n" +
                    "5 Вывести автора заметки \n" +
                    "6 Удалить заметку");

            System.out.println("Choose menu item: ");
            Scanner scr = new Scanner(System.in);
            int menu_item = scr.nextInt();
            return (menu_item);
        }

    }
}
