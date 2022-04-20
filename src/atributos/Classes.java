package atributos;


public class Classes {

    //atributos
    protected String pessoa;
    protected long telefone;
    protected double nota;
    protected String datavar;
    protected String datadenasc;

    //getters & setters
    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDatavar() {
        return datavar;
    }

    public void setDatavar(String datavar) {
        this.datavar = datavar;
    }

    public String getDatadenasc() {
        return datadenasc;
    }

    public void setDatadenasc(String datadenasc) {
        this.datadenasc = datadenasc;
    }
}
