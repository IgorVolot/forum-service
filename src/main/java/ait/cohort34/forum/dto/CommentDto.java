package ait.cohort34.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CommentDto extends PostDto {
    private String user;
    private String message;
    private LocalDateTime dateCreated;
    private int likes;
}