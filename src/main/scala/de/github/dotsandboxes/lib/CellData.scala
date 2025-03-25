package de.github.dotsandboxes.lib

case class CellData(
  rowCells: Vector[Vector[Boolean]],
  colCells: Vector[Vector[Boolean]],
  statusCells: Vector[Vector[String]]
)
