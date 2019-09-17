package com.teamSupport.allSport.Meeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MeetingController {
    @Autowired
    MeetingMapper meetingMapper;

    @RequestMapping(path = "/meeting", method = RequestMethod.GET)
    public @ResponseBody List<Meeting> getAllMeeting() {
        List<Meeting> meetingList = meetingMapper.getAllMeeting();

        return meetingList;
    }

    @RequestMapping(path = "/meeting/gameId", method = RequestMethod.GET)
    public @ResponseBody List<Meeting> findMeetingByGameId(int game_id) {
        List<Meeting> meetingList = meetingMapper.findMeetingByGameId(game_id);

        return meetingList;
    }

    @RequestMapping(path = "/meeting/meetId", method = RequestMethod.GET)
    public @ResponseBody List<Meeting> findMeetingByMeetId(int meet_id) {
        List<Meeting> meetingList = meetingMapper.findMeetingByMeetId(meet_id);

        return  meetingList;
    }

    @RequestMapping(path = "/makeMeeting", method = RequestMethod.POST)
    public @ResponseBody void makeMeeting(int meet_id, int game_id, String meet_name,
                                           int now_count, int max_count, String location,
                                           String meet_contents) {
        meetingMapper.makeMeeting(meet_id, game_id, meet_name, now_count, max_count, location, meet_contents);

    }

}
