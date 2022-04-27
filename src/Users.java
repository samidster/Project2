import java.util.Scanner;

public class Users implements Addable, Deletable, Editable, Printable{
    String username;
    String password;
    Roles role;

    public Users(String username, String password, Roles role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public Notes addNote() {
        Notes note = null;
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите название заметки: ");
        note.noteName = scr.next();
        System.out.println("Выберите тип заметки: \n 1. Книга\n2. Фильм\n 3. Рецепт");
        note.noteType = scr.next();
        System.out.println("Введите название заметки: ");
        note.noteType = scr.next();
    }
}

