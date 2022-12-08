package com.clonecast.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clonecast.models.AudioPodcast;

@Repository
public interface AudioPodcastRepository extends JpaRepository<AudioPodcast, UUID>{
    
}
