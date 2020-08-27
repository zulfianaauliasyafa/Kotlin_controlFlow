fun main() {
    loop@ for (i  in 1..50) {
        println("Outside Loop")

        for (j in 1..50) {
            println("Inside Loop")
            if ( j < 5) break@loop
        }
    }
}