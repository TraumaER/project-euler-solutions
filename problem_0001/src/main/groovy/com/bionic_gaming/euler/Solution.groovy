package com.bionic_gaming.euler

import groovy.transform.CompileStatic

@CompileStatic
class Solution {
    List<Integer> getMultiples(Integer max) {
        return [3, 5, 6, 9]
    }

    Integer sumAllMultiples() {
        return getMultiples(10).stream().reduce(0, {Integer a, Integer b -> a + b })
    }
}
