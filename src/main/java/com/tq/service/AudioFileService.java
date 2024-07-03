package com.tq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tq.models.AudioFile;
import com.tq.repository.AudioFileRepo;

public class AudioFileService {
	
	@Autowired
	private AudioFileRepo audioFileRepo;
	
	public AudioFile saveAudioFile(AudioFile audioFile) {
	return	this.audioFileRepo.save(audioFile);
	}
	
	public AudioFile findAudioFileByID(Long id) {
		return this.audioFileRepo.getReferenceById(id);
	}

	public List<AudioFile> findAllAudioFile() {
		return this.audioFileRepo.findAll();
	}
}
