package com.exercicio.numeros.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CodigoMorse {
    @GetMapping("/morse/{codigo}")
    public String decodificarMorse(@PathVariable String codigo) {
        //--- .-.. .-
        //-- . .-. -.-. .- -.. ---   .-.. .. ...- .-. .
        String texto = "";
        codigo.replace("   ", "@");
        List<String> morse = Arrays.asList(codigo.split(" "));
        for (String s : morse) {
            switch (s) {
                case ".-":
                    texto += "A";
                    break;
                case "-...":
                    texto += "B";
                    break;
                case "-.-.":
                    texto += "C";
                    break;
                case "-..":
                    texto += "D";
                    break;
                case ".":
                    texto += "E";
                    break;
                case "..-.":
                    texto += "F";
                    break;
                case "--.":
                    texto += "G";
                    break;
                case "....":
                    texto += "H";
                    break;
                case "..":
                    texto += "I";
                    break;
                case ".---":
                    texto += "J";
                    break;
                case "-.-":
                    texto += "K";
                    break;
                case ".-..":
                    texto += "L";
                    break;
                case "--":
                    texto += "M";
                    break;
                case "-.":
                    texto += "N";
                    break;
                case "---":
                    texto += "O";
                    break;
                case ".--.":
                    texto += "P";
                    break;
                case "--.-":
                    texto += "Q";
                    break;
                case ".-.":
                    texto += "R";
                    break;
                case "...":
                    texto += "S";
                    break;
                case "-":
                    texto += "T";
                    break;
                case "..-":
                    texto += "U";
                    break;
                case "...-":
                    texto += "V";
                    break;
                case ".--":
                    texto += "W";
                    break;
                case "-..-":
                    texto += "X";
                    break;
                case "-.--":
                    texto += "Y";
                    break;
                case "--..":
                    texto += "Z";
                    break;
                case ".----":
                    texto += "1";
                    break;
                case "..---":
                    texto += "2";
                    break;
                case "...--":
                    texto += "3";
                    break;
                case "....-":
                    texto += "4";
                    break;
                case ".....":
                    texto += "5";
                    break;
                case "-....":
                    texto += "6";
                    break;
                case "--...":
                    texto += "7";
                    break;
                case "---..":
                    texto += "8";
                    break;
                case "----.":
                    texto += "9";
                    break;
                case "-----":
                    texto += "0";
                    break;
                case "..--..":
                    texto += "?";
                case "-.-.--":
                    texto += "!";
                    break;
                case ".-.-.-":
                    texto += ".";
                    break;
                case "--..--":
                    texto += ",";
                    break;
                default:
                    texto += " ";
                    break;
            }
        }

        return texto;
    }
}
