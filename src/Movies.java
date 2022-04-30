import java.util.Scanner;

public class Movies extends Notes {
    String movieName;
    String movieDate;
    String movieGenre;
    String movieRating;

    public Movies(String movieName, String movieDate, String movieGenre, String movieRating) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieGenre = movieGenre;
        this.movieRating= movieRating;
    }

    @Override
    public Notes addNote(String username, Notes note) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите название заметки: ");
        note.noteName = scr.next();
        note.noteAuthor = username;
        System.out.println("Введите название фильма: ");
        String movieName = scr.next();
        System.out.println("Введите дату выхода: ");
        String movieDate = scr.next();
        System.out.println("Введите жанр: ");
        String movieGenre = scr.next();
        System.out.println("Введите рейтинг: ");
        String movieRating = scr.next();
        System.out.println("Введите текст заметки: ");
        note.noteBody = scr.next();
        note = new Movies(movieName, movieDate, movieGenre, movieRating);
        return note;
    }

    @Override
    public void print(Notes obj) {
        Movies note = (Movies) obj;
        System.out.printf("Название заметки: %s, Автор заметки: %s.\n" +
                "Название фильма: %s. Дата выхода: %s. Жанр: %s. Рейтинг: %s.\n" +
                "Заметка: %s", note.noteName, note.noteAuthor, note.movieName, note.movieDate, note.movieGenre, note.movieRating, note.noteBody);
    }

}
