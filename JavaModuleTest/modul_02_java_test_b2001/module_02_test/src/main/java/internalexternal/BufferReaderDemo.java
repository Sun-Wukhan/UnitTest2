package internalexternal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/navid/Documents/JavaModuleTest/modul_02_java_test_b2001/module_02_test/src/main/resources/Key-To-Success");
        BufferedReader br = new BufferedReader(fr);

        int i;

        while((i=br.read()) != -1) {
            System.out.print((char)i);
        }
        br.close();
        fr.close();

    }
}
