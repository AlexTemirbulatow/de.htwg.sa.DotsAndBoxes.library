package de.github.dotsandboxes.lib

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class CellDataSpec extends AnyWordSpec {
  "Cell Data" should {
    val cellData = CellData(
      Vector(
        Vector(true, true, false),
        Vector(false, true, false)
      ),
      Vector(
        Vector(false, true, true),
        Vector(true, false, true)
      ),
      Vector(
        Vector(Status.Empty, Status.Blue),
        Vector(Status.Red, Status.Green),
        Vector(Status.Empty, Status.Yellow)
      ),
    )
    "have row cells" in {
      cellData.rowCells.size shouldBe 2
      cellData.rowCells(0).size shouldBe 3
      cellData.rowCells(0)(0) shouldBe true
      cellData.rowCells(1)(2) shouldBe false
    }
    "have col cells" in {
      cellData.colCells.size shouldBe 2
      cellData.colCells(0).size shouldBe 3
      cellData.colCells(0)(0) shouldBe false
      cellData.colCells(1)(2) shouldBe true
    }
    "have status cells" in {
      cellData.statusCells.size shouldBe 3
      cellData.statusCells(0).size shouldBe 2
      cellData.statusCells(0)(0) shouldBe Status.Empty
      cellData.statusCells(1)(0) shouldBe Status.Red
      cellData.statusCells(2)(1) shouldBe Status.Yellow
    }
  }
}