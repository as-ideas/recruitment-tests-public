package de.futurecompany;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articles")
public class NewsArticleController {

    private final NewsArticleService articleService;

    public NewsArticleController(NewsArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArticleView> fetchArticle(@PathVariable String id) {
        ArticleView article = articleService.fetchArticle(id);

        return ResponseEntity.ok().body(article);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ArticleView>> listArticles() {
        List<ArticleView> articles = articleService.listArticles();

        return ResponseEntity.ok().body(articles);
    }
}
