package com.ravinda.securitysso.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

@ConfigurationProperties("security")
public class SecurityProperties {

    private JwtProperties jwt;

    public JwtProperties getJwt() {
        return jwt;
    }

    public void setJwt(JwtProperties jwt) {
        this.jwt = jwt;
    }

    public static class JwtProperties {

        private Resource keyStore;
        private String keyStorePassword;
        private String keyPairAlias;
        private String keyPairPassword;
        private RsaKeys rsa;

        public Resource getKeyStore() {
            return keyStore;
        }

        public void setKeyStore(Resource keyStore) {
            this.keyStore = keyStore;
        }

        public String getKeyStorePassword() {
            return keyStorePassword;
        }

        public void setKeyStorePassword(String keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
        }

        public String getKeyPairAlias() {
            return keyPairAlias;
        }

        public void setKeyPairAlias(String keyPairAlias) {
            this.keyPairAlias = keyPairAlias;
        }

        public String getKeyPairPassword() {
            return keyPairPassword;
        }

        public void setKeyPairPassword(String keyPairPassword) {
            this.keyPairPassword = keyPairPassword;
        }

        public RsaKeys getRsa() {
            return rsa;
        }

        public void setRsa(RsaKeys rsa) {
            this.rsa = rsa;
        }
    }

    public static class RsaKeys {
        private String pvt;
        private String pub;

        public String getPvt() {
            return pvt;
        }

        public void setPvt(String pvt) {
            this.pvt = pvt;
        }

        public String getPub() {
            return pub;
        }

        public void setPub(String pub) {
            this.pub = pub;
        }
    }
}
