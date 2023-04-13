package emprestdvd;

class Amigo {

    private long numTelefone;

    public long getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(long numTelefone) {
        this.numTelefone = numTelefone;
    }
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String endereco;

    public Amigo(long numTelefone, String email, String endereco) {
        this.numTelefone = numTelefone;
        this.email = email;
        this.endereco = endereco;
    }

}
