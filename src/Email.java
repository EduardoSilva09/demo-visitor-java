public class Email implements IVisitor {

    @Override
    public void Visit(Estudante estudante) {
        System.out.println("Email enviando a cópia do trabalho para o aluno " + estudante.getNome());
    }

    @Override
    public void Visit(Professor professor) {
        System.out.println("Email enviado ao professor " + professor.getNome() + " informando algo");
    }

}
