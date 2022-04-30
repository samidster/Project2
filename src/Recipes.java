import java.util.Scanner;

public class Recipes extends Notes  {
    String recipeName;
    String recipeCalories;

    public Recipes(String recipeName, String recipeCalories) {
        this.recipeName = recipeName;
        this.recipeCalories = recipeCalories;
    }

    @Override
    public Notes addNote(String username, Notes note) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите название заметки: ");
        note.noteName = scr.next();
        note.noteAuthor = username;
        System.out.println("Введите название рецепта: ");
        String recipeName = scr.next();
        System.out.println("Введите калорийность: ");
        String recipeCalories = scr.next();
        System.out.println("Введите текст заметки: ");
        note.noteBody = scr.next();
        note = new Recipes(recipeName, recipeCalories);
        return note;
        }

    @Override
    public void print(Notes obj) {
        Recipes note = (Recipes) obj;
        System.out.printf("Название заметки: %s, Автор заметки: %s.\n" +
                "Название рецепта: %s. Калорийность: %s.\n" +
                "Заметка: %s", note.noteName, note.noteAuthor, note.recipeName, note.recipeCalories, note.noteBody);
    }
}
