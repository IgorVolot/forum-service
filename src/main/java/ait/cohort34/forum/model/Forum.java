package ait.cohort34.forum.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@EqualsAndHashCode (of = "id")
@NoArgsConstructor
public class Forum {
    private String id;
    @Setter
    private String title;

    public Forum(String id, String title) {
        this.id = id;
        this.title = title;
    }
}
