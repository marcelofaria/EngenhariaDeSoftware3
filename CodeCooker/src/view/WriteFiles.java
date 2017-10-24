/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
	private static final String path = "arquivo.txt";
        File file = new File(path);
	//public static void main(String[] args) throws IOException {
        public void escrever(String nome) throws IOException{

		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(nome);

		writer.flush();
		//Fechando conexão e escrita do arquivo.
		writer.close();
		System.out.println("Arquivo gravado em: " + path);
	}
}
