package net.scalax

import java.nio.file.Paths

object CodegenAction {
  def main(arr: Array[String]): Unit = {
    val pathImpl = Paths.get("").toAbsolutePath
    val pathRoot = os.Path(pathImpl) / "induction" / "src" / "main" / "scala" / "net" / "scalax" / "simple" / "induction"
    os.write.over(target = pathRoot / "Induction.scala", data = net.scalax.txt.Induction(22).body, createFolders = true)
  }
}
