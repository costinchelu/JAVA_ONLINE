package smbTest;

import java.util.Properties;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileOutputStream;


public class ProtectFolderTest {
    private final String DOMAIN = "VERIFONE";
    private final String USER_NAME = "CostinC2";
    private final String PASSWORD = "CccAr0891..Qpmz";
    private String NETWORK_FOLDER = "ibcsettlements/";

    public static void main(String[] args) {
        try {
            String fileContent = "Hi, This is the SmbFile.";
            boolean result = new ProtectFolderTest().copyFiles(fileContent, "SmbFile1.txt");
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception caught. Cause: " + e.getMessage());
        }
    }

    public boolean copyFiles(String fileContent, String fileName) {
        boolean successful = false;
        String path = "C:\\ibcsettlements";
        NtlmPasswordAuthentication auth = null;
        SmbFile sFile = null;
        SmbFileOutputStream sfos = null;
        try {
            auth = new NtlmPasswordAuthentication(DOMAIN, USER_NAME, PASSWORD);
            path = "smb://127.0.0.1/" + NETWORK_FOLDER + fileName;
            sFile = new SmbFile(path, auth);
            sfos = new SmbFileOutputStream(sFile);
            sfos.write(fileContent.getBytes());

            System.out.println("File successfully created.");
            successful = true;
        } catch (Exception e) {
            successful = false;
            System.err.println("Unable to create file. Cause: " + e.getMessage());
        }
        return successful;
    }
}