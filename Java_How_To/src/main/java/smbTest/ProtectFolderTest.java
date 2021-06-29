package smbTest;


import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileOutputStream;


public class ProtectFolderTest {
    private final String USER_NAME = "BeaST";
    private final String PASSWORD = "";
    private final String DOMAIN = "WORKGROUP";
    private final String NETWORK_FOLDER = "smb://DESKTOP-JNIB67H/ibcsettlement/";
final
    public static void main(String args[]) {
        boolean result = false;
        try {
            String fileContent = "Hi, This is the SmbFile.";
            result = new ProtectFolderTest().copyFiles(fileContent, "SmbFile1.txt");
        } catch (Exception e) {
            System.err.println("Exception caught. Cause: " + e.getMessage());
        }
        System.out.println(result);
    }

    public boolean copyFiles(String fileContent, String fileName) {
        boolean successful = false;
        String path = null;
        NtlmPasswordAuthentication auth = null;
        SmbFile sFile = null;
        SmbFileOutputStream sfos = null;
        try {
            auth = new NtlmPasswordAuthentication(
                    DOMAIN, USER_NAME, PASSWORD);
            path = NETWORK_FOLDER + fileName;
            sFile = new SmbFile(path, auth);
            sfos = new SmbFileOutputStream(sFile);
            sfos.write(fileContent.getBytes());
            successful = true;
            System.out.println("File successfully created.");
        } catch (Exception e) {
            successful = false;
            System.err.println("Unable to create file. Cause: "
                    + e.getMessage());
        }
        return successful;
    }
}