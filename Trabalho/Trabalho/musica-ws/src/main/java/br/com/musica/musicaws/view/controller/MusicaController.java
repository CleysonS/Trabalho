package br.com.musica.musicaws.view.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.musica.musicaws.service.MusicaService;
import br.com.musica.musicaws.shared.MusicaDto;

@RestController
@RequestMapping(value = "/api/musicas")
public class MusicaController {
    @Autowired
    MusicaService servico;

    @GetMapping
    public ResponseEntity<List<MusicaDto>> obterMusicas() {
        return new ResponseEntity<>(servico.listarMusicas(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MusicaDto> criarMusica(@RequestBody @Valid MusicaDto musica){
        return new ResponseEntity<>( servico.criarMusica(musica), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity <Void> excluirMusica(@PathVariable String id){
        servico.excluirMusica(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity< MusicaDto> atualizarMusica(@PathVariable String id, @RequestBody @Valid MusicaDto musica) {
        MusicaDto dto = new ModelMapper().map(musica, MusicaDto.class);
        Optional<MusicaDto> music = servico.atualizarMusica(id, dto);
        if(music.isPresent()){
            return new ResponseEntity<>(music.get(), HttpStatus.FOUND);

        }
        return new ResponseEntity<>( HttpStatus.NOT_ACCEPTABLE);
    }

}
