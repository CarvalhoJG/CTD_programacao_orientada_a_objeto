package aula05.Exercicio;

/*Enunciado do exercicio esta em UML_UsuarioJogo.png*/

public class UsuarioJogo {

    //Atributos
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    //Contrutor
    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
        this.nivel =0;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //metodo para aumentar pontuação
    public void aumentarPontuacao(){
        this.pontuacao += 0;

    }

    //metodo para subir de nivel
    public void subirNivel(){
        this.nivel += 1;
        System.out.println();
    }

    //metodo bonificar
    public void bonificar(int valor){
        valor = this.pontuacao + 100;
        System.out.println("Ola " +this.nickname+ " sua pontuação é " +this.pontuacao+ " e seu nivel é " +this.nivel+ ". Você ganhou uma bonificação de 100 pontos, pontuação atual é " +valor);
    }


}
