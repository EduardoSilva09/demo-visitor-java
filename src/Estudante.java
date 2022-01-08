/**
 * O estudante é um elemento, ou seja, é a estrutura que terá o seu
 * comportamento definido em outra classe. Isso permite que a classe possa ser
 * extendida sem precisar alterar o que já existe
 */
public class Estudante implements IElement {
    private Long Id;
    private String Nome;
    private String Email;

    public Estudante(Long id, String nome, String email) {
        setId(id);
        setNome(nome);
        setEmail(email);
    }

    public Long getId() {
        return Id;
    }

    private void setId(Long id) {
        this.Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public Estudante() {

    }

    @Override
    public void Accept(IVisitor visitor) {
        /*
         * Indica que a classe que está sendo "visitada" é ela mesma
         * o que faz com que o ccomportamento que será executado, seja 
         * para uma instância da classe Estudante
         */
        visitor.Visit(this);
    }

}
