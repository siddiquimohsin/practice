package examples
import chisel3.iotesters.PeekPokeTester

class MultiplierTests(c: Multiplier) extends PeekPokeTester(c) {
    poke(c.io.a, 2)
    poke(c.io.b, 3)
    step(1)
    expect(c.io.r, 6)
}