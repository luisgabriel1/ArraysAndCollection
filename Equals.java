package Udemy.Arrays;

public class Equals {

    String nome;
    String Gmail;

    @Override
    public boolean equals(Object obj) {
        Equals outro = (Equals) obj;
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean gmailIgual = outro.Gmail.equals(this.Gmail);

        return nomeIgual && gmailIgual;
    }
}
