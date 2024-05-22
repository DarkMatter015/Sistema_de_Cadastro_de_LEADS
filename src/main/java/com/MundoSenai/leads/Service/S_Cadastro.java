package com.MundoSenai.leads.Service;

import com.MundoSenai.leads.Model.M_Lead;
import com.MundoSenai.leads.Model.M_Resposta;
import com.MundoSenai.leads.Repository.R_Lead;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class S_Cadastro {

    private static R_Lead rLead;

    public S_Cadastro(R_Lead rLead){
        this.rLead = rLead;
    }

    public static M_Resposta cadastrarLead(String nome, String data_nascimento, String telefone, String email){
        boolean podeSalvar = true;
        String mensagem = "";
        boolean sucesso = false;

        if(nome.trim().equals("")){
            podeSalvar = false;
            mensagem += "O nome precisa ser preenchido!\n";
        }

        if(data_nascimento.trim().equals("")){
            podeSalvar = false;
            mensagem += "A data de nascimento precisa ser preenchida!\n";
        }

        if(telefone.trim().equals("") && email.trim().equals("")){
            podeSalvar = false;
            mensagem += "O telefone ou o email precisa ser preenchido!\n";
        }

        if(podeSalvar){
            M_Lead mCadastro = new M_Lead();

            try{
                mCadastro.setNome(nome.trim());
                mCadastro.setData_nascimento(LocalDate.parse(data_nascimento));
                mCadastro.setTelefone(telefone.trim());
                mCadastro.setEmail(email.trim());

                rLead.save(mCadastro);
                sucesso = true;
                mensagem += "Pessoa cadstrada com sucesso!";
            }catch (Exception e){
                mensagem += e.getMessage();
            }
        }

        return new M_Resposta(sucesso, mensagem);
    }

}
