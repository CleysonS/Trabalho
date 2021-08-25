package br.com.musica.musicaws.shared;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;


public class MusicaDto {

    private String id;
    @NotBlank(message = "ERRO! O titulo deve ser preenchido, por favor preencha novamente")
    private String titulo;
    @NotBlank(message = "ERRO! O artista deve ser preenchido, por favor preencha novamente")
    private String artista;
    @NotBlank(message = "ERRO! O album deve ser preenchido, por favor preencha novamente")
    private String album;
    @NotBlank(message = "ERRO! O genero deve ser preenchido, por favor preencha novamente")
    private String genero;
    @Positive(message = "ERRO! O Ano lancamento deve ser preenchido, por favor preencha novamente")
    private Integer anoLancamento;
    @NotBlank(message = "ERRO! O compositor deve ser preenchido, por favor preencha novamente")
    private String compositor;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    
    

    
}
