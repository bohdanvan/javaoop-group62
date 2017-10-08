package com.bvan.oop.lessons9_10.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ModelIOUtils {

    private ModelIOUtils() {}

    // Text Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<Model> readModelsFromFile(String fileName) throws IOException {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {

            return readModels(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static List<Model> readModels(BufferedReader reader) throws IOException {
        List<Model> models = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Model model = parseModel(line);
            models.add(model);
        }
        return models;
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static Model readModelFromFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return readModel(reader);
        } finally {
            closeReader(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Model readModel(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseModel(line);
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IllegalFormatException
     */
    private static Model parseModel(String s) {
        String[] tokens = s.split(",");
        if (tokens.length < 3) {
            throw new IllegalFormatException("should be 3 tokens: " + s);
        }

        String name = tokens[0];
        String phone = tokens[1];
        int age = Integer.parseInt(tokens[2]);

        return new Model(name, phone, age);
    }

    // Text Output

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static void writeModelsIntoFile(String fileName, List<Model> models) throws IOException {
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(fileName))) {

            for (Model model : models) {
                String s = csvFormat(model, "|");
                writer.write(s + "\n");
            }
        }
    }

    /**
     * BAD CODE
     *
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static void writeModelsIntoFileWithPrintWriter(String fileName, List<Model> models) throws IOException {
        try (PrintWriter writer =
                     new PrintWriter(new File(fileName))) {

            for (Model model : models) {
                String s = csvFormat(model, "|");
                writer.println(s);
            }
        }
    }

    private static String csvFormat(Model model, String delimiter) {
        return model.getName() + delimiter + model.getPhone() + delimiter + model.getAge();
    }

    // Bin Output

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static void writeModelsIntoBinFile(String fileName, List<Model> models) throws IOException {
        try (ObjectOutputStream objectOutput =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            objectOutput.writeObject(models);
        }
    }

    // Bin Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<Model> readModelsFromBinFile(String fileName) throws IOException {
        // try-with-resources
        try (ObjectInputStream objectInput =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            return (List<Model>) objectInput.readObject();
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IllegalFormatException(e);
        }
    }
}
