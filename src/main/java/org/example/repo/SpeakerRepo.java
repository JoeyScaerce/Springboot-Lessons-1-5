package org.example.repo;

import org.example.model.Speaker;

import java.util.List;

public interface SpeakerRepo {
    List<Speaker> findAll();
}
