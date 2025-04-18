package de.github.dotsandboxes.lib

enum Status(StringRepresentation: String):
  override def toString = StringRepresentation
  case Empty extends Status("-")
  case Blue extends Status("B")
  case Red extends Status("R")
  case Green extends Status("G")
  case Yellow extends Status("Y")
