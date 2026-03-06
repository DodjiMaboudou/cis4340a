import java.io.DataInputStream;
import java.io.IOException;

public class Example {

    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }
}