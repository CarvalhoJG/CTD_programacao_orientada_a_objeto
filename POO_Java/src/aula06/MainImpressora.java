package aula06;

public class MainImpressora {
    public static void main(String[] args) {

        Impressora impressoraHP = new Impressora("HP5010", "USB");
        impressoraHP.setFolhasDisponiveis(50);
        impressoraHP.imprimir("Ola turma");
        System.out.println(impressoraHP.getFolhasDisponiveis());

    }

}
