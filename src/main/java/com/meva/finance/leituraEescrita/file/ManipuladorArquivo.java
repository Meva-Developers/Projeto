package com.meva.finance.leituraEescrita.file;

import java.io.*;
import java.util.Optional;
import java.util.Scanner;

public class ManipuladorArquivo {


    public static void leitor(String path) throws IOException{
        BufferedReader buffread = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true){
            if (linha !=null){
                System.out.println(linha);
            }else
                break;
            linha = buffread.readLine();
        }
        buffread.close();
    }
    public static void escrito(String path) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreve algo: ");
        linha = in.nextLine();
        bufferedWriter.append(linha + "\n");
        bufferedWriter.close();
    }
}
