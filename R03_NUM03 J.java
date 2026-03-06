import java.io.DataInputStream;
import java.io.IOException;

public class Example {

    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bit values
    }

}