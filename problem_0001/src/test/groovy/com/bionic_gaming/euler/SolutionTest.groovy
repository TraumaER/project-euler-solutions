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

    def "sumAllMultiples returns the correct sum"() {
        when:
        def response = Solution.sumAllMultiples()
        then:
        response == 23
    }
}
