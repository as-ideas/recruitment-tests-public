package de.futurecompany;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class NewsArticleRepository {

    private static final List<NewsArticle> staticArticles = Collections.singletonList(
        new NewsArticle("1", "Very nice article", "Hello there. I'm not really interesting to read without images", Collections.singletonList(new ArticleAuthor("author1", "Stefan B.")))
    );

    public Optional<NewsArticle> get(String articleId) {
        return staticArticles.stream().filter((a) -> a.getArticleId().equals(articleId)).findFirst();
    }

    public List<NewsArticle> list() {
        return staticArticles;
    }
}
