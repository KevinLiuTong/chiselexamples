package chiselexamples

import chisel3._
import chisel3.util._

class MyModule extends RawModule{

  val io = IO(new Bundle{
    val in = Input(UInt(3.W))
    val out = Output(UInt(3.W))
  })

  io.out := io.in + 1.U
}
