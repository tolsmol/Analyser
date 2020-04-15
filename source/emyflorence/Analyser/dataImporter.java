package emyflorence.Analyser;

import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class dataImporter {

    List<datum> data = new ArrayList<>();

    public dataImporter(Path ... paths) throws IOException {
        List<String> month;
        String[] day;
        for (Path p : paths) {
            month = Files.readAllLines(p);
            for (String d : month) {
                day = d.split(",");
                try {
                    data.add(new datum(day));
                } catch (MalformedInputException e) {
                    System.err.printf("Incorrect line length in file %s\n", p.toString());
                }
            }
        }
    }
}
