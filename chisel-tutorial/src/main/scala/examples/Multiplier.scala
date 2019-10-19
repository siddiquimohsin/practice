package examples
import chisel3._

class Multiplier extends Module {
    val io = IO(new Bundle {
            val a = Input(UInt(32.W))
            val b = Input(UInt(32.W))
            val r = Output(UInt(32.W))
    })

    io.r := io.a * io.b

}