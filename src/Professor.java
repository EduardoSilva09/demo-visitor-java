public class Professor implements IElement {
    private Long id;
    private String nome;
    private Double vlrSal;
    private String Email;

    public Professor() {

    }

    public Professor(Long id, String nome, Double vlrSal) {
        this.setId(id);
        this.setNome(nome);
        this.setVlrSal(vlrSal);
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getVlrSal() {
        return vlrSal;
    }

    public void setVlrSal(Double vlrSal) {
        this.vlrSal = vlrSal;
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }

}
