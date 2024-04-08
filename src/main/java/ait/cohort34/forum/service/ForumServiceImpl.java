package ait.cohort34.forum.service;

import ait.cohort34.forum.dao.ForumRepository;
import ait.cohort34.forum.dto.ForumAddPostDto;
import ait.cohort34.forum.dto.ForumDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ForumServiceImpl implements ForumService{

    private final ForumRepository forumRepository;

    @Override
    public Boolean addPost(ForumAddPostDto forumAddPostDto) {
        return null;
    }

    @Override
    public ForumDto findPostById(String id) {
        return null;
    }

    @Override
    public ForumDto addLikeToPost(String id) {
        return null;
    }

    @Override
    public Iterable<ForumDto> findPostsByAuthor(String author) {
        return null;
    }

    @Override
    public ForumDto addComment(String id, String comment, String user) {
        return null;
    }

    @Override
    public ForumDto deletePost(String id) {
        return null;
    }

    @Override
    public Iterable<ForumDto> findPostsByTags(Set<String> tags) {
        return null;
    }

    @Override
    public Iterable<ForumDto> findPostsByPeriod(String dateCreated) {
        return null;
    }

    @Override
    public ForumDto updatePost(String id, String title, String content, Set<String> tags) {
        return null;
    }
}
