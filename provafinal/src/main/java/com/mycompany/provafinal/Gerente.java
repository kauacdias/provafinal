/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provafinal;

import java.time.LocalDate;

/**
 *
 * @Kauã C Dias
 */
public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }
    
    @Override
    public double getSalarioFinal() {
        return salario + salario*Bonificacao.GERENTE.valor;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nCargo: gerente " +
               "\nSalário final: " + Util.formatarDinheiro(getSalarioFinal());
    }
    
    
}
