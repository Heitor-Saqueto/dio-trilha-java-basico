/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 *
 * @author Heitor Saqueto
 */
public class ContaTerminal{

    public static void main(String[] args) {
       
     Scanner sc = new Scanner(System.in);
     Integer numero = sc.nextInt();
     String agencia = sc.next();
     String nomeCliente = sc.next();
     Double saldo = sc.nextDouble();

     System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    } 
}
