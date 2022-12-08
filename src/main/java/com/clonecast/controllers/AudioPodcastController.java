package com.clonecast.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clonecast.dtos.RegisterAudioDto;
import com.clonecast.models.AudioPodcast;
import com.clonecast.services.impl.AudioPodcastServiceImpl;


@RestController
@RequestMapping("/podcasts")
public class AudioPodcastController {
    @Autowired
    AudioPodcastServiceImpl audioPodcastService;

    @PostMapping("/register")
    public ResponseEntity<AudioPodcast> createAudioPodcast (@RequestBody RegisterAudioDto registerAudioDto){
        return ResponseEntity.ok(audioPodcastService.createAudio(registerAudioDto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<AudioPodcast>> getAllPodcasts(){
        return ResponseEntity.ok(audioPodcastService.getAllAudioPodcats());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AudioPodcast> getAudioPodcastById(@PathVariable(value="id") UUID id){
        
        return ResponseEntity.ok(audioPodcastService.getAudioPodcast(id));
        
    }

    @PatchMapping("/{id}")
    public ResponseEntity<AudioPodcast> setRatioScore(@PathVariable(value="id") UUID id, @RequestParam Double ratio){
        
        return ResponseEntity.ok(audioPodcastService.setRatioPodcast(id, ratio));
        
    }


    @DeleteMapping("/delete/{id}")
    public void deleteAudioById(@PathVariable(value="id") UUID id){
        audioPodcastService.deleteAudioById(id);
    }

}
