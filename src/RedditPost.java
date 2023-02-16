import java.util.Date;

public class RedditPost {
    private Date dateOfPost;
    private String author;
    private int upvotes;
    private int downvotes;
    private String title;

    public RedditPost(String author, String title) {
        this.author = author;
        this.title = title;
        this.dateOfPost = new Date();
        this.upvotes = 1;
        this.downvotes = 1;
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                "dateOfPost=" + dateOfPost +
                ", author='" + author + '\'' +
                ", upvotes=" + upvotes +
                ", downvotes=" + downvotes +
                ", title='" + title + '\'' +
                '}';
    }

    public Date getDateOfPost() {
        return dateOfPost;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateOfPost(Date dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }
}
