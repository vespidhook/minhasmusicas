package br.dev.brunoalves.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " � considerado sucesso absoluto" + " e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " tambem � um dos que todo mundo esta " + " curtindo");
        }
    }
}
