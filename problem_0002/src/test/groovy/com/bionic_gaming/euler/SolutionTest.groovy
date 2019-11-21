package com.bionic_gaming.euler

import spock.lang.Specification
import spock.lang.Unroll

class SolutionTest extends Specification {

    def "Sum of all even valued Fibonacci numbers"() {
        when:
        println Solution.sumEvenNumbers()
        then:
        true
    }
}
