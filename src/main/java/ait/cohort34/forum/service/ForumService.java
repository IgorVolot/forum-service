package ait.cohort34.forum.service;

import ait.cohort34.forum.dto.ForumAddPostDto;
import ait.cohort34.forum.dto.ForumDto;
import org.springframework.data.mongodb.repository.Query;

import java.util.Set;

public interface ForumService {
    Boolean addPost (ForumAddPostDto forumAddPostDto);
    ForumDto findPostById (String id);
    ForumDto addLikeToPost (String id);
    @Query("user")
    Iterable<ForumDto> findPostsByAuthor (String author);
    ForumDto addComment (String id, String comment, String user);
    ForumDto deletePost (String id);
    Iterable<ForumDto> findPostsByTags (Set<String> tags);
    Iterable<ForumDto> findPostsByPeriod (String dateCreated);
    ForumDto updatePost (String id, String title, String content, Set<String> tags);
}
