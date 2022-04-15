package com.socialmedia.post;

import com.socialmedia.User.User;
import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "posts")
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @NonNull
    private User user;

    @NonNull
    private String body;

}
