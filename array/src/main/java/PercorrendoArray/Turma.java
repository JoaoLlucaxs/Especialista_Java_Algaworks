package PercorrendoArray;

public class Turma {

    String identificacao;
    String nomeProfessora;

    Aluno[] alunos;

    void imprimirAlunos(){
        for (Aluno aluno : alunos){
            if(aluno != null){
                System.out.printf(" %s (%d anos)%n" , aluno.nome , aluno.idade);
            }else{
                System.out.println("Há espaço sobrando");
            }
        }
    }
}
