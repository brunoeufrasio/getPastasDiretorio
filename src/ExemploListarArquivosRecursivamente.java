import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExemploListarArquivosRecursivamente {
    public List<File> listFiles (File directory) {
        List<File> files = new ArrayList<File>();
        listFiles (files, directory);
        return files;
    }
    
    private void listFiles (List<File> files, File directory) {
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                listFiles (files, file);
                files.add(file);
            } else {
               // files.add (file); se quiser o nome dos arquivos
            }
        }
    }

}
