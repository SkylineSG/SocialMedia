//package com.socialmedia.statistics;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class StatisticsTests {
//    private Statistics statisticsMock;
//    private UserStatistics forumStatistics;
//
//    @BeforeEach
//    public void forTestData(){
//        statisticsMock = mock(Statistics.class);
//        List<String> listForMock = new ArrayList<>();
//        for (int i=0; i<10; i++){
//            listForMock.add("ForumUser");
//        }
//        when(statisticsMock.usersNames()).thenReturn(listForMock);
//        when(statisticsMock.commentsCount()).thenReturn(40);
//        when(statisticsMock.postsCount()).thenReturn(80);
//        forumStatistics = new UserStatistics();
//    }
//
//    @Test
//    public void testForPostCountZero(){
//        //Given
//        when(statisticsMock.postsCount()).thenReturn(0);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        Assertions.assertEquals(0, forumStatistics.getPostCount());
//        Assertions.assertEquals(0, forumStatistics.getPostsAvgPerUser(),0.01);
//        Assertions.assertEquals(0, forumStatistics.getCommentsAvgPerPost(),0.01);
//    }
//
//    @Test
//    public void testForPostCountThousend(){
//        //Given
//        when(statisticsMock.postsCount()).thenReturn(1000);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        Assertions.assertEquals(1000, forumStatistics.getPostCount());
//        Assertions.assertEquals(100, forumStatistics.getPostsAvgPerUser(),0.01);
//        Assertions.assertEquals(0.04, forumStatistics.getCommentsAvgPerPost(),0.01);
//    }
//
//    @Test
//    public void testForCommentsCountZero(){
//        //Given
//        when(statisticsMock.commentsCount()).thenReturn(0);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        Assertions.assertEquals(0, forumStatistics.getCommentCount());
//        Assertions.assertEquals(0, forumStatistics.getCommentsAvgPerUser(),0.01);
//        Assertions.assertEquals(0, forumStatistics.getCommentsAvgPerPost(),0.01);
//    }
//
//    @Test
//    public void testForMorePostToComments(){
//        //Given
//        when(statisticsMock.commentsCount()).thenReturn(5);
//        when(statisticsMock.postsCount()).thenReturn(10);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        Assertions.assertEquals(5, forumStatistics.getCommentCount());
//        Assertions.assertEquals(10, forumStatistics.getPostCount());
//        Assertions.assertEquals(1, forumStatistics.getPostsAvgPerUser(), 0.01);
//        Assertions.assertEquals(0.5, forumStatistics.getCommentsAvgPerUser(),0.01);
//        Assertions.assertEquals(0.5, forumStatistics.getCommentsAvgPerPost(),0.01);
//    }
//
//    @Test
//    public void testForMoreCommentsToPost(){
//        //Given
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        Assertions.assertEquals(40, forumStatistics.getCommentCount());
//        Assertions.assertEquals(80, forumStatistics.getPostCount());
//        Assertions.assertEquals(8, forumStatistics.getPostsAvgPerUser(), 0.01);
//        Assertions.assertEquals(4, forumStatistics.getCommentsAvgPerUser(),0.01);
//        Assertions.assertEquals(0.5, forumStatistics.getCommentsAvgPerPost(),0.01);
//    }
//
//    @Test
//    public void testForUserzZero(){
//        //Given
//        List<String> listForMock = new ArrayList<>();
//        when(statisticsMock.usersNames()).thenReturn(listForMock);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        Assertions.assertEquals(0, forumStatistics.getUsersInForum());
//        Assertions.assertEquals(0, forumStatistics.getPostsAvgPerUser(), 0.01);
//        Assertions.assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);
//    }
//
//    @Test
//    public void testForUserHundret(){
//        //Given
//        List<String> listForMock = new ArrayList<>();
//        for (int i=0; i<100; i++){
//            listForMock.add("ForumUser");
//        }
//        when(statisticsMock.usersNames()).thenReturn(listForMock);
//        //When
//        forumStatistics.calculateAdvStatistics(statisticsMock);
//        //Then
//        Assertions.assertEquals(100, forumStatistics.getUsersInForum());
//        Assertions.assertEquals(0.8, forumStatistics.getPostsAvgPerUser(), 0.01);
//        Assertions.assertEquals(0.4, forumStatistics.getCommentsAvgPerUser(), 0.01);
//    }
//
//}
