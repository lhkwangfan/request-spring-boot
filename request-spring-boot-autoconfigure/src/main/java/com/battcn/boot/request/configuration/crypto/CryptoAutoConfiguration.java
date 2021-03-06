package com.battcn.boot.request.configuration.crypto;

import com.battcn.boot.request.configuration.crypto.advice.DecryptRequestBodyAdvice;
import com.battcn.boot.request.configuration.crypto.advice.EncryptResponseBodyAdvice;
import org.springframework.context.annotation.Import;

/**
 * @author Levin
 * @since 2018/12/28 0028
 */
@Import({DecryptRequestBodyAdvice.class, CryptoProperties.class, EncryptResponseBodyAdvice.class})
public class CryptoAutoConfiguration {


}
