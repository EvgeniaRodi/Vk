package ru.netology.domain;

public class Post {
    private int id;
    private boolean authorsName;
    private int likes;
    private int repost;
    private int views;
    private int date;
    private int privatePost;
    private boolean videoPost;
    private boolean musicPost;
    private boolean picturePost;
    private boolean textPost;
    private boolean mixedPost;

    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

    // + get/set на все поля

}
