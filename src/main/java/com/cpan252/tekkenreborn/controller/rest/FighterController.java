package com.cpan252.tekkenreborn.controller.rest;

import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.model.dto.CreateFighter;
import com.cpan252.tekkenreborn.repository.FighterRepository;
import com.cpan252.tekkenreborn.repository.FighterRepositoryPaginated;

import jakarta.validation.Valid;

@RestController
// essentially the full path is http://localhost:8080/api/fighters
@RequestMapping(path = "/api/fighters", produces = "application/json")
public class FighterController {

    private final FighterRepositoryPaginated fighterRepositoryPaginated;

    private final FighterRepository fighterRepository;

    public FighterController(FighterRepositoryPaginated fighterRepositoryPaginated,
            FighterRepository fighterRepository) {
        this.fighterRepositoryPaginated = fighterRepositoryPaginated;
        this.fighterRepository = fighterRepository;
    }

    @GetMapping
    public Iterable<Fighter> allFighters(@RequestParam("page") Optional<Integer> page,
            @RequestParam("size") Optional<Integer> size) {
        if (!page.isPresent() || !size.isPresent()) {
            return fighterRepository.findAll();
        } else {
            return fighterRepositoryPaginated.findAll(PageRequest.of(page.get(), size.get()));
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFighter(@PathVariable("id") Long id) {
        fighterRepository.deleteById(id);
    }

    @PostMapping
    public Fighter createFighter(@Valid @RequestBody CreateFighter fighter) {
        return fighterRepository.save(fighter.toFighter());
    }

    @PutMapping("/{id}")
    public Fighter updateFighter(@PathVariable("id") Long id,
            @Valid @RequestBody CreateFighter fighter) {
        var fighterToUpdate = fighterRepository.findById(id).orElseThrow();
        fighterToUpdate.setName(fighter.getName());
        fighterToUpdate.setAnimeFrom(fighter.getAnimeFrom());
        fighterToUpdate.setDamagePerHit(fighter.getDamagePerHit());
        fighterToUpdate.setHealth(fighter.getHealth());
        fighterToUpdate.setResistance(fighter.getResistance());
        return fighterRepository.save(fighterToUpdate);
    }

    @PatchMapping("/{id}")
    public Fighter partialUpdateFighter(@PathVariable("id") Long id, @RequestBody Map<String, Object> updates){
        Fighter fighterToUpdate = fighterRepository.findById(id).orElseThrow();

        // Update only the fields that are present in the request
        if(updates.containsKey("name")){
            fighterToUpdate.setAnimeFrom(Fighter.Anime.valueOf((String) updates.get("name")));
        }
        if(updates.containsKey("animeFrom")){
            fighterToUpdate.setAnimeFrom(Fighter.Anime.valueOf((String) updates.get("animeFrom")));
        }
        if(updates.containsKey("damagePerHit")){
            fighterToUpdate.setAnimeFrom(Fighter.Anime.valueOf((String) updates.get("damagePerHit")));
        }
        if(updates.containsKey("health")){
            fighterToUpdate.setAnimeFrom(Fighter.Anime.valueOf((String) updates.get("health")));
        }
        if(updates.containsKey("resistance")){
            fighterToUpdate.setAnimeFrom(Fighter.Anime.valueOf((String) updates.get("resistance")));
        }
        if(updates.containsKey("url")){
            fighterToUpdate.setAnimeFrom(Fighter.Anime.valueOf((String) updates.get("url")));
        }
        return fighterRepository.save(fighterToUpdate);
    }

}
