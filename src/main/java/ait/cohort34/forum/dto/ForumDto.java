package ait.cohort34.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.repository.Query;

import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ForumDto {
    private String id;
    private String title;
    private String content;
    private String author;
    private String dateCreated;
    private Set<String> tags;
    private int likes;
    private Set<String> comments;

}
