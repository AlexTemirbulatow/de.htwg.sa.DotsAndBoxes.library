package de.github.dotsandboxes.lib

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class GameDataSpec extends AnyWordSpec {
  "Game Data" should {
    "have the correct FieldData values" in {
      val fieldData = FieldData(BoardSize.Large, PlayerSize.Four, PlayerType.Computer, ComputerDifficulty.Easy)
      fieldData.boardSize shouldBe BoardSize.Large
      fieldData.playerSize shouldBe PlayerSize.Four
      fieldData.playerType shouldBe PlayerType.Computer
      fieldData.computerDifficulty shouldBe ComputerDifficulty.Easy
    }
    "have the correct GameBoardData values" in {
      val gameBoardData = GameBoardData(
        Player("Blue", 1, Status.Blue, PlayerType.Human),
        Vector(Vector(true, true, false), Vector(false, false, false)),
        Vector(Vector(true, true), Vector(false, true)),
        Vector.empty
      )
      gameBoardData.currentPlayer shouldBe Player("Blue", 1, Status.Blue, PlayerType.Human)
      gameBoardData.rowCells shouldBe Vector(Vector(true, true, false), Vector(false, false, false))
      gameBoardData.colCells shouldBe Vector(Vector(true, true), Vector(false, true))
      gameBoardData.statusCells shouldBe Vector()
    }
    "have the correct PlayerGameData value" in {
      val playerGameData = PlayerGameData(
        Player("Red", 0, Status.Red, PlayerType.Computer),
        "Player Blue wins!",
        "Player Blue [points: 5]\n" +
        "Player Red [points: 0]",
        Vector(
          Player("Blue", 5, Status.Blue, PlayerType.Computer),
          Player("Red", 0, Status.Red, PlayerType.Computer)
        )
      )
      playerGameData.currentPlayer shouldBe Player("Red", 0, Status.Red, PlayerType.Computer)
      playerGameData.winner shouldBe "Player Blue wins!"
      playerGameData.stats shouldBe "Player Blue [points: 5]\nPlayer Red [points: 0]"
      playerGameData.playerList shouldBe Vector(
        Player("Blue", 5, Status.Blue, PlayerType.Computer),
        Player("Red", 0, Status.Red, PlayerType.Computer)
      )
    }
    "have the correct FieldSizeData" in {
      val fieldSizeData = FieldSizeData(5, 6)
      fieldSizeData.rowSize shouldBe 5
      fieldSizeData.colSize shouldBe 6
    }
  }
}
