package com.teamSupport.allSport.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    String user_key;
    String user_nickname;
}
