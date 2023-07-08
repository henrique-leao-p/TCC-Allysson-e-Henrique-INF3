package model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "message")
public class message {

    //attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "hashed_content", nullable = false, length = 1023)
    private Byte hashedContent;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "extension", nullable = false, length = 5)
    private String extension;

    @Column(name = "sender_name", nullable = false)
    private String senderName;

    @Column(name = "recipient_name", nullable = false)
    private String recipientName;

    @Column(name = "status_viewed", nullable = false)
    private boolean statusViewed;

    //constructors

    public message() {

    }

    public message(long id, Byte hashedContent, Date date, String extension, String senderName, String recipientName, boolean statusViewed) {
        this.id = id;
        this.hashedContent = hashedContent;
        this.date = date;
        this.extension = extension;
        this.senderName = senderName;
        this.recipientName = recipientName;
        this.statusViewed = statusViewed;
    }

    //encapsulation

    public long getId() {
        return id;
    }

    public Byte getHashedContent() {
        return hashedContent;
    }

    public void setHashedContent(Byte hashedContent) {
        this.hashedContent = hashedContent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public boolean isStatusViewed() {
        return statusViewed;
    }

    public void setStatusViewed(boolean statusViewed) {
        this.statusViewed = statusViewed;
    }

    //methods

}