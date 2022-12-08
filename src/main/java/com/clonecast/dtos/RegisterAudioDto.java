package com.clonecast.dtos;

public class RegisterAudioDto {
    
    private String name;
    private String author;
    private String urlStreamAudio;
    public RegisterAudioDto() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getUrlStreamAudio() {
        return urlStreamAudio;
    }
    public void setUrlStreamAudio(String urlStreamAudio) {
        this.urlStreamAudio = urlStreamAudio;
    }
    
    
}
