package aula06;

import java.time.LocalDate;

//CTRL + ALT + L Para corrigir identação do codigo

public class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(String modelo, String tipoConexao) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }


    //Sabemos se um metodo tem retono quando no UML ele depois dos parenteses tem dois pontos e um tipo, exemplo: + temPapel(): boolean
    private boolean temPapel1() {
        if (this.folhasDisponiveis >= 1) {
            //System.out.println("Ha folhas dispniveis");
            return true;
        } else {
            //System.out.println("Não ha folhas disponiveis");
            return false;
        }
    }

    //Sabemos se um metodo tem retono quando no UML depois dos parenteses tiver dois pontos e um tipo, exemplo: + temPapel(): boolean
    private boolean temPapel() {
        return this.folhasDisponiveis > 0;
        /*Em uma condição booleana a nossa condição será sempre verdadeira ou falsa.
        Neste caso como só temos uma condição a ser testada então podemos condicionar uma situação ao verdadeiro,
          caso não seja atendido, automaticamente será falso. */
    }


    public void imprimir1() {

        if (temPapel() == true) {//Esta logica não esta errada, porem ela esta repetindo o que ha no metodo temPapel.
            System.out.println("Ha folhas dispniveis, impressão será realizada.");
        } else {
            System.out.println("Não ha folhas dispniveis, impossivel realizar impressão.");

        }
    }

    public void imprimir(String texto){
        if (temPapel()) {
            System.out.println(texto);
            this.folhasDisponiveis--;
        } else {
            System.out.println("Não ha folhas dispniveis, impossivel realizar impressão.");
        }
    }
}
