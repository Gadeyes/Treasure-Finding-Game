Treasure Hunt (Java, Console)

A simple grid-based treasure hunting game written in Java. You move a player around a 2D board to find three hidden treasures. The project is beginner-friendly and practices OOP, basic algorithms, and console I/O.

This README describes the ORIGINAL, VALUE-BASED SCORING: your final score is the sum of the values of the three treasures you collect. The number of moves does not affect the score.

FEATURES

* Three treasures hidden on a rectangular grid (no diagonal movement).
* Console-based UI that runs anywhere with a JDK.
* Value-based scoring: each treasure has a random value; your score is their total.
* Small, focused classes and simple utilities (search/sort) to keep code clear.

HOW IT WORKS

* The board is a width × height grid. The player starts at (0,0).
* On each turn you enter a move to step up / down / left / right (no diagonals).
* When you land on a treasure’s cell, it’s collected and removed from the board.
* The game ends after you collect all three treasures, and your score is printed.

CONTROLS

* n: move north
* s: move south
* w: move west
* e: move east


BUILD AND RUN

1. javac \*.java
2. the main entry point is MyConsole:  java MyConsole


CONFIGURATION

* Grid size: width, height.
* Starting position: player’s initial (x, y).
* Number of treasures: three.
* Movement model: 4-directional (no diagonals).
* Random seed: optional for deterministic runs during testing.

SCORING DETAILS (ORIGINAL VALUE-BASED LOGIC)

* Each treasure is assigned a random integer value from 1 to 100 when placed.
* When the player steps onto a treasure’s location, that treasure’s value is added to the total score.
* Final score = value(treasure1) + value(treasure2) + value(treasure3).
* The number of moves does not affect the score in this mode.

Example (conceptual):

* Treasure values: 27, 84, 59
* Final score: 27 + 84 + 59 = 170




