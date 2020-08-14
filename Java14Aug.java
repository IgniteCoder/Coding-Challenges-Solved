import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

 public static void main(String[] args)
 {
  //code to read values 
  Scanner ip  = new Scanner(System.in);
  Player[] ps = new Player[4];
  for(int i=0;i<ps.length;i++)
  {
      int playerId = ip.nextInt();
      ip.nextLine();
      String playerName = ip.nextLine();
      int score1 = ip.nextInt();
      int score2 = ip.nextInt();
      int score3= ip.nextInt();
      ps[i]= new Player(playerId,playerName,score1,score2,score3);

      


  }

  //code to call required method
int tHundreds = findTotalHundredsCount(ps); //total hundreds count
Player topPlayer = getTopPlayer(ps); 
  //code to display the result
  if(tHundreds>0)
  System.out.println(tHundreds);
  else
  System.out.println("No Hundreds Scored in Tournament");
  System.out.println(topPlayer.getPlayerId()+"#"+topPlayer.getPlayerName());
 }

 public static int findTotalHundredsCount(Player[] players)
  {
   //method logic
   int count=0;
   for(int i=0;i<players.length;i++)
   {
       
       if((players[i].getScore1())>99)
       {++count;}

       if((players[i].getScore2())>99)
       {++count;}

       if((players[i].getScore3())>99)
       {++count;}   
   }

   if(count>0)
   return count;
   else
   return 0;
  }

public static Player getTopPlayer(Player[] players)
  {
   //method logic
   int score=0;
   int temp=0;
   for(int i=0;i<players.length;i++)
   {
       score = players[i].getScore1()+players[i].getScore2()+players[i].getScore3();
       if(score>=temp)
       temp=score;
       
   }
   for(int i=0;i<players.length;i++)
   {
       score = players[i].getScore1()+players[i].getScore2()+players[i].getScore3();
       if(score==temp)
       return players[i];
   }  
   return players[0];

  }
}
    
class Player
{
    private int playerId,score1,score2,score3;
    private String playerName;
  //code to build the class
  Player(int playerId,String playerName,int score1,int score2,int score3)
  {
      this.playerId=playerId;
      this.playerName= playerName;
      this.score1=score1;
      this.score2=score2;
      this.score3=score3;
  }
    int getPlayerId()
  {
      return playerId;
  }
  String getPlayerName()
  {
      return playerName;
  }
  int getScore1()
  {
      return score1;
  }
  int getScore2()
  {
      return score2;
  }
  int getScore3()
  {
      return score3;
  }  
}
