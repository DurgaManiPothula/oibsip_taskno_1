import javax.swing.JOptionPane;
public class guess {
	public static void main(String[] args)
	{
		
		int min=1, max=100;
		String val = JOptionPane.showInputDialog("Enter your  name");
		 String name = val;
		 JOptionPane.showInternalMessageDialog(null, "Correct guess in attempt1-100 & attempt2 -50" ," Rules",JOptionPane.INFORMATION_MESSAGE);
		int j=0;
		int score=0;
		String rounds = JOptionPane.showInputDialog("How many rounds do you want to play?");
		 int r = Integer.parseInt(rounds);
		 JOptionPane.showInternalMessageDialog(null, "You have selected number of rounds = "+ r  ," Rounds",JOptionPane.INFORMATION_MESSAGE);
		while(j<r)
		{
		int flag=0;
		int random= (int)(Math.random()*(max-min+1)+min);
		System.out.println(random);
		 int i=0;
		 int a ;
		 
		 while(i<2){
		 val =JOptionPane.showInputDialog("Enter your guessed number");
		  a =Integer.parseInt(val); 
		 if(a==random) {
			 JOptionPane.showInternalMessageDialog(null, "Matched the generated number" ," Guess",JOptionPane.INFORMATION_MESSAGE);
			 flag=1;
			 break;
		 }
		 else if (random>a)
			 JOptionPane.showInternalMessageDialog(null, "Less than the generated number" ," Guess",JOptionPane.INFORMATION_MESSAGE);
		 else
			 JOptionPane.showInternalMessageDialog(null,  "Greater than the generated number"," Guess",JOptionPane.INFORMATION_MESSAGE);
		 
		 i++;
			 
		 }
		 if(flag==1)
		 {
			 String msg = " Congratulations ..You guessed correctly";
			 JOptionPane.showInternalMessageDialog(null,msg ," Result",JOptionPane.INFORMATION_MESSAGE);
			
			 if(i==0)
				 score+=100;
			 else if (i==1)
				 score+=50;
			 
		 }
		 if(flag==0)
		 {
			 String msg = " your max attempts are reached..Better luck in next round";
			 
			 JOptionPane.showInternalMessageDialog(null,  msg," Result",JOptionPane.INFORMATION_MESSAGE);
		 }
		 j++;
		}
		
		 String mesg = name +" you have earned "+ score+ " points" ;
		
		 JOptionPane.showInternalMessageDialog(null,  mesg," Score",JOptionPane.INFORMATION_MESSAGE);
	}
}
