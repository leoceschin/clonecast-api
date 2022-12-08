package com.clonecast.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_audio")
public class AudioPodcast {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String author;
    private Double ratio = 0.0;
    private String linkStreamAudio;
    
    public AudioPodcast() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(String author){
        return author;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    public String getLinkStreamAudio() {
        return linkStreamAudio;
    }

    public void setLinkStreamAudio(String linkStreamAudio) {
        this.linkStreamAudio = linkStreamAudio;
    }


    
}
