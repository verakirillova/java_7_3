package ru.netology.domain;

public class Post {
    private long id;
    private String text;
    private User author;
    private long likeCounter;
    private long repostCounter;
    private long viewCounter;
    private String createTime;
    private Comment[] comments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public long getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(long likeCounter) {
        this.likeCounter = likeCounter;
    }

    public long getRepostCounter() {
        return repostCounter;
    }

    public void setRepostCounter(long repostCounter) {
        this.repostCounter = repostCounter;
    }

    public long getViewCounter() {
        return viewCounter;
    }

    public void setViewCounter(long viewCounter) {
        this.viewCounter = viewCounter;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}
