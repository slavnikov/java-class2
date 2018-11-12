
import com.strobel.decompiler.Decompiler;
import com.strobel.decompiler.DecompilerSettings;
import com.strobel.decompiler.PlainTextOutput;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slavnikov
 */
public class Decompilertest {
    public static void main(String[] args) {
        final DecompilerSettings settings = DecompilerSettings.javaDefaults();

    try (final FileOutputStream stream = new FileOutputStream("decompilationTest.txt");
         final OutputStreamWriter writer = new OutputStreamWriter(stream)) {

        Decompiler.decompile(
            "com/skayl/face/ts/TSInterface",
            new PlainTextOutput(writer),
            settings
        );
    }
    catch (final IOException e) {
        // handle error
    }
    }
}
