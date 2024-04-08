package ait.cohort34.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.repository.Query;

import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ForumAddPostDto {
    private String user;
    private String title;
    private String content;
    private Set<String> tags;
}
