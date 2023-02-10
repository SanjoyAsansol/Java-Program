package com.StringProgramme;

public class VowelOrConsonentGeneric {
	
	static void vowel_or_consonent(char x)
	{
		if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'
				||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
				{
					System.out.println("Vowel");
				}
				else
				{
					System.out.println("Consonent");
				}
	}

	public static void main(String[] args) {
		
		vowel_or_consonent('a');
	}

}
