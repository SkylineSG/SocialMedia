package com.socialmedia.statistics;


public class UserStatistics {

    private int usersInForum;
    private int postCount;
    private int commentCount;
    private double postsAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;




    public void calculateAdvStatistics(Statistics statistics){
        usersInForum = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        postsAvgPerUser = claculatePostsAvgPerUser();
        commentsAvgPerUser = claculateCommentsAvgPerUser();
        commentsAvgPerPost = claculateCommentsAvgPerPost();
    }


    private double claculatePostsAvgPerUser(){
        if(usersInForum>0){
            return (double)postCount/usersInForum;
        }else{
            return 0;
        }
    }

    private double claculateCommentsAvgPerUser(){
        if(usersInForum>0){
            return (double)commentCount/usersInForum;
        }else{
            return 0;
        }
    }

    private double claculateCommentsAvgPerPost(){
        if(postCount>0){
            return (double)commentCount/postCount;
        }else{
            return 0;
        }
    }

    public int getUsersInForum() {
        return usersInForum;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getPostsAvgPerUser() {
        return postsAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }
    public void showStatistics(){
        System.out.println("Forum statistics:");
        System.out.println("Users : " + usersInForum);
        System.out.println("Posts : " + postCount);
        System.out.println("Comments : " + commentCount);
        System.out.println("Posts average per user" + postsAvgPerUser);
        System.out.println("Comments average per user" + commentsAvgPerUser);
        System.out.println("Comments average per post" + commentsAvgPerPost);
    }
}
