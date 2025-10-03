public class Aluno{
    String nome;
    Double nota1;
    Double nota2;

    //public Aluno (String nome, double nota1, double nota2){
        //this.nome = nome;
        //this.nota1 = nota1;
        //this.nota2 = nota2;
    //}
    
    public double calculaMedia(){
        double soma = nota1 + nota2;
        return soma / 2;
    }
    public void exibeInfo(){
        System.out.printf("%s",nome);
        System.out.printf("|%.1f", nota1);
        System.out.printf("|%.1f\n", nota2);
    }

}