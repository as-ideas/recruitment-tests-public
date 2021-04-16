package de.futurecompany;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class NewsArticleService {

    private final NewsArticleRepository weltArticleRepository;

    public NewsArticleService(NewsArticleRepository weltArticleRepository) {
        this.weltArticleRepository = weltArticleRepository;
    }

    public ArticleView fetchArticle(String id) {
        return this.outbound(weltArticleRepository.get(id).get());
    }

    public List<ArticleView> listArticles() {
        return weltArticleRepository.list()
            .stream()
            .map(this::outbound)
            .collect(Collectors.toList()
        );
    }

    private ArticleView outbound(NewsArticle article) {
        return new ArticleView(article.getArticleId(),
            article.getTitle(), article.getText(),
            article.getAuthors().stream().map(ArticleAuthor::getAuthorName).collect(Collectors.toList())
        );
    }

}
