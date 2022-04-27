public class Books extends Notes {
    String bookName;
    String bookWriter;
    String bookPublisher;
    String bookBody;

    public Books(String bookName, String bookWriter, String bookPublisher, String bookBody) {
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookPublisher = bookPublisher;
        this.bookBody = bookBody;
    }

    @Override
    public void addNote(Notes note) {

    }
}
