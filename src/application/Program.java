package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
		
		//Criar um arquivo ".txt" e gravar os dados da String neste. 
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good evening"};
		String path = "/Users/aureamontero/eclipse-workspace/file_buffered_writer/out.txt";
		
		// O parametro "true" indica que você nao quer recriar o arquivo, mas atualizar o arquivo existente. 
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); //quebra de linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
