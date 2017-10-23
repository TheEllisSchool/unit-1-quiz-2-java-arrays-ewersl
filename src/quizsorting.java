import javax.swing.JOptionPane;

public class quizsorting {
	public static void main (String [] args) {
				int [] cards = {49, 81, 13, 3, 21, 90, 30, 56, 8, 4 };
		
				int sorted = cards.length;
				
				int max= cards [0]; 
				while (sorted > 0) { 
				
		//find the highest number
					
					int maxIndex = 0;
					for (int i = 0; i < sorted; i ++) {
						if (cards [i] > max) {
							max = cards [i];
							maxIndex = i; 
						
							
						}
					}
				
					
					// move it to the end and swamp
					int hold = cards[sorted - 1];
					cards[sorted - 1] = max;
					cards[maxIndex] = hold;
		
					//updated sorted variable 
					sorted--; 
				}
				//print my array
				
					
				int range = 0;
				range = cards [maxIndex] - cards [0];
				JOptionPane.showMessageDialog (null, range);
				for (int index = 0; index < cards. length; index++) { 
					System.out.println((cards[index]));
					
				
				}
			}
		


}
