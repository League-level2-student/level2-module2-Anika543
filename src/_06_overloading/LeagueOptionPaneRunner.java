package _06_overloading;

import java.awt.Color;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
	
		LeagueOptionPane.showMessageDialog("The league is the best"); 
		LeagueOptionPane.showMessageDialog("The League is the Best", "Message 2");
		LeagueOptionPane.showMessageDialog("The League is the Best", "Message 3", "leagueDark.png"); 
		LeagueOptionPane.showMessageDialog("The League is the best 4" , "Message 4", "leagueDark.png", Color.BLUE);
	}
}
