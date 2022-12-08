package com.clonecast.services.impl;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.clonecast.services.FileStorageService;

@Service
public class FileStorageServiceImpl implements FileStorageService{
    
    private final Path root = Path.of("src", "main", "resources", "static", "audios");

    @Override
    public void init(){
        try{
            Files.createDirectories(root);

        }catch (IOException e) {
            throw new RuntimeException("Could not initialize folder for upload!");
        }
    }

    @Override
    public void save(MultipartFile file) {
        try {
            Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
          } catch (Exception e) {
            if (e instanceof FileAlreadyExistsException) {
              throw new RuntimeException("A file of that name already exists.");
            }
      
            throw new RuntimeException(e.getMessage());
          }
    }
    
}
