package Ex6;

class Pessoa {
    private String nome;
    private String sobrenome;
    private String nomeSolteiraMae;
    private String cidadeNatal;

    public Pessoa(String nome, String sobrenome, String nomeSolteiraMae, String cidadeNatal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeSolteiraMae = nomeSolteiraMae;
        this.cidadeNatal = cidadeNatal;
    }

    public String gerarNomeStarWars() {
        String primeiroNome = sobrenome.length() >= 3 ? sobrenome.substring(0, 3) : sobrenome;
        primeiroNome += nome.length() >= 2 ? nome.substring(0, 2) : nome;

        String sobrenomeStarWars = nomeSolteiraMae.length() >= 2 ? nomeSolteiraMae.substring(0, 2) : nomeSolteiraMae;
        sobrenomeStarWars += cidadeNatal.length() >= 3 ? cidadeNatal.substring(0, 3) : cidadeNatal;

        return primeiroNome + " " + sobrenomeStarWars;
    }
}