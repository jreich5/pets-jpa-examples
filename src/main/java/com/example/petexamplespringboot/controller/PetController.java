package com.example.petexamplespringboot.controller;

import com.example.petexamplespringboot.model.Pet;
import com.example.petexamplespringboot.repos.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PetController {

    @Autowired
    private PetRepo petDao;

    @GetMapping("/pets")
    @ResponseBody
    private List<Pet> getAllPets() {
        return petDao.findAll();
    }

}
