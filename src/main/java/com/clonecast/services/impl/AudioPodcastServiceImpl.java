package com.clonecast.services.impl;

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
    public AudioPodcast createAudio(RegisterAudioDto registerAudioDto, String urlUpload, String linkStreamAudio) {
        AudioPodcast audioPodcast = new AudioPodcast();

        audioPodcast.setName(registerAudioDto.getName());
        audioPodcast.setAuthor(registerAudioDto.getAuthor());
        audioPodcast.setUrlOriginAudio(urlUpload);

        audioPodcast.setLinkStreamAudio(linkStreamAudio);

        return audioPodcastRepository.save(audioPodcast);

    }

    @Override
    public AudioPodcast getAudioPodcast(UUID id) {
        AudioPodcast audioPodcast = audioPodcastRepository.findById(id).get();
        return audioPodcast;
    }
}
