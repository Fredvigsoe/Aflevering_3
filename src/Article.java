public class Article {
    String author;
    String title;
    public Article(String author, String title){
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        System.out.println("Author: " + this.author + " Title: " + this.title);
        return super.toString();
    }
}
