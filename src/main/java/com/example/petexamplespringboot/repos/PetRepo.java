package com.example.petexamplespringboot.repos;

import com.example.petexamplespringboot.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepo extends JpaRepository<Pet, Long> {
}
