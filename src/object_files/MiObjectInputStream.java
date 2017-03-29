/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_files;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author DM3-1-04
 */
public class MiObjectInputStream extends ObjectInputStream {

    public MiObjectInputStream(ObjectInputStream out) throws IOException {
        super(out);
    }

    protected MiObjectInputStream() throws IOException, SecurityException {
        super();
    }

    public MiObjectInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    protected void readStreamHeader() throws IOException {
    }
}
