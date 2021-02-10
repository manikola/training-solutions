package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostFinderTest {

    @Test
    public void findPostsForTest() {


    Post post1 = new Post("Budapest",LocalDate.of(2021, 1, 11),"conntent1","Jane");
    Post post2 = new Post("Győr",LocalDate.of(2021, 2, 8),"conntent2","Joe");
    Post post3 = new Post("Pécs",LocalDate.of(2021, 2, 9),"conntent3","Dave");
    Post post4 = new Post("Debrecen",LocalDate.of(2021, 1, 30),"conntent4","Jack");
    Post post5 = new Post("Veszprém",LocalDate.of(2021, 1, 22),"conntent4","Jack");

    List<Post> posts = List.of(post1,post2,post3,post4,post5);
    PostFinder pf = new PostFinder(posts);


    assertEquals(2, pf.findPostsFor("Jack").size());

    }
}
