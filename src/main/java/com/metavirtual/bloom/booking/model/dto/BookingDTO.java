package com.metavirtual.bloom.booking.model.dto;

public class BookingDTO {
    private int bookingCode;
    private String bookingDate;
    private String memberId; // userId;
    private String therapistId; // userId;
    private String bookingStatus; // 예약상태 : 예약확정, 예약취소 선택버튼 요청을 전송

    public BookingDTO() {
    }

    public BookingDTO(int bookingCode, String bookingDate, String memberId, String therapistId, String bookingStatus) {
        this.bookingCode = bookingCode;
        this.bookingDate = bookingDate;
        this.memberId = memberId;
        this.therapistId = therapistId;
        this.bookingStatus = bookingStatus;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(String therapistId) {
        this.therapistId = therapistId;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "bookingCode=" + bookingCode +
                ", bookingDate='" + bookingDate + '\'' +
                ", memberId='" + memberId + '\'' +
                ", therapistId='" + therapistId + '\'' +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }
}
