package store.shortifymyurl.robust.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
    private String id;
    private String email;
    private String name;
    private int tier;
}
