package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    private ParticipantDao participantDao;

    @Autowired
    public ParticipantService(ParticipantDao participantDao) {
        this.participantDao = participantDao;
    }

    public void save(Participant participant) {
        participantDao.save(participant);
    }

    public void save(ParticipantRequest participantRequest) {
        participantDao.save(new Participant(participantRequest.name,
                participantRequest.email,
                participantRequest.level,
                participantRequest.primarySkill));
    }

    public Participant getParticipant(int id){
        return participantDao.getOne(id);
    }

    public List<Participant> getAll(){
        return participantDao.findAll();
    }

    public void delete (int id){
        participantDao.deleteById(id);
    }
}