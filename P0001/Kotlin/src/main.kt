fun main() {
    val max = 1000
    val isMultiple: (Int) -> Boolean = { it % 3 == 0 || it % 5 == 0}
    print((0..max).filter { x -> isMultiple(x) }.sum())
}