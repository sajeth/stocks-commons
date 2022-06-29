package com.saji.stocks.auth;

public class AuthResponse {
    private String jti;
    private String sub;
    private String[] authorities;
    private long iat;
    private long exp;

    public AuthResponse(String jti, String sub, String[] authorities, long iat, long exp) {
        this.jti = jti;
        this.sub = sub;
        this.authorities = authorities;
        this.iat = iat;
        this.exp = exp;
    }

    public AuthResponse() {
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }

    public long getIat() {
        return iat;
    }

    public void setIat(long iat) {
        this.iat = iat;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }
}
