package documentos;

public class Rg {
    private int numero;
    private String estado_emissor;
    private String orgao_emissor;
    private String data;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado_emissor() {
        return estado_emissor;
    }

    public Rg() {
    }

    public void setEstado_emissor(String estado_emissor) {
        this.estado_emissor = estado_emissor;
    }

    public String getOrgao_emissor() {
        return orgao_emissor;
    }

    public void setOrgao_emissor(String orgao_emissor) {
        this.orgao_emissor = orgao_emissor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Rg(int numero, String estado_emissor, String orgao_emissor, String data) {
        this.numero = numero;
        this.estado_emissor = estado_emissor;
        this.orgao_emissor = orgao_emissor;
        this.data = data;
    }


    @Override
    public String toString() {
        return "Rg{" +
                "numero_rg=" + numero +
                ", estado_emissor='" + estado_emissor + '\'' +
                ", orgao_emissor='" + orgao_emissor + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}


