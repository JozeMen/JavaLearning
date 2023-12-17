package java1_06.pract2_1.main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommentService {
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> getModeratedCommentsSortedByDate(int page, int pageSize) {
        return comments.stream()
                .filter(Comment::isModerated)
                .sorted((c1, c2) -> c2.getCreationDate().compareTo(c1.getCreationDate()))
                .skip(page * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());
    }

    public List<Comment> getCommentsByAuthor(String authorName, int page, int pageSize) {
        return comments.stream()
                .filter(comment -> comment.getAuthorName().equals(authorName))
                .sorted((c1, c2) -> Boolean.compare(c1.isModerated(), c2.isModerated()))
                .skip(page * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());
    }

    public List<String> getAuthorsAfterDate(LocalDateTime date) {
        return comments.stream()
                .filter(comment -> comment.getCreationDate().isAfter(date))
                .map(Comment::getAuthorName)
                .distinct()
                .collect(Collectors.toList());
    }
}
