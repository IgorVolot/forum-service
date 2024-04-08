package ait.cohort34.forum.controller;

import ait.cohort34.forum.dto.AddPostDto;
import ait.cohort34.forum.dto.PostDto;
import ait.cohort34.forum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping("/post/{{user}}")
    public Boolean addPost (@PathVariable AddPostDto user){
        return postService.addPost(user);
    }
    @GetMapping("/post/{{postId}}")
    public PostDto findPostById(@PathVariable String postId) {
        return postService.findPostById(postId);
    }

    @PutMapping("/post/{{postId}}/like")
    public PostDto addLikeToPost(@PathVariable String postId) {
        return postService.addLikeToPost(postId);
    }

    @GetMapping("/posts/author/{{user}}")
    public Iterable<PostDto> findPostsByAuthor(@PathVariable String user) {
        return postService.findPostsByAuthor(user);
    }

    @PutMapping("/post/{{postId}}/comment/{{user}}")
    public PostDto addComment(@PathVariable String postId, @RequestBody String comment, @PathVariable String user) {
        return postService.addComment (postId, comment, user);
    }

    @DeleteMapping("/post/{{postId}}")
    public PostDto deletePost(@PathVariable String postId) {
        return postService.deletePost(postId);
    }

    @PostMapping("/posts/tags")
    public Iterable<PostDto> findPostsByTags(@RequestParam Set<String> tags) {
        return postService.findPostsByTags(tags);
    }
    @PostMapping("/posts/period")
    public Iterable<PostDto> findPostsByPeriod(@RequestParam String dateCreated) {
        return postService.findPostsByPeriod(dateCreated);
    }

    @PutMapping("/post/{{postId}}")
    public PostDto updatePost(@PathVariable String postId, @RequestParam String title, @RequestParam String content, @RequestParam Set<String> tags) {
        return postService.updatePost(postId, title, content, tags);
    }
}




