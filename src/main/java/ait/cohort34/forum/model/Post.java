package ait.cohort34.forum.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@EqualsAndHashCode (of = "id")
@NoArgsConstructor
public class Post {
    private String id;
    @Setter
    private String title;

    private Map<String, String> comment = new HashMap<>();

    public Post(String id, String title) {
        this.id = id;
        this.title = title;
    }
}
