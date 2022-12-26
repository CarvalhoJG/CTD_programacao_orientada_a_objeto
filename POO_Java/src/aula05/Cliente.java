package aula05;


    /*Enunciado do exercicio esta em UML-ClienteBancoDigital.png*/
public class Cliente {
    /* Uma classe é um modelo ou molde ABSTRATO onde são programados um conjunto de objetos
    com características afins, que possuem atributos (características) e métodos
    (comportamentos) comuns.*/

    //Atributos: São caracteristicas distintas de um objeto. Sua extrutura é composta por: modificador de acesso +tipo de dados + nome escolhido.
    private int numeroCliente;
    private String nome;
    private Double divida;

    /*Construtor: Informa como um objeto deve ser criado.
     Metodo contrutor refere ao atributo com this informando que esta variavel recebe o valor infromado no paramentro */
    public Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0D; //Neste caso iniciamos a variavel com valor 0 pois entendemos que o objeto cliente inicia aconta sem divida.
    }

    public int geraId(){
        return (int) (Math.random()*100+1);
    }

    //Getters and setters, Nomeamos os mentodos publicos pois outras classes podem chamar esses metodos livrimente.
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDivida() {
        return divida;
    }

    public void setDivida(Double divida) {
        this.divida = divida;
    }



    /*Metodo ou função: Determinan as ações ou resposabilidades de um objeto. Sua extrutura é composta por:
    modificador de acesso tipo de retorno + nome escolhido: deve iniciar com verbo.*/
    //neste caso vamos criar um metodo void(sem retono) pois ele ira aumentar a divida e já ira informar no console.
    public void aumentarDivida(Double valor){
        this.divida += valor; // O termo para esta abreviação é suprimir, que correponde a mesmo coisa que: this.divida = this.divida + valor;
        System.out.println("O saldo devedor do cliente " +this.nome + " é de R$ " + this.divida);
    }

    /*Metodo ou função: Determinan as ações ou resposabilidades de um objeto. Sua extrutura é composta por:
    modificador de acesso tipo de retorno + nome escolhido: deve iniciar com verbo.*/
    //neste caso vamos criar um metodo void(sem retono) pois ele ira diminuir a divida e já ira informar no console.
    public void pagarDivida(Double valor) {
        if (this.divida == 0) {
            /*Quando o metodo diminuirDivida for chamado o if verifica se ha divida com a condição:
             se o valor na variavel divida for igual a zero então não ha dividas a serem pagas.*/
            System.out.println("Não há dividas á pagar");
        } else {
            /*Casose o valor da variavel divida for diferente de zero então ha dividas a serem pagas.*/
            this.divida -= valor; // O termo para esta abreviação é suprimir, que correponde a mesmo coisa que: this.divida = this.divida - valor;
            System.out.println("O saldo devedor do cliente " + this.nome + " é de R$ " + this.divida);
        }
    }
}
