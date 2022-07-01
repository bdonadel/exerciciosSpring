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
        System.out.println("numero = " + centena + dezena + unidade);

        return numeroReferencia.getCentenas().get(centena) +
                numeroReferencia.getDezenas().get(dezena) +
                numeroReferencia.getUnidades().get(unidade);
    }
}
