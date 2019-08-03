package edu.kapset.studyproject.utils.impl;

import edu.kapset.studyproject.utils.Writer;

import java.io.*;
import java.util.Collection;

public class TextFileWriter implements Writer<String> {

    public static TextFileWriter instance;

    public static TextFileWriter getInstance() {
        if (instance == null) {
            instance = new TextFileWriter();
        }
        return instance;
    }

    private TextFileWriter() {
    }

    @Override
    public void write(String source, Collection<?> collection) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(new File(source)))) {
            collection.forEach((t) -> {
                try {
                    objectOutputStream.writeObject(t);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
