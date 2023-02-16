import java.util.*;

public class Main {
    public static void main(String[] args) {
        // OPGAVE 1, RANDOM NUMBERS
        Random rn = new Random();
        tenRandomNumbers();

        // OPGAVE 2 CPR-CHECKER
        cprChecker();

        // OPGAVE 3 ARTICLE
        Article article1 = new Article("Frederik V. A", "Crypto101");
        Article article2 = new Article("Frederik V. A", "Advanced Crypto guide");
        Article article3 = new Article("Frederik V. A", "Expert Crypto guide");
        Article article4 = new Article("Frederik V. A", "Money Making Guide");
        Article article5 = new Article("Frederik V. A", "My little pony");
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(article1);
        articles.add(article2);
        articles.add(article3);
        articles.add(article4);
        articles.add(article5);

        //OPGAVE 4 SQUARE
        ArrayList<Square> squarelist = new ArrayList<>();
        Square square = new Square(10, 10);
        Square square2 = new Square(15, 15);
        Square square3 = new Square(5, 5);
        squarelist.add(square);
        squarelist.add(square2);
        squarelist.add(square3);
        Collections.sort(squarelist);
        System.out.println(squarelist);

        // OPGAVE 5 REDDITPOST
        RedditPost post1 = new RedditPost("Per", "TestTitle");
        RedditPost post2 = new RedditPost("Thor", "Clickbait");
        RedditPost post3 = new RedditPost("Hans", "NOTCLICKBAIT");
        System.out.println(post1);
        ArrayList<RedditPost> RedditPostList = new ArrayList<>();
        RedditPostList.add(post1);
        RedditPostList.add(post2);
        RedditPostList.add(post3);

        //OPGAVE 6 REDDITFRONTPAGE
        RedditFrontPage FrontPage = new RedditFrontPage(RedditPostList);
        System.out.println(FrontPage);
        RedditFrontPage.deletePost(0);
    }

    // Opgave 1 metode
    public static void tenRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(10) + 1;
            System.out.println(randomNum);
        }
    }

    // Opgave 2 metode
    public static void cprChecker() {
        //NOTE TO SELF: KIG PÅ SUBSTRING
        System.out.println("TYPE IN A CPR NUMBER TO CHECK IF IT IS VALID");
        Scanner sc = new Scanner(System.in);
        String cpr = sc.nextLine();
        if (cpr.length() == 10) {
            int rule1 = Integer.parseInt(cpr.substring(0, 1));
            int rule2 = Integer.parseInt(cpr.substring(2, 3));
            if (rule1 <= 31 && rule2 <= 12) {
                System.out.println("CPR is valid");
            }
            else {
                System.out.println("CPR IS NOT VALID");
            }
        }
        else {
            System.out.println("CPR IS NOT VALID");
        }
    }
}
