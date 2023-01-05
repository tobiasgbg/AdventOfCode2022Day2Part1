import spock.lang.Specification

class Day4Specification extends Specification {
    def "containsOther"(String a, String b, boolean c) {
        expect:
        CampCleanup.containsOther(a, b) == c

        where:
        a     |  b     |  c
        "2-8" | "3-7"  | true
        "3-7" | "2-8"  | false
        "2-8" | "2-8"  | true
    }

    def "is intersecting"(String a, String b, boolean c) {
        expect:
        CampCleanup.isIntersecting(a, b) == c

        where:
        a     |  b     |  c
        "2-8" | "3-7"  | true
        "2-4" | "6-8"  | false
    }

    def "is intersecting full string"(String a, boolean b) {
        expect:
        CampCleanup.isIntersecting(a) == b

        where:
        a           |  b
        "2-4,6-8"   | false
        "2-3,4-5"   | false
        "5-7,7-9"   | false
        "2-8,3-7"   | true
        "6-6,4-6"   | true
        "2-6,4-8"   | false
    }
}
