package datapath
import chisel3.iotesters.PeekPokeTester

class TopTests(c: Top) extends PeekPokeTester(c) {
    // poke(c.io.instruction_step, 0)
    // step(1)
    // poke(c.io.instruction_step, 4)
    // step(1)
    // poke(c.io.instruction_step, 8)
    // step(1)
    // poke(c.io.instruction_step, 12)
    // step(1)
    // poke(c.io.instruction_step, 16)
    // step(1)
    // step(1)
    step(1)
    step(1)
    step(1)
    step(1)
    step(1)
    step(1)
    step(1)
    step(1)
    step(1)
}