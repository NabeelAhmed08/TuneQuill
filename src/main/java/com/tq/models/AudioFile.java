package com.tq.models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public record AudioFile ( @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  Long id,
	  String title,
	  String artist) {

}
