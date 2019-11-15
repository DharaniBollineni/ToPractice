package nz.ac.currency.convert;

public class dummy123 {
	import java.lang.Math;
	import java.util.Random;
	import java.util.Scanner;

	class DrunkWalker {
	    private char[][] walkgrid = new char[10][10];
	    private static int randNSEW;
	    private static int randNSEWS;
	    private int randomnum;
	    private int startrow;
	    private int startcol;
	    private char alpha = 'A';
	    private int nextrow;
	    private int nextcol;

	    public DrunkWalker(int r, int c) {
	        startrow = r;
	        startcol = c;
	        nextrow = startrow;
	        nextcol = startcol;

	        for (int i = 0; i < 10; i ++) { 
	//Fills walkgrid with periods.
	            for (int j = 0; j < 10; j++)
	                walkgrid[i][j] = '.';
	        }
	        walkgrid[r][c] = alpha++;
	    }

	    public static void getRand(){ 
	//Generates number between 0-3
	        int x100 = 0;
	        double randomNum = 0.0;
	        randomNum = Math.random();
	        x100 = (int) (randomNum * 100);
	        randNSEW = x100 % 4;
	    }

	    public static void getRandSecundus(){ 
	//Generates number between 0-2 for corrections
	        int x100 = 0;
	        double randomNum = 0.0;
	        randomNum = Math.random();
	        x100 = (int) (randomNum * 100);
	        randNSEWS = x100 % 3;
	    }

	    public int getNextRow(){
	        return nextrow;
	    }

	    public int getNextCol(){
	        return nextcol;
	    }

	    enum Mode {WALKING, CORRECTING};
	    Mode mode =  Mode.WALKING;

	    public boolean processing(){
	    for(int i = 1; i < 26; i ++){ //Goes until it hits Z

	        if (mode == Mode.WALKING) {
	            getRand(); //Retrieves random direction
	            if(randNSEW == 0){
	                nextcol--; //west
	            }
	            if(randNSEW == 1){
	                nextrow++; //south
	            }
	            if(randNSEW == 2){
	                nextcol++; //east
	            }
	            if(randNSEW == 3){
	                nextrow--; //north
	            }
	        }

	//if walker goes out of bounds they are arrested.
	        if(nextrow < 0 || nextrow >= 10 || nextcol < 0 || nextcol >= 10) {
	            return false;
	        }
	        if(randNSEW == 0 && walkgrid[nextrow][nextcol] != '.'){
	            //If walker headed west and lands somewhere it has already been
	            i--; //Sets the counter back so it won't go further than Z.
	            nextcol++; //Moves back in to place.
	            mode = Mode.CORRECTING;
	            getRandSecundus(); //Calls for secondary random number.
	            if(randNSEWS == 0){
	                nextrow++; //Check South.
	            }
	            if(randNSEWS == 1){
	                nextcol++; //Check East.
	            }
	            if(randNSEWS == 2){
	                nextrow--; //Check North.
	            }
	            continue;
	        }
	        if(randNSEW == 1 && walkgrid[nextrow][nextcol] != '.'){
	            //If walker headed south and lands somewhere it has already been
	            i--; //Sets the counter back so it won't go further than Z.
	            nextrow--; //Moves back in to place.
	            mode = Mode.CORRECTING;
	            getRandSecundus(); //Calls for secondary random number.
	            if(randNSEWS == 0){
	                nextcol--; //Check West
	            }
	            if(randNSEWS == 1){
	                nextcol++; //Check East
	            }
	            if(randNSEWS == 2){
	                nextrow--; //Check North
	            }
	            continue;
	        }
	        if(randNSEW == 2 && walkgrid[nextrow][nextcol] != '.'){
	            //If walker headed east and lands somewhere it has already been
	            i--; //Sets the counter back so it won't go further than Z.
	            nextcol--; //Moves back in to place.
	            mode = Mode.CORRECTING;
	            getRandSecundus(); //Calls for secondary random number.
	            if(randNSEWS == 0){
	                nextcol--; //Check West
	            }
	            if(randNSEWS == 1){
	                nextrow++; //Check South
	            }
	            if(randNSEWS == 2){
	                nextrow--; //Check North
	            }
	            continue;
	        }
	        if(randNSEW == 3 && walkgrid[nextrow][nextcol] != '.'){
	            //If walker headed north and lands somewhere it has already been
	            i--; //Sets the counter back so it won't go further than Z.
	            nextrow++; //Moves back in to place.
	            mode = Mode.CORRECTING;
	            getRandSecundus();
	            if(randNSEWS == 0){
	                nextcol--; //Check West
	            }
	            if(randNSEWS == 1){
	                nextrow++; //Check South
	            }
	            if(randNSEWS == 2){
	                nextcol++; //Check East
	            }
	            continue;
	        }

	        mode = Mode.WALKING;
	        walkgrid[nextrow][nextcol] = alpha++;
	    }
	    return true;
	}




	    public char[][] DisplayGrid() {
	    for(int y = 0; y < 10; y++) {
	        for(int x = 0; x < 10; x++) {
	            System.out.print(walkgrid[x][y] + " ");
	        }
	        System.out.println();
	    }
	    return walkgrid;
	}
	}

	public class WalkTester {

	    public static void main(String[] args) {
	        Scanner inpr = new Scanner(System.in);
	        Scanner inpc = new Scanner(System.in);
	        Scanner inpchoice = new Scanner(System.in);

	        int r = 0;
	        int c = 0;
	        char choice = 'y';

	        while(choice == 'y' || choice == 'Y') {
	            System.out.println("Please enter x coordinate between 1 and 10.");
	            r = inpr.nextInt();
	            r = r - 1;

	            System.out.println("Please enter y coordinate between 1 and 10");
	            c = inpr.nextInt();
	            c = c - 1;

	            if(r < 0 || r > 9 || c < 0 || c > 9){
	                System.out.println("Invalid Entry. Restart? y/n");
	                choice = inpchoice.next().charAt(0);
	                if(choice == 'y' || choice == 'Y'){
	                    continue;
	                }
	                else if(choice == 'n' || choice == 'N'){
	                    return;
	                }
	                else{
	                    System.out.println("Invalid Entry. Restart? y/n");
	                    choice = inpchoice.next().charAt(0);
	                }
	            }
	            DrunkWalker drunkwalker = new DrunkWalker(r, c);
	            boolean walkerSucceeded = drunkwalker.processing();
	            drunkwalker.DisplayGrid();
	            if(walkerSucceeded) {
	            System.out.println("You made it home");
	            } else {
	            System.out.println("You were arrested");
	            }

	            System.out.println("Restart? y/n");
	            choice = inpchoice.next().charAt(0);
	            if(choice == 'y' || choice == 'Y'){
	                continue;
	            }
	            else if(choice == 'n' || choice == 'N'){
	                return;
	            }
	            else{
	                System.out.println("Invalid Entry. Restart? y/n");
	                choice = inpchoice.next().charAt(0);
	            }
	        }
	    }
	}
	java arrays

}
