package com.clonecast.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clonecast.dtos.RegisterAudioDto;
import com.clonecast.models.AudioPodcast;
import com.clonecast.repositories.AudioPodcastRepository;
import com.clonecast.services.AudioPodcastService;

@Service
public class AudioPodcastServiceImpl implements AudioPodcastService{
    @Autowired
    private AudioPodcastRepository audioPodcastRepository;

    @Override
    public AudioPodcast createAudio(RegisterAudioDto registerAudioDto) {
        AudioPodcast audioPodcast = new AudioPodcast();

        audioPodcast.setName(registerAudioDto.getName());
        audioPodcast.setAuthor(registerAudioDto.getAuthor());
        audioPodcast.setLinkStreamAudio(registerAudioDto.getUrlStreamAudio());

        return audioPodcastRepository.save(audioPodcast);

    }

    @Override
    public AudioPodcast getAudioPodcast(UUID id) {
        AudioPodcast audioPodcast = audioPodcastRepository.findById(id).get();
        return audioPodcast;
    }

    public List<AudioPodcast> getAllAudioPodcats(){
        return audioPodcastRepository.findAll();
    }

    public AudioPodcast setRatioPodcast(UUID id, Double ratio) {
        AudioPodcast audioPodcast = audioPodcastRepository.findById(id).get();
        return audioPodcast;
    }

    public void deleteAudioById(UUID id){
        audioPodcastRepository.deleteById(id);
    }

}
