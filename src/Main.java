import java.util.Scanner;

public class Main {
    Users user = null; // инициализация пользователя
    // создание массива пользователей
    String[][] users = {{"user", "user", String.valueOf(Roles.USER)},
                        {"admin", "admin", String.valueOf(Roles.ADMIN)},
                        {"moderator", "moderator", String.valueOf(Roles.MODERATOR)}};

    public static void main(String[] args) {

        login();
        System.out.println(user.username + "/" user.password + "/" + user.role);
        System.out.println(menu(0));
    }





//Процедура menu(int) - вывод меню, где int = 0 - основное меню, 1 - дополнительное
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

    // Процедура авторизации текущего пользователя
    public static void login() {
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0:
                    System.out.println("Enter your username: ");
                    user.username = scr.nextLine();
                    break;
                case 1:
                    System.out.println("Enter your password: ");
                    user.password = scr.nextLine();
                    break;
            }
        }
        // проверка введённых данных с пользователями в массиве
        for (int i = 0; i < users.length; i++) {
            if (users[i][0] == user.username && users[i][1] == user.password) {
                user.role.valueOf(users[i][2]);
            }
        }
    }
}
