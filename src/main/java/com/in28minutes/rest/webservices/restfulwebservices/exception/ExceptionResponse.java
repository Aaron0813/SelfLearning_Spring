package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {
    private Date date;
    private String message;
    private String details;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ExceptionResponse(Date date, String message, String details) {
        this.date = date;
        this.message = message;
        this.details = details;
    }
}
