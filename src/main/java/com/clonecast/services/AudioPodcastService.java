package com.clonecast.services;

import java.util.UUID;

import com.clonecast.dtos.RegisterAudioDto;
import com.clonecast.models.AudioPodcast;

public interface AudioPodcastService {
    
    AudioPodcast createAudio(RegisterAudioDto registerAudioDto, String urlUpload, String linkStreamAudio);

    AudioPodcast getAudioPodcast(UUID id);


}
