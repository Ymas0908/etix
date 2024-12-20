package com.tix.etix.services.impl;

import com.tix.etix.models.Usager;
import com.tix.etix.repositories.UsagerRepository;
import com.tix.etix.services.UsagerService;

import java.util.List;

public class UsagerServiceImpl implements UsagerService {
    private UsagerRepository usagerRepository;
    @Override
    public Usager creerUsager(Usager usager) {
        return usagerRepository.save(usager);
    }

    @Override
    public Usager getUsagerById(Integer id) {
        return usagerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usager> getUsagerByEmail(String email) {
        return usagerRepository.findByEmail(email);
    }


}
