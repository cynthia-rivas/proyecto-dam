package com.example.healthfood.model;

public class Video {
    private int id = 0;
    private String titulo;
    private String description;
    private String youtubeId;
    private String urlVideo;
    private String urlImagen;

    public Video(String titulo, String description, String youtubeId) {
        this.titulo = titulo;
        this.description = description;
        this.youtubeId = youtubeId;

        // https://img.youtube.com/vi/2tXQbi16EdI/mqdefault.jpg
        // https://www.youtube.com/watch?v=2tXQbi16EdI

        this.urlVideo = "https://www.youtube.com/watch?v=" + youtubeId;
        this.urlImagen = "https://img.youtube.com/vi/"+youtubeId+"/mqdefault.jpg";
    }

    public int getId() {
        return id;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    // https://img.youtube.com/vi/2tXQbi16EdI/mqdefault.jpg
    // https://www.youtube.com/watch?v=2tXQbi16EdI

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
