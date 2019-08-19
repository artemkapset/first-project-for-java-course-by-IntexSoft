package edu.kapset.studyproject.utils.impl;

import edu.kapset.studyproject.utils.Writer;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Collection;

public class TextFileWriter implements Writer<String> {

    private static Logger logger = Logger.getLogger(TextFileWriter.class);

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
        logger.info("\"write\" method called");
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(new File(source)))) {
            collection.forEach((t) -> {
                try {
                    objectOutputStream.writeObject(t);
                } catch (IOException e) {
                    logger.error("Error in method \"write\"", e);
                }
            });
        } catch (IOException e) {
            logger.error("Error in method \"write\"", e);
        }
    }
}
