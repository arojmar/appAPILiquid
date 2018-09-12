package utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class SignatureUtility {


    public static String generateSignature(String identifier, String saltUser) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        Date date = new Date();
        String Date = date.toString();

        String composeStringToSHA256 = Date+identifier+saltUser;

        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] signatureSHA256 = md.digest(composeStringToSHA256.getBytes("UTF-8"));

        return signatureSHA256.toString();

    }
}
