package com.bvan.oop.lessons9_10.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ModelIo {

    public static void main(String[] args) {
        // 1. Create stream +
        // 2. Read one line +
        // 3. Parse line into model +
        // 4. Close stream

        String inFileName = "files/models.csv";
        String outFileName = "files/models-out.csv";

        String binFileName = "files/models.dat";
        try {
            readWriteWithFile(inFileName, outFileName);
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, format error: " + e.getMessage());
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static void deserialize(String binFileName) throws IOException {
        List<Model> models = ModelIOUtils.readModelsFromBinFile(binFileName);
        for (Model model : models) {
            System.out.println(model);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static void serialize(String inFileName, String binFileName) throws IOException {
        List<Model> models = ModelIOUtils.readModelsFromFile(inFileName);
        ModelIOUtils.writeModelsIntoBinFile(binFileName, models);
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static void readWriteWithFile(String inFileName, String outFileName) throws IOException {
        List<Model> models = ModelIOUtils.readModelsFromFile(inFileName);
        for (Model model : models) {
            System.out.println(model);
        }

        ModelIOUtils.writeModelsIntoFile(outFileName, models);
    }
}
