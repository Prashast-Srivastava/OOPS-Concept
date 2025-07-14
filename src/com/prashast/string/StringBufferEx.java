
package com.prashast.string;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Radha");
//        System.out.println(sb.capacity());
        sb.append(" Krishna");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
    }
}
