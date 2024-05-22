package com.MundoSenai.leads.Repository;

import com.MundoSenai.leads.Model.M_Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Lead extends JpaRepository<M_Lead, Long> {

}
