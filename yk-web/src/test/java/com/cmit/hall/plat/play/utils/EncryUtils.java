package com.cmit.hall.plat.play.utils;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

/** 
 * 数据加密 DES方式 + Base64
 * @author sun_flower
 *
 */
public class EncryUtils {
    public static final String KEY = "aEpCIKFVdPEBJ1pM5pLSviM2Nrj5C/A4iAw8ou+jiJpnrXigolapdcJXfmh2tECyuQnaFrvZHabcdefghijklmnabcdefghijklmnabcdefghijklmnabcdefghijklmn";

    /**
     * 测试
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    	//调用generateSecret转换key
        Key convertSecretKey = generateSecret(KEY);
        String data = "{\"code\":\"100\",\"roleId\":[],\"userDesc\":\"测试\",\"sessionId\":\"90EA80C89F6187BAB363C9347F759E39\",\"roleList\":[],\"userName\":\"chenpeng\",\"checkCode\":\"\",\"token\":\"\",\"password\":\"eFEBcXRwTW2oMFSDwGwUKQ==\",\"createTime\":\"2019-05-27 15:30:14\",\"levelId\":\"1\",\"staffName\":\"\",\"id\":1502,\"userType\":\"1\",\"oldPwd\":\"\"}";
        //String data ="zxc.......";
        //调用加密方法：给秘钥和数据
        String enStr = encodeString(convertSecretKey, data);
        //调用解密方法:给秘钥和加密的值
        decodeString(convertSecretKey, enStr);
    }
    /**
     * 转换key
     * @param key
     * @return
     * @throws GeneralSecurityException
     */
    public static Key generateSecret(String key) throws GeneralSecurityException {
    	//根据key得到它的字节数组
        byte[] bytesKey = key.getBytes();
        //实例化DES Key秘钥的相关内容
        DESKeySpec desKeySpec = new DESKeySpec(bytesKey);
     	//实例一个秘钥工厂，指定加密方式
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        Key convertSecretKey = factory.generateSecret(desKeySpec);
        return convertSecretKey;
    }
    /**
     * 加密
     * @param convertSecretKey
     * @param date
     * @return
     * @throws GeneralSecurityException
     */
    public static String encodeString(Key convertSecretKey, String data) throws GeneralSecurityException {
    	//通过Cipher这个类进行加解密相关操作
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, convertSecretKey);
        byte[] enData = Base64.getEncoder().encode(data.getBytes());
        byte[] result = cipher.doFinal(enData);//输入要加密的内容
        System.out.println("加密的结果：" + Hex.encodeHexString(result));
        return Hex.encodeHexString(result);
        
    }
    
    /**
     * 解密
     * @param convertSecretKey
     * @param date
     * @return
     * @throws GeneralSecurityException
     * @throws DecoderException 
     */
    public static String decodeString(Key convertSecretKey, String data) throws GeneralSecurityException, DecoderException {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");//通过Cipher这个类进行加解密相关操作
        cipher.init(Cipher.DECRYPT_MODE, convertSecretKey);
        byte[] hdata = Hex.decodeHex(data.toCharArray());
        byte[] result = cipher.doFinal(hdata);
        byte[] decode = Base64.getDecoder().decode(result);
        System.out.println("解密结果：" + new String(decode));
        return new String(decode);
    }
    
    
    
    
}