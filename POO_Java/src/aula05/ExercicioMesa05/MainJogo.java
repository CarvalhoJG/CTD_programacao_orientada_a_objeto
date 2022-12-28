package aula05.Exercicio;

public class MainJogo {

    public static void main(String[] args) {


    UsuarioJogo usuario1 = new UsuarioJogo("Julia","Juh");
    UsuarioJogo usuario2 = new UsuarioJogo("Sofia", "Sof");

    usuario1.setPontuacao(10);
    usuario1.subirNivel();
    usuario1.bonificar(100);

    usuario2.setPontuacao(20);
    usuario2.subirNivel();
    usuario2.bonificar(200);

    }
}
