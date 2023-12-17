package java1_06.pract2_1.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.List;

import java1_06.pract2_1.main.Comment;
import java1_06.pract2_1.main.CommentService;

import org.junit.Test;

public class CommentServiceTester {
    @Test
    public void testSortedModerated() {
        CommentService commentService = new CommentService();

        commentService.addComment(new Comment("Миша", LocalDateTime.now().minusDays(2), false, "Красотка!"));
        commentService.addComment(new Comment("Маша", LocalDateTime.now().minusDays(1), true, "Моя)"));
        commentService.addComment(new Comment("Паша", LocalDateTime.now(), true, "Это ты где?"));
        commentService.addComment(new Comment("Ира", LocalDateTime.now().plusDays(1), true, "Солнышко мое"));
        List<Comment> moderatedComments = commentService.getModeratedCommentsSortedByDate(0, 10);
        String[] reuslt = new String[moderatedComments.size()];
        reuslt[0] = "Солнышко мое";
        reuslt[1] = "Это ты где?";
        reuslt[2] = "Моя)";

        int i = 0;
        for (var element : moderatedComments) {
            assertEquals(reuslt[i++], element.getText());
        }
    }

    @Test
    public void testGetCommentsByAuthor() {
        CommentService commentService = new CommentService();

        commentService.addComment(new Comment("Миша", LocalDateTime.now().minusDays(2), false, "Красотка!"));
        commentService.addComment(new Comment("Маша", LocalDateTime.now().minusDays(1), true, "Моя)"));
        commentService.addComment(new Comment("Паша", LocalDateTime.now(), true, "Это ты где?"));
        commentService.addComment(new Comment("Ира", LocalDateTime.now().plusDays(1), true, "Солнышко мое"));
        List<Comment> aliceComments = commentService.getCommentsByAuthor("Миша", 0, 10);
        String[] reuslt = new String[aliceComments.size()];
        reuslt[0] = "Красотка!";

        int i = 0;  
        for (var element : aliceComments) {
            assertEquals(reuslt[i++], element.getText());
        }
    }

    @Test
    public void testGetAuthorsAfterDate() {
        CommentService commentService = new CommentService();

        commentService.addComment(new Comment("Миша", LocalDateTime.now().minusDays(2), false, "Красотка!"));
        commentService.addComment(new Comment("Маша", LocalDateTime.now().minusDays(1), true, "Моя)"));
        commentService.addComment(new Comment("Паша", LocalDateTime.now(), true, "Это ты где?"));
        commentService.addComment(new Comment("Ира", LocalDateTime.now().plusDays(1), true, "Солнышко мое"));

        LocalDateTime targetDate = LocalDateTime.now().minusDays(1);
        List<String> authorsAfterDate = commentService.getAuthorsAfterDate(targetDate);
        String[] reuslt = new String[authorsAfterDate.size()];
        reuslt[0] = "Паша";
        reuslt[1] = "Ира";

        int i = 0;
        for (var element : authorsAfterDate) {
            assertEquals(reuslt[i++], element);
        }
    }
}
