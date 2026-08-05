public abstract class Pessoa {

    protected String nome;
    protected String email;
    protected String documento;

    public Pessoa(String nome, String email, String documento) {
        this.nome = nome;
        this.email = email;
        this.documento = documento;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getDocumento() { return documento; }

    public void setDocumento(String documento) { this.documento = documento; }

    public void dormindo() {
        System.out.printf("%s está dormindo.", nome);
    }

    public void dormindo(int h) {
        System.out.printf("%s está dormindo por %d horas", nome, h);
    }
}
