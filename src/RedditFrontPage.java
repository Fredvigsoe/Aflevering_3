import java.util.ArrayList;

public class RedditFrontPage{
    private static ArrayList<RedditPost> list;
    private static RedditPost post;

    public RedditFrontPage(ArrayList<RedditPost> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "RedditFrontPage{" +
                "list=" + list +
                '}';
    }

    public static void deletePost(int index){
        list.remove(index);
        System.out.println("REMOVED: " + list.remove(index));
    }
}
