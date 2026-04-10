package com.gla.abstaction;

interface Calculator {
    int cal(int a, int b);

    default int r(int c, int d) {
        return 0;
    }

}
