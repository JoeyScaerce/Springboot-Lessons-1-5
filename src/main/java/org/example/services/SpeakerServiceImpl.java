package org.example.services;

import org.example.model.Speaker;
import org.example.repo.HibernateSpeakerRepoImpl;
import org.example.repo.SpeakerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepo repo;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepo speakerRepo) {
        System.out.println("SpeakerServiceImpl repo constructor");
        this.repo = speakerRepo;
    }

    @Override
    public List<Speaker> findall() {
        return repo.findAll();
    }

    @Autowired
    public void setRepo(SpeakerRepo repo) {
        System.out.println("SpeakerServiceImpl setter");
        this.repo = repo;
    }
}
