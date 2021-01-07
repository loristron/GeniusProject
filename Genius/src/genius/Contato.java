/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genius;

import java.util.Calendar;

/**
 *
 * @author Lorena
 */
public class Contato {

    private int id;
    private String primeiroNome;
    private String ultimoNome;
    private String endereco;
    private String localDeTrabalho;
    private String email;
    private Calendar dataNascimento;
    private String cargo;
    private LocalDeTrabalho empresa;

    public LocalDeTrabalho getEmpresa() {
        return empresa;
    }

    public void setEmpresa(LocalDeTrabalho empresa) {
        this.empresa = empresa;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(LocalDeTrabalho localDeTrabalho) {
        this.empresa = localDeTrabalho;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

}
