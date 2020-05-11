package cn.bdqn.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 密码签名
 */
public final class MD5Util {

    /**
     * 文本签名的方法
     * @param text
     * @return
     */
    public static String encode(String text){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] result = md.digest(text.getBytes());//对文本进行签名
            StringBuilder sb = new StringBuilder();
            for (byte b : result) {
                int i = b & 0xff ; // 取字节的后八位有效值
                String s = Integer.toHexString(i);
                if (s.length() < 2) {
                    s = "0" + s;
                }
                sb.append(s);
            }
            // 加密的结果
            return sb.toString();
        }catch (Exception e){
            // 找不到该算法,一般不会进入这里
            throw new RuntimeException(e);
        }

    }
}
