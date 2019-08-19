package edu.kapset.studyproject.utils.impl;

import edu.kapset.studyproject.utils.Reader;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class TextFileReader implements Reader <String> {

    private static Logger logger = Logger.getLogger(TextFileReader.class);

    private static TextFileReader instance;

    public static TextFileReader getInstance() {
        if (instance == null) {
            instance = new TextFileReader();
        }
        return instance;
    }

    private TextFileReader() {
    }

    @Override
    public Collection<Object> read(String source) {
        logger.info("\"read\" method called");
        final ArrayList<Object> list = new ArrayList<>();
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream(new File(source)))) {
            while (true) {
                Object o = objectInputStream.readObject();
                list.add(o);
            }
        } catch (EOFException e) {
            // empty - для остановки работы цикла по достижению конца файла
        } catch (IOException | ClassNotFoundException e) {
            logger.error("Error in method \"read\"", e);
        }
        return list;
    }
}
