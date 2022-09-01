package per.cyz.snippet

object testNpm {
  def main(args: Array[String]): Unit = {
    scala.sys.process.Process(List("yarn")).!
  }
}
