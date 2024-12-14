package br.com.ravelino.controllers;

import br.com.ravelino.infrastructure.entities.Billing;
import br.com.ravelino.infrastructure.repositories.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/billing")
public class BillingRestController {

    @Autowired
    private BillingRepository contasRepository;

    @GetMapping(value = "/teste", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Billing>> teste() {
        var conta = new Billing();
        conta.setDescricao("Teste descricao");
        conta.setValor(new BigDecimal(20));
        conta.setSituacao("Situacao teste");
        conta.setDataPagamento(new Date());
        conta.setDataVencimento(new Date());


        contasRepository.save(conta);

        final var allBillings = contasRepository.findAll();

        return ResponseEntity.ok().body(allBillings);
    }

}
