package com.tq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tq.models.AudioFile;

public interface AudioFileRepo extends JpaRepository<AudioFile, Long> {

}
