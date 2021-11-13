package com.backendspring.springbackend.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Messages {

    private String name;
    private String email;
    private String message;

    public Messages() {       
}

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Messages [name=" + name + ", email=" + email + ", message=" + message + "]";
    }

}
