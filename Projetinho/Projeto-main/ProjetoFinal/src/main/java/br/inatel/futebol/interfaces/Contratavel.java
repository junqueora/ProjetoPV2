package main.java.br.inatel.futebol.interfaces;

import main.java.br.inatel.futebol.pessoa_juridica.Equipe;
import main.java.br.inatel.futebol.pessoa_juridica.Federacao;

public interface Contratavel {

    default void contratar(Equipe equipe, int valor) {

    }

    default void contratar(Equipe equipe){

    }

    default void contratar(Federacao federacao){

    }
}
