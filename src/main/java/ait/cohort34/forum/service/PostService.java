package ait.cohort34.forum.service;

import ait.cohort34.forum.dto.AddPostDto;
import ait.cohort34.forum.dto.PostDto;
import java.util.Set;

public interface PostService {
    Boolean addPost (AddPostDto addPostDto);
    PostDto findPostById (String id);
    PostDto addLikeToPost (String id);
    Iterable<PostDto> findPostsByAuthor (String author);
    PostDto addComment (String id, String comment, String user);
    PostDto deletePost (String id);
    Iterable<PostDto> findPostsByTags (Set<String> tags);
    Iterable<PostDto> findPostsByPeriod (String dateCreated);
    PostDto updatePost (String id, String title, String content, Set<String> tags);
}
