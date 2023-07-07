package store.shortifymyurl.robust.controller;

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

    @GetMapping(value = { "/myurls/{page_n}", "/myurls/" })
    public String get_myurls(@PathVariable int page_n, PagesDTO pageinfo) {
        // TODO: process Get request

        return page_n + pageinfo.toString();
    }

}
