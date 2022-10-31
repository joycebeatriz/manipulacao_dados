// Faça um programa para ler a sigla do estado, pesquisa-lo no arquivo UF.csv, e retornar o nome do estado. e a região (1-Norte, 2-Nordeste, 3-Sudeste, 4-Sul, 5-Centro Oeste).

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collection;

public class arquivo {

	public static void main(String[] args) { // ler arquivo CSV 
		String fileName = "UF.csv";
		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
			List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
			values.forEach(value -> System.out.println(value));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
