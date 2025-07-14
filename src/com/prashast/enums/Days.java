package com.prashast.enums;

public enum Days {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(5), SATURDAY(6);

    private final int daynumber;

    Days(int daynumber) {
        this.daynumber = daynumber;
    }

    public int getDaynumber() {
        return this.daynumber;
    }
}

