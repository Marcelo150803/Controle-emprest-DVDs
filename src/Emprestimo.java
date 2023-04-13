import java.util.Date;

public class Emprestimo {

    private Date dataEmprestimo;
    private Date dataDevolver;

    public Emprestimo(Date dataEmprestimo, Date dataDevolver) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolver = dataDevolver;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolver() {
        return dataDevolver;
    }

    public void setDataDevolver(Date dataDevolver) {
        this.dataDevolver = dataDevolver;
    }
}
