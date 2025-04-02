package br.com.unicuritiba.GameLibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unicuritiba.GameLibrary.Models.*;

public interface GameLibrary_Repository extends JpaRepository<Games, Long> {
	

}
