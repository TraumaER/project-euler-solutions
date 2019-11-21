package com.bionic_gaming.euler

import groovy.transform.CompileStatic

@CompileStatic
class Solution {
    /**
     * Returns all the multiples of 3 and 5 below given maximum
     * @param max {@link Integer}
     * @return {@link List}
     */
    static List<Integer> getMultiples(Integer max) {
        List<Integer> resp = new ArrayList<>()

        for(def i = 1; i < max; i++) {
            if(i % 3 == 0 || i % 5 == 0)
                resp.add(i)
        }

        return resp
    }

    static Integer sumAllMultiples(Integer max) {
        return getMultiples(max)
                .stream()
                .reduce(0, {Integer a, Integer b -> a + b })
    }
}
