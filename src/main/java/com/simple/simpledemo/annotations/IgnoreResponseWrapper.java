package com.simple.simpledemo.annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreResponseWrapper {
}
