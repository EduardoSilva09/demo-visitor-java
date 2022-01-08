public class Avaliacao implements IVisitor {

    @Override
    public void Visit(Estudante estudante) {
        System.out.println("Aluno enviando a avaliação do professor em relação a matéria.");
    }

    @Override
    public void Visit(Professor professor) {
        System.out.println("Professor avaliando o desempenho do aluno.");
    }

}
