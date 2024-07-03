package com.example.Doker.service;

import com.example.Doker.entity.Persona;
import com.example.Doker.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll(){
        return this.personaRepository.findAll();
    }
    public Persona findId(Long id){
        return this.personaRepository.findById(id).orElse(new Persona());
    }
    public Persona addPersona(Persona persona){
        return this.personaRepository.save(persona);
    }
}
