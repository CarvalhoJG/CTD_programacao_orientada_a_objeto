package aula06;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AdotarCachorro {

    private boolean apto;
    private String raca;
    private int anoNascimento;
    private Double peso;
    private boolean chip;
    private boolean ferido;
    private String nome;

    public AdotarCachorro(String raca, int anoNascimento, Double peso, String nome) {
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.nome = nome;
    }

    public AdotarCachorro(String raca, int anoNascimento, Double peso, boolean chip, boolean ferido, String nome) {
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarAdocao(){

        int idade = LocalDateTime.now().getYear() - this.anoNascimento;
        //Calendar cal = new GregorianCalendar();
        //int year = cal.get(Calendar.YEAR);
        //anoNascimento = year-anoNascimento;

        if(this.chip == true){
            System.out.println("Cão com nome de " +this.nome+ ", possue chip e tem " +idade+ " de idade. ");
        } else{
            System.out.println("Cão com nome de " +this.nome+ ", não possue chip e tem " +idade+ " de idade. ");
        }
    }

    public void ecaminharAdocao(){
        if(peso > 5 && ferido != false){
            System.out.println("Sua raça é " +this.raca+ " pesa mais de 5KG e não esta ferido, tornando-se assim apto para adoção.");
        }else{
            System.out.println("Animal não esta apto para adoção.");
        }
    }

}

