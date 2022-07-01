# CardsWithPower

Create a program that generates a deck of cards (class Card) that have power. The power of a card is calculated by adding the power of its rank plus the power of its suit.

Rank powers are as follows: (ACE - 14, TWO - 2, THREE - 3, FOUR - 4, FIVE - 5, SIX - 6, SEVEN - 7, EIGHT - 8, NINE - 9, TEN - 10, JACK - 11, QUEEN - 12, KING - 13

Suit powers are as follows: (CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39).

You will get a command consisting of two lines. On the first line, you will receive the Rank of the card and on the second line, you will get the suit of the card.
Print the output in the format:

"Card name: {card name} of {suit name}; Card power: {power of rank + power of suit}".

Examples
---------
Input |	Output
------|--------
TWO |
CLUBS |	Card name: TWO of CLUBS; Card power: 2
ACE |
SPADES |	Card name: ACE of SPADES; Card power: 53

