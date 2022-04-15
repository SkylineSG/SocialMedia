package com.socialmedia.User;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String username;

    @NonNull
    private String password;

//    private int yearOfBirth;
//    private int monthOfBirth;
//    private int dayOfBirth;
    // private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    // private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

//
//    public User(String username, String surName, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
//        this.id = id;
//        this.username = username;
//    //    this.surName = surName;
//     //   this.yearOfBirth = yearOfBirth;
//     //   this.monthOfBirth = monthOfBirth;
//      //  this.dayOfBirth = dayOfBirth;
//    }
//
//    public void addPost(String author, String postBody) {
//        ForumPost thePost = new ForumPost(postBody, author);
//        posts.add(thePost);
//    }
//
//    public void addComment(ForumPost thePost, String author, String commentBody) {
//        ForumComment theComment = new ForumComment(thePost, commentBody, author);
//        comments.add(theComment);
//    }
//
//    public int getPostsQuantity() {
//        return posts.size();
//    }
//
//    public int getCommentsQuantity() {
//        return comments.size();
//    }
//
//    public ForumPost getPost(int postNumber) {
//        ForumPost thePost = null;
//        if (postNumber >= 0 && postNumber < posts.size()) {
//            thePost = posts.get(postNumber);
//        }
//        return thePost;
//    }
//
//    public ForumComment getComment(int commentNumber) {
//        ForumComment theComment = null;
//        if (commentNumber >= 0 && commentNumber < comments.size()){
//            theComment = comments.get(commentNumber);
//        }
//        return theComment;
//    }
//
//    public boolean removePost(ForumPost thePost) {
//        boolean result = false;
//        if (posts.contains(thePost)){
//            posts.remove(thePost);
//            result = true;
//        }
//        return result;
//    }
//
//    public boolean removeComment(ForumComment theComment) {
//        boolean result = false;
//        if (comments.contains(theComment)){
//            comments.remove(theComment);
//            result = true;
//        }
//        return result;
//    }

}

