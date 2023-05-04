> **Note**
> I'm no longer working on this project.
> This was a lesson on composition and enum classes.

# Rock-Paper-Scissors-Lizard-Spock Game

This is a fun and interactive implementation of the classic Rock-Paper-Scissors game, with the exciting twist of Lizard and Spock added to the mix! It's written in Java and comes with two game modes - a fixed round mode and a best-of mode

## Table of Contents

- [Class Structure](#class-structure)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [How to Play](#how-to-play)
- [Contributing](#contributing)
- [License](#license)

## Class Structure

- `Generator` is an enum that represents the available moves in the game.
- `Player` is a class that represents a player, with a name and the ability to choose a random move from `Generator`.
- `Game` is a class that represents a game between two players and can be played with either a fixed number of rounds or a best-of match

## Technologies Used

- Java 8

## Getting Started

To run the game, you'll need to clone the repository and run the `Main` class.

```
git clone https://github.com/pedroascenso/rps-lizard-spock.git
cd rps-lizard-spock/src
javac -cp . pt/pedroascenso/*.java
java -cp pt.pedroascenso.Main
```

## How to Play

Two players choose randomly their moves from a list of five: Rock, Paper, Scissors, Lizard, and Spock. The game has two modes: fixed round and best-of.

Here are the rules:

- Rock crushes Scissors
- Scissors cuts Paper
- Paper covers Rock
- Rock crushes Lizard
- Lizard poisons Spock
- Spock smashes Scissors
- Scissors decapitates Lizard
- Lizard eats Paper
- Paper disproves Spock
- Spock vaporizes Rock


## Contributing

Contributions to MyIRC are always welcome! If you find a bug or want to suggest an enhancement, please submit an issue. If you'd like to contribute code, please fork the repository and create a pull request.

## License

MyIRC is licensed under the MIT License. See [LICENSE](https://github.com/pedroascenso/my-irc/blob/main/LICENSE) for details.