package java1_06.pract2_1.main;

import java.time.LocalDateTime;


public class Comment {
    private String authorName;
    private LocalDateTime creationDate;
    private boolean moderated;
    private String text;

    public Comment(String authorName, LocalDateTime creationDate, boolean moderated, String text) {
        this.authorName = authorName;
        this.creationDate = creationDate;
        this.moderated = moderated;
        this.text = text;
    }

    public String getAuthorName() {
        return authorName;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public boolean isModerated() {
        return moderated;
    }

    public String getText() {
        return text;
    }
}


