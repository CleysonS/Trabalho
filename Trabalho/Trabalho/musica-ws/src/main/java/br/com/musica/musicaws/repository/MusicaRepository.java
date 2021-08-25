package br.com.musica.musicaws.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.musica.musicaws.model.Musica;

public interface MusicaRepository extends MongoRepository  <Musica, String>{
    
}
