package de.github.dotsandboxes.lib

case class FieldData(
  boardSize: BoardSize,
  playerSize: PlayerSize,
  playerType: PlayerType,
  computerDifficulty: ComputerDifficulty
)

case class GameBoardData(
  playerType: PlayerType,
  rowCells: Vector[Vector[Boolean]],
  colCells: Vector[Vector[Boolean]],
  statusCells: Vector[Vector[String]]
)

case class PlayerTurnData(
  currentPlayer: String,
  currentPoints: Int,
  playerList: Vector[Player]
)

case class PlayerResultData(
  winner: String,
  playerList: Vector[Player]
)

case class FieldSizeData(
  rowSize: Int,
  colSize: Int
)
