package aula04;

public class Encapsulamento {

    //Atributos declarados como privado, deste modo só pode ser acessado e modificado dentro da própria classe.
    private String nome;
    private Integer cpf;
    private Boolean isMaiorIdade;
    private boolean isMaiorIdade1;
    private Double salario;

    //Public, sendo assim pode ser acessado pro qualquer classe em qualquer pacote
    public void praticarCriarMetodo(){
        //Este é um metodo e deve ser public ou protected
    }

    //Protected permite modificar os atributos, métodos e construtores, tornando-os acessíveis no mesmo pacote e subclasses.
    protected void praticarCriarMetodoI(){

    }

    //Static seu valor não muda e pode ser acessado por qualquer classe.
    private static String corOlhos = "castanho";

    //getters and setters permite o acesso dos atributos para consulta ou modificação de seu valor
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getMaiorIdade() {
        return isMaiorIdade;
    }

    public void setMaiorIdade(Boolean maiorIdade) {
        isMaiorIdade = maiorIdade;
    }

    public boolean isMaiorIdade1() {
        return isMaiorIdade1;
    }

    public void setMaiorIdade1(boolean maiorIdade1) {
        isMaiorIdade1 = maiorIdade1;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    //video 24 minutos


}


