/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Marcelo
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadFiles {
	private static File file = new File("arquivo.txt");
	public static final String read(File file) throws IOException{
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String data = null;
                data = reader.readLine();
		while((reader.readLine()) != null){
                    System.out.println(data);
		}
		fileReader.close();
		reader.close();
                
                return data;
	}

}
