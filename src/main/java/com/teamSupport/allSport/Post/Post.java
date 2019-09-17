package com.teamSupport.allSport.Post;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    private int post_id;
    private long post_date;
    private String writer_nickname;
    private String kind;
    private String title;
    private String content;
}
