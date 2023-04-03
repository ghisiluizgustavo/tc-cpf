package me.ghisiluizgustavo.tccpf.controllers;

import lombok.extern.slf4j.Slf4j;
import me.ghisiluizgustavo.tccpf.controllers.interfaces.ICpfValidateController;
import me.ghisiluizgustavo.tccpf.response.CpfResponseValidation;
import me.ghisiluizgustavo.tccpf.service.CpfValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/validate-cpf")
@Slf4j
public class CpfValidateController implements ICpfValidateController {

    @Autowired
    private CpfValidateService cpfService;


    public CpfResponseValidation validateCpf(String cpf) {

        CpfResponseValidation cpfResponseValidation = cpfService.validateCpf(cpf);
        log.info("Retornando {}", cpfResponseValidation);
        return cpfResponseValidation;
    }
}
