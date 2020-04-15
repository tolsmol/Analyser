package uk.ac.cam.amw223.Analyser;

import java.nio.charset.MalformedInputException;

public class datum {

    String time;

    public datum(String[] day) throws MalformedInputException {
        try {
            time = day[0];
        } catch (IndexOutOfBoundsException e) {
            throw new MalformedInputException(0);
        }
    }
}
