fun main() {
    println("ВВедетие последовательность")
    val r = readln()
    var currentVal = r[0]
    var count = 1
    var itog = ""
    for (item in r.substring(1)) {
        if (currentVal == item) {
            count++
        } else {
            if (count == 1) {
                itog += currentVal
            } else {
                itog += "$currentVal$count"
            }
            count = 1
            currentVal = item
        }
    }
    if (count == 1) {
        itog += currentVal
    } else {
        itog += "$currentVal$count"
    }
    println(itog)

}
