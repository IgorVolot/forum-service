package ait.cohort34.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddPostDto {
    private String id;
    private String user;
    private String title;
    private String content;
    private Set<String> tags;
}
