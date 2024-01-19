public class Main {
    public static void main(String[] args) {
        BookModel model = retrieveBookFromDatabase();
        //create a view to write Book details on console
        BookView view = new BookView();
        BookController controller = new BookController(model,view);
        controller.updateView();

        //updating the model data
        controller.setBookName("Java MVC");
        controller.setBookAuthor("Java Class");
        controller.setBoolISBN("12345");
        controller.setBookGenre("Tech");
        System.out.println("\n Bookoyee Details after updating: ");

        controller.updateView();
    }

    private static BookModel retrieveBookFromDatabase(){
        BookModel model = new BookModel();
        model.setTitle("HarryPotter");
        model.setAuthor("J.K.Rowling");
        model.setGenre("Fantasy");
        model.setIsbn("000123");
        return model;
    }

}