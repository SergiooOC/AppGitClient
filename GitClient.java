public class GitClient{
        
    private String cliente;
    private String version;
    private String sistemOper;
    private String licencia;

    public GitClient(){
    }

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public String getSistemOper(){
        return sistemOper;
    }

    public void setSistemOper(String sistemOper){
        this.sistemOper = sistemOper;
    }

    public String getLicencia(){
        return licencia;
    }

    public void setLicencia(String licencia){
        this.licencia = licencia;
    }   

    @Override
    public String toString(){
        return "GitClient{"+"cliente="+cliente+",version="+version+",sistemOper="+sistemOper+",licencia="+licencia+'}';
    }
        
}
