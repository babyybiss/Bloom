package com.metavirtual.bloom.board.model.dto;

public class MemberCommentDTO {
    private int commentCode;
    private String commentContent;
    private String postedDate;
    private String deleteDate;
    private int boardCode;

    public MemberCommentDTO() {
    }

    public MemberCommentDTO(int commentCode, String commentContent, String postedDate, String deleteDate, int boardCode) {
        this.commentCode = commentCode;
        this.commentContent = commentContent;
        this.postedDate = postedDate;
        this.deleteDate = deleteDate;
        this.boardCode = boardCode;
    }

    public int getCommentCode() {
        return commentCode;
    }

    public void setCommentCode(int commentCode) {
        this.commentCode = commentCode;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public int getBoardCode() {
        return boardCode;
    }

    public void setBoardCode(int boardCode) {
        this.boardCode = boardCode;
    }

    @Override
    public String toString() {
        return "MemberCommentDTO{" +
                "commentCode=" + commentCode +
                ", commentContent='" + commentContent + '\'' +
                ", postedDate='" + postedDate + '\'' +
                ", deleteDate='" + deleteDate + '\'' +
                ", boardCode=" + boardCode +
                '}';
    }
}
