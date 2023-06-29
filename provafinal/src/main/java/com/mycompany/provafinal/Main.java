/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.provafinal;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kauã C Dias
 */
public class Main {

    public static void main(String[] args) {
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "André Fernandes", "078.155.996-82", "21.258.326-77", new Endereco("Rua da Paixão", "7B", "Térreo", "40456-885", "Salvador", UnidadeFederativa.BAHIA), Setor.JURIDICO, Genero.MASCULINO, 1000, EstadoCivil.CASADO, LocalDate.of(1991, Month.MAY,9));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Maria Fernanda", "078.256.414-36", "23.414.875-93", new Endereco("Rua Minas Gerais", "1102", "Apt Broto - 11º andar", "40444-882", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.ENGENHARIA, Genero.FEMININO, 1000, EstadoCivil.SOLTEIRO, LocalDate.of(1996, Month.AUGUST, 11));
        Motoboy motoboy = new Motoboy("1A2B3C4D", "Lucas Henrique", "073.146.777-81", "25.416.798-33", new Endereco("Rua Lenine", "44", "Térreo", "40333-836", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, Genero.MASCULINO, 1000, EstadoCivil.CASADO, LocalDate.of(1997, Month.OCTOBER, 30));
        Engenheiro engenheiro = new Engenheiro("12.36663", "Angélica", "062.252.497-91", "73.493.147-33", new Endereco("Rua Javanesa", "133", "1º andar", "40888-331", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.FEMININO, 1000, EstadoCivil.VIUVO, LocalDate.of(1979, Month.JUNE, 2));
        
        System.out.println(diretor.toString());
        System.out.println("");
        System.out.println(gerente.toString());
        System.out.println("\n\n");
        diretor.demitir(motoboy);
    }
}
