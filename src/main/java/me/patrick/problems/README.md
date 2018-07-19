# Overview
Some details and information for each problem set and hopefully it helps to provide better understanding when studying the code. 

> **Disclaimer**: The information provided below might be vague and confusing sometimes, there's nothing I can help here.
What provided is based on the best I can remember and of course most of the time, what was given initially from the test was really confusing too.   

# Cambridge Effect
This problem set is surrounding the [findings from a researcher at Cambridge University](https://www.mrc-cbu.cam.ac.uk/people/matt.davis/cmabridge/)

## Rules & Guides
When a correct sentence is called S and a sentence with misspellings that bear the same meaning S’, **calculate the recognition score** when S and S’ are given according to the Cambridge Effect.
(S and S’ consist of capital letters only, and words are separated by a space). The below is the rule of calculating recognition score comparing 2 sentences.

- If a pair of words has exactly same spelling order, 2 points.
- If a pair of words has the first and last letters at the same place, 1 point. 
- If a pair of words fails to meet all above 2 conditions, 0 point.

## Sample Input & Output
### Input 1
- YOU LOOK SO BEAUTIFUL TODAY 
- YOU LOKO SO BEUAITFUL TOADY 
- **Output:** 6

### Input 2
- KEY IS A DEVICE USED TO OPEN A LOCK SUCH AS IN A DOOR
- KEY IS A DIEVCE USED TO OEPN A LOCK SUCH AS IN A DOOR
- **Output:** 17

## To Begin

N (the number of words in a sentence) and 2 sentences will be given.

# Capturing Stones
This problem set is surrounding the board game idea using white and black stones.

## Rules & Guides
You must **find out the number of white stones required** to capture black stones.
The board is square-shaped. N is the number of cells in each side. 

Black stone(s) are captured by the white stones, if all black stone(s) are surrounded from 4 directions either by the white stones or the edge(s) of the board. 

For e.g.:
1. **A black** stone located at one of the corner of the board, it required **2 white** stones to capture it.
2. **A black** stone located at one of the four edges of the board, it required **3 white** stones to capture it.
3. **A black** stone located anywhere within the board (not edge, not corner), it required **4 white** stones to capture it.
4. **Two black** stones located anywhere within the board (not edge, not corner), it required **6 white** stones to capture it.

## Sample Input & Output
### Input 1
- N = 8
- 00000000
  00000000
  00000000
  00011000
  00011100
  00011100
  00000000
  00000000
- **Output:** 11

### Input 1
- N = 12
- 000000011111
  000000001111 
  000000000100 
  000000000100 
  000000000000 
  000000000000 
  000000000000 
  000000000000 
  000000000000 
  000000000000 
  000000000000 
  000000000000
- **Output:** 8

## To Begin
N (the number board grids / cells) and a block of 0 & 1 (to construct the board with black stones) will be given.

### Assumptions:
1. Each set of test data / input will only consists of one group (1 or more) of black stones. 
2. Multiple separate group will never be presented in one same input.
3. From the test data / input, black stones will never be placed diagonally (although it's possible in real game).
4. From the test data / input, one group (more than 1) of black stones will always be grouped together without empty slot in the middle.

# Depth Of The Lake
This problem set is surrounding the calculation of depth / weightage of an area.

## Rules
The plot of area to be calculated is a Lake. An area will be tabulated as a grid with multiple cells in it.
Each cell is either labelled with **W** (Water, the lake) or **G** (Anything other than the lake, like the ground). 
**Find out the sum of all cells’ depth** in the lake.

- For any **water** cell which shares its at least one side with the shore, the depth of the cell is 1. 
- For the cells except explained above, the depth of the cell is equivalent with the total number of **water** cells including the cell itself and the cells in its 4 diagonal directions.
- The outer sides of the grid are all ground (land) area.

## Sample Input & Output
### Input 1
- N = 3
- GWG
  WWW
  GWG
- **Output:** 5

### Input 2
- N = 5
- WWWWW
  WWWWW
  WWWWW
  WWWWW 
  WWWWW
- **Output:** 61
  
## To Begin
N (the size of the grid) and a block of W & G (to construct the area with lake and land) will be given.