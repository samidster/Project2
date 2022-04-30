import java.util.Scanner;

public class Books extends Notes{
    String bookName;
    String bookWriter;
    String bookPublisher;

    public Books(String bookName, String bookWriter, String bookPublisher) {
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookPublisher = bookPublisher;
    }

    @Override
    public Notes addNote(String username, Notes note) {
        Books note1 = (Books) note;
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите название заметки: ");
        note.noteName = scr.nextLine();
        note.noteAuthor = username;
        System.out.println("Введите название книги: ");
        note1.bookName = scr.nextLine();
        System.out.println("Введите писателя: ");
        note1.bookWriter = scr.nextLine();
        System.out.println("Введите издательство: ");
        note1.bookPublisher = scr.nextLine();
        System.out.println("Введите текст заметки: ");
        note.noteBody = scr.nextLine();
        return note1;
    }

    @Override
    public void print(Notes obj) {
        Books note = (Books) obj;
        System.out.printf("Название заметки: %s, Автор заметки: %s.\n" +
                "Название книги: %s. Писатель: %s. Издательство: %s.\n" +
                "Заметка: %s", note.noteName, note.noteAuthor, note.bookName, note.bookWriter, note.bookPublisher, note.noteBody);
    }
}

