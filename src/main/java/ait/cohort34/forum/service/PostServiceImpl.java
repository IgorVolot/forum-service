package ait.cohort34.forum.service;

import ait.cohort34.forum.dao.PostRepository;
import ait.cohort34.forum.dto.AddPostDto;
import ait.cohort34.forum.dto.PostDto;
import ait.cohort34.forum.model.Post;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ait.cohort34.forum.dto.exceptions.PostNotFoundExeption;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    @Override
    public Boolean addPost(AddPostDto addPostDto) {
        if (postRepository.existsById(addPostDto.getUser())) {
            return false;
        }
        Post forum = modelMapper.map(addPostDto, Post.class);
        postRepository.save(forum);
        return true;
    }

    @Override
    public PostDto findPostById(String id) {
        Post forum = postRepository.findById(id).orElseThrow(PostNotFoundExeption::new);
        return modelMapper.map(forum, PostDto.class);
    }

    @Override
    public PostDto addLikeToPost(String id) {
        return null;
    }

    @Override
    public Iterable<PostDto> findPostsByAuthor(String author) {
        return null;
    }

    @Override
    public PostDto addComment(String id, String comment, String user) {
        return null;
    }

    @Override
    public PostDto deletePost(String id) {
        return null;
    }

    @Override
    public Iterable<PostDto> findPostsByTags(Set<String> tags) {
        return null;
    }

    @Override
    public Iterable<PostDto> findPostsByPeriod(String dateCreated) {
        return null;
    }

    @Override
    public PostDto updatePost(String id, String title, String content, Set<String> tags) {
        return null;
    }
}
