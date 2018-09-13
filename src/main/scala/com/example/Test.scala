//package com.example

//import kamon.Kamon
//import kamon.zipkin.ZipkinReporter

//object Test {
//  def main(args: Array[String]): Unit = {
//    println(Kamon.config().getString("kamon.zipkin.host"))
//    println(Kamon.config().getInt("kamon.zipkin.port"))
//    Kamon.addReporter(new ZipkinReporter())
//  }
//}
