// Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public  class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Títullo da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lanaçameto: " + anoLancamento);
    }

    void avalia (double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return  somaDasAvaliacoes / numAvaliacoes;
    }
}