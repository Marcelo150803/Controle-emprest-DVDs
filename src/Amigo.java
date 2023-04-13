
public class Amigo {

    private long numTelefone;
    private String email;
    private String endereco;

    public Amigo(long numTelefone, String email, String endereco) {
        this.numTelefone = numTelefone;
        this.email = email;
        this.endereco = endereco;
    }

    public long getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
