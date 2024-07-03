package com.tq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.tq.service.AudioFileService;

@RestController
public class AudioFileController {

	 @Autowired
	 private AudioFileService service;
	 
	 
	// public ResponseEntity<> name() {}
}
