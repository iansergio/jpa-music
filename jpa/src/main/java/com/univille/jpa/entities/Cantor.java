package com.univille.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Cantor extends Usuario{

    private long ouvintesMensais;

    @OneToMany(mappedBy = "cantor")
    private List<Musica> musicas;

    @OneToOne
    private Perfil perfil;
}
