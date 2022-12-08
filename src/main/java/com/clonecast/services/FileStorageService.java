package com.clonecast.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FileStorageService {
    
    public void init();
    
    public void save(MultipartFile file);

    
}
