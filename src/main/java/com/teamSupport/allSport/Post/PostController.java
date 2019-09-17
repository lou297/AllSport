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

    @RequestMapping(path = "/postId", method = RequestMethod.GET)
    public @ResponseBody List<Post> findPostById(@RequestParam(value = "post_id") int post_id) {
        List<Post> posts = postMapper.findPostById(post_id);

        return posts;
    }

    @RequestMapping(path = "/postKind", method = RequestMethod.GET)
    public @ResponseBody List<Post> findPostByKind(@RequestParam(value = "kind") String kind) {
        List<Post> posts = postMapper.findPostByKind(kind);

        return posts;
    }

    @RequestMapping(path = "/uploadPost", method = RequestMethod.POST)
    public @ResponseBody void uploadPost(@RequestParam(value = "post_id") int post_id, @RequestParam(value = "post_date") long post_date,
                                         @RequestParam(value = "writer_nickname") String writer_nickname, @RequestParam(value = "kind") String kind,
                                         @RequestParam(value = "title") String title, @RequestParam(value = "contents") String contents) {

        postMapper.uploadPost(post_id, post_date, writer_nickname, kind, title, contents);

    }


}
