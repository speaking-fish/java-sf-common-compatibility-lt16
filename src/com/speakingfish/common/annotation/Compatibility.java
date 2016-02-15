package com.speakingfish.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public interface Compatibility {
 
//    @Target(ElementType.METHOD)
//    @Retention(RetentionPolicy.SOURCE)
//    public @interface Override {
//    }
    
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
    public @interface SafeVarargs {}

    public static class Dummy {
        public static void dummy() {}
    }
    
}
