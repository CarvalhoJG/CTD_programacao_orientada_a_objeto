package aula06;

public class MainAdotarCachorro {

    public static void main(String[] args) {

         /*Estrutura:
        Classe nomeDoObjeto = nova classe (atributos do objetos)*/
        AdotarCachorro cao1 = new AdotarCachorro("Vira lata",2018,4.00,true,false,"Toby");
        cao1.verificarAdocao();
        cao1.ecaminharAdocao();
        AdotarCachorro cao2 = new AdotarCachorro("Pastor Alemão",2010,25.00,true,true,"Tor");
        cao2.verificarAdocao();
        cao2.ecaminharAdocao();
    }
}