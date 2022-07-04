package com.exercicio.numeros.controler;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Numero {
    @GetMapping("/{numero}")
    public String converteNumero(@PathVariable int numero) {
        NumerosRomanos numeroReferencia = new NumerosRomanos();
        int unidade = numero % 10;
        int dezena = ((numero - unidade) % 100) / 10;
        int centena = ((numero - dezena - unidade) % 1000) / 100;
        int milhar = ((numero - centena - dezena - unidade) % 10000) / 1000;
        System.out.println("numero = " + milhar + centena + dezena + unidade);

        return numeroReferencia.getUnidadesMilhar().get(milhar) +
                numeroReferencia.getCentenas().get(centena) +
                numeroReferencia.getDezenas().get(dezena) +
                numeroReferencia.getUnidades().get(unidade);
    }
}
