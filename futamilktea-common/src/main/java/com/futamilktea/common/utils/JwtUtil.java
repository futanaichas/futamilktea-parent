package com.futamilktea.common.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Date;

/**
 * @auther: wulusai
 * @PackageName: com.changgou.util
 * @ClassName: JWTUtil
 * @Description:
 * @date: 2019/8/22 10:51
 */
public class JwtUtil {
    /**
     * @Description //TODO 秘钥明文
     **/
    private static final String key="wulusai";
    /**
     * @Description //TODO 生成token
     * @Param [id, subject, livetime]
     * @return java.lang.String
     **/
    public static String getToken(String id,String subject,long livetime){
        long date = System.currentTimeMillis();
        String token = Jwts.builder()
                //唯一的ID
                .setId(id)
                //主题
                .setSubject(subject)
                //签发者
                .setIssuer("admin")
                //签发时间
                .setIssuedAt(new Date(date))
                //过期时间
                .setExpiration(new Date(date + livetime))
                //加密方式 通用秘钥
                .signWith(SignatureAlgorithm.HS256, generalKey1())
                .compact();

        return token;
    }
    /**
     * @Description //TODO 对通用key对称加密
     * @return javax.crypto.SecretKey
     **/
    private static SecretKey generalKey1(){
        byte[] bytes = Base64.getDecoder().decode(key);
        SecretKey key = new SecretKeySpec(bytes, 0, bytes.length, "AES");
        return key;
    }


}
