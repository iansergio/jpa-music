package com.univille.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private long vizualizacao;
    private long curtidas;

    @ManyToOne
    @JoinColumn(name = "cantor_id")
    private Cantor cantor;

    @ManyToMany(mappedBy = "musicas")
    private List<Playlist> playlists;
}
