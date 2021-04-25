import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class main {
	public static void main(String[] args) {
		 String diretorioRaiz = "D:\\backup\\OneDrive\\Área de Trabalho\\img captcha";
		 ExemploListarArquivosRecursivamente e = new ExemploListarArquivosRecursivamente();
	        List<File> files = e.listFiles(new File (diretorioRaiz));
	        for (File f : files) {
	            System.out.println (f.getAbsolutePath());
	        }

	}

}
