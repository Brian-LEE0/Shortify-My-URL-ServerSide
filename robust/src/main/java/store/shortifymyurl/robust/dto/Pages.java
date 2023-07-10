package store.shortifymyurl.robust.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pages {
    @Schema(example = "000000001")
    private String user_id;
    @Schema(example = "URL")
    private String contentid;
    @Schema(example = "Date")
    private String sortby;
    @Schema(example = "True")
    private Boolean orderby; // 0 ASC 1 DESC
}