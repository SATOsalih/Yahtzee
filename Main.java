package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static SingleLinkedList player1=new SingleLinkedList();					//creating player1 and player2 sll 
	static SingleLinkedList player2=new SingleLinkedList();
	
	static SingleLinkedList HighScoreTable=new SingleLinkedList();			//creating high score table sll
	static SingleLinkedList HighScoreTableScore=new SingleLinkedList();		//creating score sll for sorting
	
	static SingleLinkedList ones_Player1=new SingleLinkedList();			//creating ones,twos,...,sixes sll for player1
	static SingleLinkedList twos_Player1=new SingleLinkedList();			//I created it for keep the numbers coming out of the dice
	static SingleLinkedList threes_Player1=new SingleLinkedList();
	static SingleLinkedList fours_Player1=new SingleLinkedList();
	static SingleLinkedList fives_Player1=new SingleLinkedList();
	static SingleLinkedList sixes_Player1=new SingleLinkedList();

	static SingleLinkedList ones_Player2=new SingleLinkedList();			//creating ones,twos,...,sixes sll for player2
	static SingleLinkedList twos_Player2=new SingleLinkedList();
	static SingleLinkedList threes_Player2=new SingleLinkedList();
	static SingleLinkedList fours_Player2=new SingleLinkedList();
	static SingleLinkedList fives_Player2=new SingleLinkedList();
	static SingleLinkedList sixes_Player2=new SingleLinkedList();
	
	public static boolean flag1;		//for check_dices functions
	public static boolean flag2;		
	
	public static int score1;			//player1 score
	public static int score2;			//player2 score
	
	
	
	public static void addDiceToSLL_Player1(int Dice) {	//add the numbers coming from the dice in the sll with this method. for player1
		if(Dice==1) {
			ones_Player1.add(Dice);
		}
		else if(Dice==2) {
			twos_Player1.add(Dice);
		}
		else if(Dice==3) {
			threes_Player1.add(Dice);
		}
		else if(Dice==4) {
			fours_Player1.add(Dice);
		}
		else if(Dice==5) {
			fives_Player1.add(Dice);
		}
		else if(Dice==6) {
			sixes_Player1.add(Dice);
		}
	}
	public static void addDiceToSLL_Player2(int Dice) { //add the numbers coming from the dice in the sll with this method. for player2
		if(Dice==1) {
			ones_Player2.add(Dice);
		}
		else if(Dice==2) {
			twos_Player2.add(Dice);
		}
		else if(Dice==3) {
			threes_Player2.add(Dice);
		}
		else if(Dice==4) {
			fours_Player2.add(Dice);
		}
		else if(Dice==5) {
			fives_Player2.add(Dice);
		}
		else if(Dice==6) {
			sixes_Player2.add(Dice);
		}
	}
	
	public static void checkDices_Player1() {	//check method for player1
		
		flag1=false;
		
		//Large straight
		
		//if the number of elements of all sll is at least one
		if(ones_Player1.size()>=1 && twos_Player1.size()>=1 && threes_Player1.size()>=1		
				&& fours_Player1.size()>=1 && fives_Player1.size()>=1 && sixes_Player1.size()>=1) {
			
			
			int index=player1.getIndex(1);			//find position-index
			player1.removeNodeWithPosition(index);	//remove with using position from player1 sll
			ones_Player1.removeNodeWithPosition(0);	//remove from ones sll with using position
			
			index=player1.getIndex(2);				//for two
			player1.removeNodeWithPosition(index);
			twos_Player1.removeNodeWithPosition(0);
			
			index=player1.getIndex(3);				//for three
			player1.removeNodeWithPosition(index);
			threes_Player1.removeNodeWithPosition(0);
			
			index=player1.getIndex(4);				//for four
			player1.removeNodeWithPosition(index);
			fours_Player1.removeNodeWithPosition(0);
			
			index=player1.getIndex(5);				//for five
			player1.removeNodeWithPosition(index);
			fives_Player1.removeNodeWithPosition(0);
			
			index=player1.getIndex(6);				//for six
			player1.removeNodeWithPosition(index);
			sixes_Player1.removeNodeWithPosition(0);
			
			flag1=true;
			score1+=30;
		}
		
		//Yahtzee
		
		//if the number of elements of ones sll is at least four
		if(ones_Player1.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player1.getIndex(1);				//find position-index
			player1.removeNodeWithPosition(index);		//remove with using position from player1 sll
			ones_Player1.removeNodeWithPosition(0);		//remove from ones sll with using position
			}
			
			flag1=true;
			score1+=10;
		}
		//if the number of elements of twos sll is at least four
		if(twos_Player1.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player1.getIndex(2);				//find position-index
			player1.removeNodeWithPosition(index);		//remove with using position from player1 sll
			twos_Player1.removeNodeWithPosition(0);		//remove from twos sll with using position
			}
			
			flag1=true;	
			score1+=10;
		}
		//if the number of elements of threes sll is at least four
		if(threes_Player1.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player1.getIndex(3);				//find position-index
			player1.removeNodeWithPosition(index);		//remove with using position from player1 sll
			threes_Player1.removeNodeWithPosition(0);	//remove from threes sll with using position
			}
			
			flag1=true;
			score1+=10;
		}
		//if the number of elements of fours sll is at least four
		if(fours_Player1.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player1.getIndex(4);				//find position-index		
			player1.removeNodeWithPosition(index);		//remove with using position from player1 sll
			fours_Player1.removeNodeWithPosition(0);	//remove from fours sll with using position
			}
			
			flag1=true;
			score1+=10;
		}
		//if the number of elements of fives sll is at least four
		if(fives_Player1.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player1.getIndex(5);				//find position-index
			player1.removeNodeWithPosition(index);		//remove with using position from player1 sll
			fives_Player1.removeNodeWithPosition(0);	//remove from fives sll with using position
			}
			
			flag1=true;
			score1+=10;
		}
		//if the number of elements of sixes sll is at least four
		if(sixes_Player1.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player1.getIndex(6);				//find position-index
			player1.removeNodeWithPosition(index);		//remove with using position from player1 sll
			sixes_Player1.removeNodeWithPosition(0);	//remove from sixes sll with using position
			}
			
			flag1=true;
			score1+=10;
		}
		
		
	}
	
	public static void checkDices_Player2() {		//check method for player2
		
		flag2=false;	
	
		if(ones_Player2.size()>=1 && twos_Player2.size()>=1 && threes_Player2.size()>=1
				&& fours_Player2.size()>=1 && fives_Player2.size()>=1 && sixes_Player2.size()>=1) {
			
			int index=player2.getIndex(1);
			player2.removeNodeWithPosition(index);
			ones_Player2.removeNodeWithPosition(0);
			index=player2.getIndex(2);
			player2.removeNodeWithPosition(index);
			twos_Player2.removeNodeWithPosition(0);
			index=player2.getIndex(3);
			player2.removeNodeWithPosition(index);
			threes_Player2.removeNodeWithPosition(0);
			index=player2.getIndex(4);
			player2.removeNodeWithPosition(index);
			fours_Player2.removeNodeWithPosition(0);
			index=player2.getIndex(5);
			player2.removeNodeWithPosition(index);
			fives_Player2.removeNodeWithPosition(0);
			index=player2.getIndex(6);
			player2.removeNodeWithPosition(index);
			sixes_Player2.removeNodeWithPosition(0);
			
			flag2=true;
			score2+=30;
		}
		if(ones_Player2.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player2.getIndex(1);
			player2.removeNodeWithPosition(index);
			ones_Player2.removeNodeWithPosition(0);
			}
			
			flag2=true;
			score2+=10;
		}
		if(twos_Player2.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player2.getIndex(2);
			player2.removeNodeWithPosition(index);
			twos_Player2.removeNodeWithPosition(0);
			}
			
			flag2=true;
			score2+=10;
		}
		if(threes_Player2.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player2.getIndex(3);
			player2.removeNodeWithPosition(index);
			threes_Player2.removeNodeWithPosition(0);
			}
			
			flag2=true;
			score2+=10;
		}
		if(fours_Player2.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player2.getIndex(4);
			player2.removeNodeWithPosition(index);
			fours_Player2.removeNodeWithPosition(0);
			}
			
			flag2=true;
			score2+=10;
		}
		if(fives_Player2.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player2.getIndex(5);
			player2.removeNodeWithPosition(index);
			fives_Player2.removeNodeWithPosition(0);
			}
			
			flag2=true;
			score2+=10;
		}
		if(sixes_Player2.size()>=4) {
			for(int i=0;i<4;i++) {
			int index=player2.getIndex(6);
			player2.removeNodeWithPosition(index);
			sixes_Player2.removeNodeWithPosition(0);
			}
			
			flag2=true;
			score2+=10;
		}
		
	}

	public static void readFile() throws FileNotFoundException {		//read file
		
		File HighScoreTableFile = new File("HighScoreTable.txt");
		Scanner scanner = new Scanner(HighScoreTableFile);
		
		while(scanner.hasNextLine()) {
			
			//Using indexof and substring, their scores are add HighScoreTableScore sll with using addSorted() 
			String ScoreTableLine=scanner.nextLine();
			int index=ScoreTableLine.indexOf(' '); 
			
			String name=ScoreTableLine.substring(0,index);
			int score=Integer.parseInt(ScoreTableLine.substring(index+1));
			
			HighScoreTableScore.addSorted(score);
			int position=HighScoreTableScore.getIndex(score); //find score's position
			
			//add name+score with using addToPosition()
			HighScoreTable.addToPosition(position+1, name+" "+score);	
			
		    }
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		readFile();  //reading file
		
		for(int i=1;i<=10;i++) {		//10 turns
			
			System.out.println("Turn: "+i);
			System.out.println();
			
			for(int j=0;j<3;j++) {					//rolling three times dice for player1
				int Dice=(int)(Math.random()*6+1);
				player1.add(Dice);
				addDiceToSLL_Player1(Dice);	
			}
			
			System.out.print("Player1 score: "+score1);	//printing player1 score
			System.out.print("       Player1 : ");
			player1.display();							//printing player1 sll
			checkDices_Player1();						//checking dices for player1
			
			
			for(int k=0;k<3;k++) {						//rolling three times dice for player2
				int Dice=(int)(Math.random()*6+1);
				player2.add(Dice);
				addDiceToSLL_Player2(Dice);
			}
			
			System.out.println();
			System.out.print("Player2 score: "+score2);			//printing player2 score
			System.out.print("       Player2 : ");
			player2.display();							//printing player2 sll
			checkDices_Player2();						//checking dices for player2
			
			
			
			if(flag1==true || flag2==true) {			//If check returns true(flag=true) 
				System.out.println();
				System.out.println();
				System.out.print("Player1 score: "+score1);		//printing player1 score
				System.out.print("       Player1 : ");
				player1.display();								//printing player1 sll
				
				System.out.println();
				System.out.print("Player2 score: "+score2);		//printing player2 score
				System.out.print("       Player2 : ");
				player2.display();								//printing player2 sll
			}
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
		
		System.out.println("Game Over!!!");
		System.out.println();
		
		//Game over conditions
		if(score1>score2) {
			System.out.println("The winner is Player1");
			
			HighScoreTableScore.addSorted(score1);
			int position=HighScoreTableScore.getIndex(score1);		
			HighScoreTable.addToPosition(position+1, "Player1"+" "+score1);
		}
		else if(score1<score2) {
			System.out.println("The winner is Player2");
			
			HighScoreTableScore.addSorted(score2);
			int position=HighScoreTableScore.getIndex(score2);	
			HighScoreTable.addToPosition(position+1, "Player2"+" "+score2);
		}
		else {
			System.out.println("Tie");
			
			HighScoreTableScore.addSorted(score1);
			int position=HighScoreTableScore.getIndex(score1);
			HighScoreTable.addToPosition(position+1, "Player1"+" "+score1);
		}
		
		
		System.out.println();
		System.out.println("High Score Table");
		HighScoreTable.printHighScoreTable();		//printing high score table
		HighScoreTable.writeFile();					//writing file
	}

	
}
