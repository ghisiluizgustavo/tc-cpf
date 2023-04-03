package me.ghisiluizgustavo.tccpf.controllers.interfaces;

import me.ghisiluizgustavo.tccpf.response.CpfResponseValidation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ICpfValidateController {

    @GetMapping("/{cpf}")
    CpfResponseValidation validateCpf(@PathVariable String cpf);
}
