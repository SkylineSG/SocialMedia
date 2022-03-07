package com.socialmedia;

import com.socialmedia.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialMediaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialMediaApplication.class, args);


        User pawel= new User("PAWEL","WOJJ",1999,12,14);


        System.out.println(pawel);
    }

}
