package com.example.petexamplespringboot.controller;

import com.example.petexamplespringboot.model.Pet;
import com.example.petexamplespringboot.repos.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PetController {

    private PetRepo petDao;

    public PetController(PetRepo petDao) {
        this.petDao = petDao;
    }

    @GetMapping("/pets")
    @ResponseBody
    private List<Pet> getAllPets() {
        return petDao.findAll();
    }

    @GetMapping("/pets")
    private String getAllPetsView(Model vModel) {
        vModel.addAttribute("pets", petDao.findAll());
        return "pets/index";
    }


    /*

    Example of saving a post with an associated user...

    @PostMapping(???);
    public String createPost(Pull out request params for Post here...) {
        User user = userDao.findById(1L).get();
        Post post = new Post(pass in arguments to constructor);
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";
    }


     */
}
