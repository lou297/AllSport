package com.teamSupport.allSport.Post;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
interface PostMapper {
    List<Post> getAllPost();
    List<Post> findPostById(int post_id);
    List<Post> findPostByKind(String kind);
    void uploadPost(@Param(value = "post_id") int postId, @Param(value = "post_date") long postDate,
                    @Param(value = "writer_nickname") String writerNickname, @Param(value = "kind") String kind,
                    @Param(value = "title") String title, @Param(value = "contents") String contents);
}
