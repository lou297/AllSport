package com.teamSupport.allSport.Meeting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Meeting {
    @Id
    private int meet_id;
    private int game_id;
    private String meet_name;
    private int now_count;
    private int max_count;
    private String location;
    private String meet_contents;
}
