public class BookController {
    private BookModel model;
    private BookView view;

    public BookController(BookModel model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void setBookName(String name){
        model.setTitle(name);
    }

    public void setBookAuthor(String author){
        model.setAuthor(author);
    }

    public void setBoolISBN(String isbn){
        model.setIsbn(isbn);
    }

    public  void setBookGenre(String genre){
        model.setGenre(genre);
    }

    public BookModel getModel() {
        return model;
    }

    public void setModel(BookModel model) {
        this.model = model;
    }

    public BookView getView() {
        return view;
    }

    public void setView(BookView view) {
        this.view = view;
    }

    public void updateView(){
        view.printBookDetails(model.getTitle(), model.getAuthor(), model.getIsbn(), model.getGenre());
    }

}
