package com.bionic_gaming.euler

import spock.lang.Specification
import spock.lang.Unroll

class SolutionTest extends Specification {
    Solution solution

    void setup() {
        solution = new Solution()
    }

    @Unroll
    def "getMultiples returns all multiples of 3 and 5 for #max"() {
        when:
        def response = solution.getMultiples(max)
        then:
        response == expected
        where:
        max | expected
        10  | [3, 5, 6, 9]
        5   | [3]
        20  | [3, 5, 6, 9, 10, 12, 15, 18]
    }

    def "sumAllMultiples returns the correct sum"() {
        when:
        def response = solution.sumAllMultiples()
        then:
        response == 23
    }
}
