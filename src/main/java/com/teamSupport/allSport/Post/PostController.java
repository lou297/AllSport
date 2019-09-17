package com.teamSupport.allSport.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostMapper postMapper;

    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    public @ResponseBody List<Post> getAllPost() {
        List<Post> posts = postMapper.getAllPost();

        return posts;
    }

    @RequestMapping(path = "/post/PostId", method = RequestMethod.GET)
    public @ResponseBody List<Post> findPostByPostId(@RequestParam(value = "post_id") int post_id) {
        List<Post> posts = postMapper.findPostByPostId(post_id);

        return posts;
    }

    @RequestMapping(path = "/post/GameId", method = RequestMethod.GET)
    public @ResponseBody List<Post> findPostByGameId(@RequestParam(value = "game_id") int game_id) {
        List<Post> posts = postMapper.findPostByGameId(game_id);

        return posts;
    }

    @RequestMapping(path = "/post/Kind", method = RequestMethod.GET)
    public @ResponseBody List<Post> findPostByKind(@RequestParam(value = "kind") String kind) {
        List<Post> posts = postMapper.findPostByKind(kind);

        return posts;
    }

    @RequestMapping(path = "/uploadPost", method = RequestMethod.POST)
    public @ResponseBody void uploadPost(@RequestParam(value = "post_id") int post_id, @RequestParam(value = "game_id") int game_id,
                                         @RequestParam(value = "post_date") long post_date,
                                         @RequestParam(value = "writer_nickname") String writer_nickname, @RequestParam(value = "kind") String kind,
                                         @RequestParam(value = "title") String title, @RequestParam(value = "contents") String contents) {

        postMapper.uploadPost(post_id, game_id, post_date, writer_nickname, kind, title, contents);

    }


}
