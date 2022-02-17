----------------------------------------------------------------------------------------------------------
ADDING 1ST PLAYER
REQUEST: POST; URL : http://localhost:8080/api/games
BODY JSON 
{
   "name":"KK1"
}
-----------------------------------------------------------------------------------------------------------
ADDING 2ND PLAYER
REQUEST: POST; URL : http://localhost:8080/api/games/ba6cf184-71cf-47ee-b67f-86829a97f666/join
BODY JSON 
{
   "name":"KK2"
}
------------------------------------------------------------------------------------------------------------------
MOVES OF 1ST PLAYER
REQUEST: POST; URL : http://localhost:8080/api/games/ba6cf184-71cf-47ee-b67f-86829a97f666/move
BODY JSON 
{
    "name":"KK1",
    "move":"SCISSORS"
 }
 --------------------------------------------------------------------------------------------------------------------
 MOVES OF 1ST PLAYER
REQUEST: POST; URL : http://localhost:8080/api/games/ba6cf184-71cf-47ee-b67f-86829a97f666/move
BODY JSON 
{
    "name":"KK2",
    "move":"ROCK"
 }
 -----------------------------------------------------------------------------------------------------------------------
 RESULT
 REQUEST: GET; URL : http://localhost:8080/api/games/ba6cf184-71cf-47ee-b67f-86829a97f666
