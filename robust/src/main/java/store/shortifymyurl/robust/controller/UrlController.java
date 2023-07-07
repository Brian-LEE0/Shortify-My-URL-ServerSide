package store.shortifymyurl.robust.controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.*;

import store.shortifymyurl.robust.dto.PagesDTO;
import store.shortifymyurl.robust.dto.UrlDTO;

@RestController
@RequestMapping("/api/v1/url")
public class UrlController {

    @PostMapping(value = "/shortify")
    public String create_shortify_url(@RequestBody UrlDTO url) {

        return url.toString();
    }

    @PutMapping(value = "/shortify/{url}")
    public String update_shortify_url(@RequestBody UrlDTO url) {

        return url.toString();
    }

    @GetMapping(value = { "/myurls/{page_n}", "/myurls" })
    public String get_myurls(@PathVariable(required = false) Optional<Integer> page_n, PagesDTO pageinfo) {
        // TODO: process Get request
        int n = page_n.orElse(1);
        return n + pageinfo.toString();
    }

}
