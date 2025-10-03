public class TesteAluno {
    public static void main(String[] args){
        //Aluno umAluno = new Aluno("Roger, 4.2, 8.4");
        //umAluno.exibeInfo();

        Aluno a = new Aluno();
        a.nome = "Gabriel";
        a.nota1 = 6.5;
        a.nota2 = 9.0;
        a.exibeInfo();
        double mediaA = a.calculaMedia();
        System.out.printf("Média: %.1f\n", mediaA);

        Aluno a2 = new Aluno();
        a2.nome = "Henrique";
        a2.nota1 = 8.4;
        a2.nota2 = 6.8;
        a2.exibeInfo();
        double mediaA2 = a2.calculaMedia();
        System.out.printf("Média: %.1f\n", mediaA2);

    }
}
