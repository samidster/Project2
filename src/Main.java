import java.util.Scanner;

public class Main {
    static Users user = new Users("", "", Roles.USER); // инициализация пользователя
    // создание массива пользователей
    static String[][] users = {{"user", "user", String.valueOf(Roles.USER)},
                               {"admin", "admin", String.valueOf(Roles.ADMIN)},
                               {"moderator", "moderator", String.valueOf(Roles.MODERATOR)}};
    static boolean login_flag = false;

    public static void main(String[] args) {

        login_flag = login();
        System.out.println("----- Out current user and login_flag: " + user.username + "/" + user.password + "/" + user.role  + "/" + login_flag);

        System.out.println();
        menu(menu_print(0));
        System.out.println("----- Out current user and login_flag: " + user.username + "/" + user.password + "/" + user.role  + "/" + login_flag);

    }





//Процедура menu_print(int) - вывод меню, где int = 0 - основное меню, 1 - дополнительное
    public static int menu_print (int menu_type) {
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
            return (menu_item+4);
        }

    }

    // Процедура обработки меню menu()

    public static void menu(int menu) {
        switch (menu){
            case 1: login(); menu(menu_print(0));
            case 2: if (login_flag) ; break; // вызов процедуры создания заметки
            case 3: ; break; // вызов процедуры поиска по названию
            case 4: System.exit(0);
            case 5: ; break; // вызов процедуры вывода заметки в консоль
            case 6: ; break; // вызов процедуры изменения названия заметки
            case 7: ; break; // вызов процедуры замены слова в заметке
            case 8: ; break; // вызов процедуры замены тела заметки
            case 9: ; break; // вызов процедуры вывода автора заметки
            case 10: ; break; // вызов процедуры удаления заметки

        }

    }
    // Процедура авторизации текущего пользователя
    public static boolean login() {
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
            if (users[i][0].equals(user.username) && users[i][1].equals(user.password)) {
                user.role = Roles.valueOf(users[i][2]);
                login_flag = true;
                break;
            } else
                login_flag = false;
            }
        if (!login_flag) System.out.println("Login or password incorrect. Please try again.");
        return login_flag;
        }
    }
