package PercorrendoArray;

public class AlunosArrayPrincipal {
    public static void main(String[] args) {

        Turma turmab = new Turma();

        turmab.identificacao = "Maternal B";
        turmab.nomeProfessora = "Renata";
        turmab.alunos= new Aluno[3];

        // Adicionando aluno no indice 0 com o método 2
        turmab.alunos[0] = new Aluno();
        turmab.alunos[0].nome = "João";
        turmab.alunos[0].idade = 5;


        // método 1
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jesuita";
        aluno1.idade = 4;

        turmab.alunos[1]=aluno1;

        turmab.imprimirAlunos();
    }
}
