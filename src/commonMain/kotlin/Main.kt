suspend fun main() {
    // Don't throw exceptions
    exampleFun(null)
    exampleFun()
    exampleSuspendFun(null)

    // Throws an exception
    exampleSuspendFun()
}
