import com.meva.finance.leituraEescrita.file.ManipuladorArquivo;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Dell\\Desktop\\Teste";
        ManipuladorArquivo.escrito(path);
        ManipuladorArquivo.leitor(path);
    }
}
