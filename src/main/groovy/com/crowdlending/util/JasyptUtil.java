package com.crowdlending.util;

import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class JasyptUtil {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(JasyptUtil.class);

    public static byte[] encryptBytesArray(byte[] byteArray, String password, String algorithm, String providerName, Integer keyObtentionIterations) {
        StandardPBEByteEncryptor encryptor = new StandardPBEByteEncryptor();

        encryptor.setProviderName(providerName);
        encryptor.setAlgorithm(algorithm);
        encryptor.setPasswordCharArray(password.toCharArray());
        encryptor.setKeyObtentionIterations(keyObtentionIterations);

        byte[] encrypted = encryptor.encrypt(byteArray);

        return encrypted;
    }

    public static byte[] decryptBytesArray(byte[] byteArray, String password, String algorithm, String providerName, Integer keyObtentionIterations) {
        StandardPBEByteEncryptor encryptor = new StandardPBEByteEncryptor();

        encryptor.setProviderName(providerName);
        encryptor.setAlgorithm(algorithm);
        encryptor.setPasswordCharArray(password.toCharArray());
        encryptor.setKeyObtentionIterations(keyObtentionIterations);

        byte[] original = encryptor.decrypt(byteArray);

        return original;
    }

    public static String encrypt(String text, String password, String algorithm, String providerName, Integer keyObtentionIterations) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();

        encryptor.setProviderName(providerName);
        encryptor.setAlgorithm(algorithm);
        encryptor.setPasswordCharArray(password.toCharArray());
        encryptor.setKeyObtentionIterations(keyObtentionIterations);

        String encrypted = encryptor.encrypt(text);
        return encrypted;

    }

    public static String decrypt(String text, String password, String algorithm, String providerName, Integer keyObtentionIterations) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setProviderName(providerName);
        encryptor.setAlgorithm(algorithm);
        encryptor.setPasswordCharArray(password.toCharArray());
        encryptor.setKeyObtentionIterations(keyObtentionIterations);

        String decryptedText = encryptor.decrypt(text);

        return decryptedText;
    }

    //Encrypting using jasypt
    public static void encryptUsingJasypt(File inputFile, File outputFile, String password, String algorithm, String providerName, Integer keyObtentionIterations) throws IOException {

        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int) inputFile.length()];
        inputStream.read(inputBytes);

        //First compressing to byteArray and then encrypting it
        log.info("======= Compression starts");
        log.info("decompressed size =" + inputBytes.length);
        byte[] outputBytes = encryptBytesArray(compress(inputBytes), password, algorithm, providerName, keyObtentionIterations);
        log.info("compressed size =" + outputBytes.length);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);

        inputStream.close();
        outputStream.close();
    }

    //Decrypting using jasypt
    public static void decryptUsingJasypt(File inputFile, File outputFile, String password, String algorithm, String providerName, Integer keyObtentionIterations) throws IOException, DataFormatException {


        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int) inputFile.length()];
        inputStream.read(inputBytes);
        //First decoding to byteArray and then decompressing it
        log.info("===== Decompressing starts ......");
        byte[] outputBytes = decompress(decryptBytesArray(inputBytes, password, algorithm, providerName, keyObtentionIterations));
        log.info("======= Decompressed size = " + outputBytes.length);

        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);
    }

    //To compress a file
    public static byte[] compress(byte[] data) throws IOException {
        Deflater deflater = new Deflater();
        deflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        deflater.finish();
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer); // returns the generated code... index
            outputStream.write(buffer, 0, count);
        }
        outputStream.close();
        byte[] output = outputStream.toByteArray();
        log.info("Original: " + data.length / 1024 + " Kb");
        log.info("Compressed: " + output.length / 1024 + " Kb");
        return output;
    }

    //To decompress a file
    public static byte[] decompress(byte[] data) throws IOException, DataFormatException {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] buffer = new byte[1024];
        while (!inflater.finished()) {
            int count = inflater.inflate(buffer);
            outputStream.write(buffer, 0, count);
        }
        outputStream.close();
        byte[] output = outputStream.toByteArray();
        log.info("Compressed: " + data.length);
        log.info("Original: " + output.length);
        return output;
    }


}
