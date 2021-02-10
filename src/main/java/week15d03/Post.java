package week15d03;

import java.time.LocalDate;

public class Post {

    private String title;
    private LocalDate publishedAt;
    private String content;
    private String owner;

    public Post(String title, LocalDate publishedAt, String content, String owner) {
        if(isEmpty(title)){
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        if(publishedAt.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Invalid date");
        }
        this.publishedAt = publishedAt;
        if(isEmpty(content)){
            throw new IllegalArgumentException("Content cannot be empty");
        }
        this.content = content;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return  title + " " + publishedAt + " " + content + " " + owner;
    }

    private boolean isEmpty(String str) {
        return (str == null || str.trim().equals(""));
    }
}
