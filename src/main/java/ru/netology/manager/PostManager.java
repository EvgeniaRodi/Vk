package ru.netology.manager;

import ru.netology.domain.Geo;
import ru.netology.domain.Post;


public class PostManager {

    private Post[] posts;


    public Post[] search (int ownerId, String domain, boolean ownersOnly, int offset, int friendsOnly) {

        //  create some logic

        return null;
    }

    public Geo [] geos;

    public Geo [] search (String type, String coordinates){

        // create some logic

        return null;

    }

    public void delete ( int ownerId, int postId) {

        // create some logic

        return null;


    }
}