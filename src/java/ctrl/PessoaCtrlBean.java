
package ctrl;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Pessoa;

@ManagedBean
@SessionScoped
public class PessoaCtrlBean {
    
    private List<Pessoa> pessoas;
    public Pessoa pessoa;
    
    public PessoaCtrlBean(){
        startComp();
        pessoas = new ArrayList<Pessoa>();
    }

    private void startComp() {
        pessoa = new Pessoa();
    }
    
    public String insert(){
        pessoas.add(pessoa);
        startComp();
        return "/index.xhtml";
    }
    
    public void delete(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
