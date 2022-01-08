import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<IElement> elements = new ArrayList<>();
        elements.add(new Estudante(1L, "Eduardo", "eduardo@email.com"));
        elements.add(new Estudante(2L, "duardo", "duardo@email.com"));
        elements.add(new Estudante(3L, "dudu", "dudu@email.com"));
        elements.add(new Estudante(4L, "Dudu Silva", "silva@email.com"));
        elements.add(new Professor(4L, "Prof Dudu Silva", 1000.00));
        elements.add(new Professor(4L, "Prof Dudu", 10000.00));
        elements.add(new Professor(4L, "Prof D. Silva", 100000.00));
        EnviarEmails(elements);
        Avaliar(elements);
    }

    public static void EnviarEmails(List<IElement> elements) {
        /**
         * cria o visitante
         */
        Email visitor = new Email();
        /**
         * Percorre a lista de elementos executando a sua regra
         */
        for (IElement element : elements) {
            element.Accept(visitor);
        }

    }

    public static void Avaliar(List<IElement> elements) {
        /**
         * cria o visitante
         */
        Avaliacao visitor = new Avaliacao();
        /**
         * Percorre a lista de elementos executando a sua regra
         */
        for (IElement element : elements) {
            element.Accept(visitor);
        }
    }

}
