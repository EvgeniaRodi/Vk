package ru.netology.domain;

public class Post {
    private int id;
    private String authorsName;
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

    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private Copyright copyright;
    private Donut donut;
    private Geo geo;
    private PostSource postSource;


    // + get/set на все поля

}
