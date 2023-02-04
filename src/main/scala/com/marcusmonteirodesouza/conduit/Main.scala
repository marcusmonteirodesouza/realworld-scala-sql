package com.marcusmonteirodesouza.conduit

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp.Simple:
  val run: IO[Nothing] = ConduitServer.run[IO]
