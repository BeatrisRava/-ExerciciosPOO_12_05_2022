package ex03;

public class Animal {
     String nome;
     int patas;


    //mensagem animal - construtor1 padrão
     public Animal(){
         System.out.println("Animal é..");
     }

     //nome do animal - construtor2
     public Animal(String nome){
        this.nome = nome;
    }

    //nome e quantidade de patas do animal - construtor3
    public Animal(String nome, int patas){
        this.nome = nome;
        this.patas = patas;

    }
}

