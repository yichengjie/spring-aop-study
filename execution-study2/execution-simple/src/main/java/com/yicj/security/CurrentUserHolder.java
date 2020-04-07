package com.yicj.security;

public class CurrentUserHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>() ;

    public static String get(){
        return holder.get() == null ?"unknown":holder.get() ;
    }

    public static void set(String user){
        holder.set(user);
    }

}
