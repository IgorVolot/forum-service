package ait.cohort34.forum.dao;

import ait.cohort34.forum.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.stream.Stream;

public interface PostRepository extends MongoRepository<Post, String> {
    Optional<Post> findById (String id);

}
