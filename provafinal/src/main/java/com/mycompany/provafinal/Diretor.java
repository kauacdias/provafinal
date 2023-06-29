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
public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    @Override
    public double getSalarioFinal() {
        return salario + salario*Bonificacao.DIRETOR.valor + salario*PREMIO;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCargo: diretor " + 
                "\nPrêmio: " + (PREMIO * 100) + "%" +
                "\nSalário final: " + Util.formatarDinheiro(getSalarioFinal());
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando o funcionário: \n" + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo o funcionário: \n" + funcionario.toString());
    }
    
    
}
