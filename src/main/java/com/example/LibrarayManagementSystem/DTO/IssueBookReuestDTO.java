package com.example.LibrarayManagementSystem.DTO;

public class IssueBookReuestDTO {

    private int bookId;
    private int cardId;

    public IssueBookReuestDTO() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
}
