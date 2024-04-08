package ait.cohort34.forum.controller;

import ait.cohort34.forum.dto.ForumAddPostDto;
import ait.cohort34.forum.dto.ForumDto;
import ait.cohort34.forum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class ForumController {
    @Autowired
    private ForumService forumService;
    @PostMapping("/post/{{user}}")
    public Boolean addPost (@PathVariable ForumAddPostDto user){
        return forumService.addPost(user);
    }
    @GetMapping("/post/{{postId}}")
    public ForumDto findPostById(@PathVariable String postId) {
        return forumService.findPostById(postId);
    }

    @PutMapping("/post/{{postId}}/like")
    public ForumDto addLikeToPost(@PathVariable String postId) {
        return forumService.addLikeToPost(postId);
    }

    @GetMapping("/posts/author/{{user}}")
    public Iterable<ForumDto> findPostsByAuthor(@PathVariable String user) {
        return forumService.findPostsByAuthor(user);
    }

    @PutMapping("/post/{{postId}}/comment/{{user}}")
    public ForumDto addComment(@PathVariable String postId, @RequestBody String comment, @PathVariable String user) {
        return forumService.addComment (postId, comment, user);
    }

    @DeleteMapping("/post/{{postId}}")
    public ForumDto deletePost(@PathVariable String postId) {
        return forumService.deletePost(postId);
    }

    @PostMapping("/posts/tags")
    public Iterable<ForumDto> findPostsByTags(@RequestParam Set<String> tags) {
        return forumService.findPostsByTags(tags);
    }
    @PostMapping("/posts/period")
    public Iterable<ForumDto> findPostsByPeriod(@RequestParam String dateCreated) {
        return forumService.findPostsByPeriod(dateCreated);
    }

    @PutMapping("/post/{{postId}}")
    public ForumDto updatePost(@PathVariable String postId, @RequestParam String title, @RequestParam String content, @RequestParam Set<String> tags) {
        return forumService.updatePost(postId, title, content, tags);
    }
}




