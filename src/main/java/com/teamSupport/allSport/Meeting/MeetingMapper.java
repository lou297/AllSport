package com.teamSupport.allSport.Meeting;

import org.apache.ibatis.annotations.Param;

import java.util.List;

interface MeetingMapper {
    List<Meeting> getAllMeeting();
    List<Meeting> findMeetingByGameId(int game_id);
    List<Meeting> findMeetingByMeetId(int meet_id);
    void makeMeeting(@Param(value = "meet_id") int meet_id, @Param(value = "game_id") int game_id,
                     @Param(value = "meet_name") String meet_name, @Param(value = "now_count") int now_count,
                     @Param(value = "max_count") int max_count, @Param(value = "meet_contents") String location, String meet_contents);

}
