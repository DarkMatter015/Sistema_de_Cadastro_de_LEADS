package com.MundoSenai.leads.Controller;

import com.MundoSenai.leads.Model.M_Resposta;
import com.MundoSenai.leads.Service.S_Cadastro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Cadastro {

    @PostMapping("/cad_lead")
    @ResponseBody
    public M_Resposta cadastrarLead(@RequestParam("nome") String nome,
                                    @RequestParam("data_nascimento") String data_nascimento,
                                    @RequestParam(value = "telefone", required = false) String telefone,
                                    @RequestParam(value = "email", required = false) String email){
        return S_Cadastro.cadastrarLead(nome, data_nascimento, telefone, email);
    }
}
