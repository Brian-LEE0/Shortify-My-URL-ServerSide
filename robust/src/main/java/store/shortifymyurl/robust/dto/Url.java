package store.shortifymyurl.robust.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "id")
public class Url {
    private String id; // UUID
    private String original_url;
    private String short_url;
    private String user_id;
    private Date expire;

}
