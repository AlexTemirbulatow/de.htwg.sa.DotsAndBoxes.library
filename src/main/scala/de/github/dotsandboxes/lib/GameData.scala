package de.github.dotsandboxes.lib

case class FieldData(
  boardSize: BoardSize,
  playerSize: PlayerSize,
  playerType: PlayerType,
  computerDifficulty: ComputerDifficulty
)

case class GameBoardData(
  currentPlayer: Player,
  rowCells: Vector[Vector[Boolean]],
  colCells: Vector[Vector[Boolean]],
  statusCells: Vector[Vector[String]]
)

case class PlayerGameData(
  currentPlayer: Player,
  winner: String,
  stats: String,
  playerList: Vector[Player]
)

case class FieldSizeData(
  rowSize: Int,
  colSize: Int
)

case class PlayerStats(
  avgMoveDuration: Int,
  minMoveDuration: Int,
  maxMoveDuration: Int,
  longestMoveStreak: Int,
  numOfTotalMoves: Int
)

case class GameStats(
  totalDuration: Int,
  playerStats: Map[String, PlayerStats]
)
