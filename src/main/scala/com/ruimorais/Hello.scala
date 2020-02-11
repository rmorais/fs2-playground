package example

import cats.effect.IOApp
import cats.effect.IO
import cats.effect.ExitCode
import cats.syntax.functor._

object Hello extends IOApp {

  val stream = fs2.Stream.eval(IO(println("hello")))

  def run(args: List[String]): IO[ExitCode] =
    stream.compile.drain.as(ExitCode.Success)
}
