package org.example.repo;
import org.example.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepo")
public class HibernateSpeakerRepoImpl implements SpeakerRepo {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstname("Adam");
        speaker.setLastName("west");
        speakers.add(speaker);

        return speakers;
    }
}
