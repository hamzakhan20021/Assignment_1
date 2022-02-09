package mru.game.model;

public class Player {
	
	/**
	 * This class represent each player record in the Database
	 * It is basically a model class for each record in the txt file
	 */

		private String name; // The song's title
		private int balance; // The song's artist
		private int numOfWins;


		public Player(String name, int balance, int numOfWins) {
			this.name = name;
			this.balance = balance;
			this.numOfWins = numOfWins;
		}
		
		
		public String getName() {
			return name;
			}

		public int getBalance() {
			return balance;
			}
		
		public int getNumOfWins() {
		return numOfWins;	
		}

		public void setName(String n) {
			name = n;
			}

		public void setBalance(int b) {
			this.balance = b;
			}
		
		public void setNumOfWins(int now) {
			this.numOfWins = now;
			}
		
		public String toString() {
			return name + "," + balance + "," + numOfWins;
		
		}
		public int fix() {
			return balance;
		
		}
	}





