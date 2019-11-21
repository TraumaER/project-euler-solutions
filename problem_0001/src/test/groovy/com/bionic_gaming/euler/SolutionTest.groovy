package com.bionic_gaming.euler

import spock.lang.Specification
import spock.lang.Unroll

class SolutionTest extends Specification {
    @Unroll
    def "getMultiples returns all multiples of 3 and 5 for #max"() {
        when:
        def response = Solution.getMultiples(max)
        then:
        response == expected
        where:
        max | expected
        10  | [3, 5, 6, 9]
        5   | [3]
        20  | [3, 5, 6, 9, 10, 12, 15, 18]
        21  | [3, 5, 6, 9, 10, 12, 15, 18, 20]

    }

    @Unroll
    def "sumAllMultiples returns the correct sum for #max"() {
        when:
        def response = Solution.sumAllMultiples(max)
        then:
        response == expected
        where:
        max | expected
        10  | 23
        5   | 3
        20  | 78
        21  | 98
    }

    def "sumAllMutliples for 1000"() {
        when:
        println Solution.sumAllMultiples(1000)
        then:
        true
    }
}
