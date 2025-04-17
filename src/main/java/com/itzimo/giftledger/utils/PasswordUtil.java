package com.itzimo.giftledger.utils;

import org.mindrot.jbcrypt.BCrypt;

/**
 * 密码散在器
 *
 * @author zimo
 * @date 2025/04/17
 */
public class PasswordUtil {
    public static String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

    public static boolean checkPassword(String plainTextPassword, String hashedPassword) {
        return BCrypt.checkpw(plainTextPassword, hashedPassword);
    }
}
   