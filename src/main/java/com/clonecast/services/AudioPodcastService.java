package com.clonecast.services;

import java.util.UUID;

import com.clonecast.dtos.RegisterAudioDto;
import com.clonecast.models.AudioPodcast;

public interface AudioPodcastService {
    
    AudioPodcast createAudio(RegisterAudioDto registerAudioDto);

    AudioPodcast getAudioPodcast(UUID id);


}
