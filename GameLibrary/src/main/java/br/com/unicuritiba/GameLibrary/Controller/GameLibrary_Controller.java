package br.com.unicuritiba.GameLibrary.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.unicuritiba.GameLibrary.Repository.*;
import br.com.unicuritiba.GameLibrary.Models.*;

@RestController
public class GameLibrary_Controller {

    @Autowired
    GameLibrary_Repository repository;

    @GetMapping("/games")
    public ResponseEntity<List<Games>> getGames() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/games")
    public ResponseEntity<Games> saveGame(@RequestBody Games game) {
        Games gameSalvo = repository.save(game);
        return ResponseEntity.ok(gameSalvo);
    }

    @DeleteMapping("/games/{id}")
    public ResponseEntity<Void> removeGame(@PathVariable long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/games/{id}")
    public ResponseEntity<Games> updateGame(@PathVariable long id, @RequestBody Games game) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build(); 
        }
        game.setId(id);
        Games updatedGame = repository.save(game);
        return ResponseEntity.ok(updatedGame);
    }
}
