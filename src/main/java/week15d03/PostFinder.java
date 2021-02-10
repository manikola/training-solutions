package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getPosts() {
        return new ArrayList<>(posts);
    }

    public List<Post> findPostsFor(String user){
        List<Post> resultsOfUser= new ArrayList<>();
        for(Post item : posts){
            if(item.getOwner().equals(user)){
                resultsOfUser.add(item);
            }
        } return resultsOfUser;
    }

}
