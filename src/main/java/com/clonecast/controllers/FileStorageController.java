package com.clonecast.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.clonecast.message.ResponseMessage;
import com.clonecast.services.impl.FileStorageServiceImpl;

@RestController
@CrossOrigin("http://localhost:8081")
public class FileStorageController {
    @Autowired
    FileStorageServiceImpl storageService;
    

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String streamLink = "";
        try {
            storageService.save(file);

            streamLink = storageService.retriveStreamLink(file);
            
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(streamLink));
        } catch (Exception e) {
            streamLink = "Could not upload the file: " + file.getOriginalFilename() + ". Error: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(streamLink));
        }
    }

}
