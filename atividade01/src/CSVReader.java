

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CSVReader {
	public CSVReader(FileReader fileReader, char c) {
    }

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
