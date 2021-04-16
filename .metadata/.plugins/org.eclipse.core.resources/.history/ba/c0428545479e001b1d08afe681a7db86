package com.home.test.map;

import java.util.List;

public class Adobee {

	public static void main(String[] args) {

		//Write down the signature of a Java/C# method that will take in a word 
		//and return a bunch of words that are synonyms of the input word. 
		//The implementation of the method is irrelevant. *
		
		//
		//Elaborate on the choices you made when selecting the type for the return value. 
		//Specifically, what benefits does choosing this type over another give you? *
	
		//List<String> computeSynonym (String word) 
		
		//computeSynonym (String word) 
		
		//Implement a method / function that takes any integer n as input and returns a boolean, whose value is true, if and only if n is a power of 2. 
		
		boolean result = isPowerOfTwo(16);
		System.out.println(result);
		
		boolean res = isPowerOfTwo1(37);
		System.out.println(res);
/******************************************************************************************
CREATE TABLE GeographicDemo  
		(
		    Level hierarchyid NOT NULL,  
		    Location nvarchar(30) NOT NULL,  
		    LocationType nvarchar(9) NULL
		);
		
INSERT GeographicDemo VALUES 
	('/', 'Earth', 'Planet'),    
	('/1/', 'North America', 'Continent'),  
	('/2/', 'South America', 'Continent'),  
	('/1/1/', 'USA', 'Country'),  
	('/1/2/', 'Mexico', 'Country'), 
	('/1/1/1/', 'Texas', 'State'),  
	('/1/1/2/', 'Virginia', 'State'),
	('/1/1/2/1/', 'Fairfax', 'City'),
	('/1/2/1/', 'Baja California', 'State'),
	('/1/2/1/1/', 'Tijuana','City');

		
		SELECT CAST(Level AS nvarchar(100)) AS [Converted Level], *   
	    FROM GeographicDemo ORDER BY Level;
		
		
		Converted Level  Level     Location         LocationType  
		/1/              0x58      Europe           Continent  
		/1/1/            0x5AC0    France           Country  
		/1/1/1/          0x5AD6    Paris            City  
		/1/2/            0x5B40    Spain            Country  
		/1/2/1/          0x5B56    Madrid           City  
		/2/              0x68      South America    Continent  
		/2/1/            0x6AC0    Brazil           Country  
		/2/1/1/          0x6AD6    Brasilia         City  
		/2/1/2/          0x6ADA    Bahia            State  
		/2/1/2/1/        0x6ADAB0  Salvador         City  
		/3/              0x78      Antarctica       Continent  
		/3/1/            0x7AC0    McMurdo Station  City

***********************************************************************************/
	}
	
	public static boolean isPowerOfTwo1(int n) {
		for(long i=1; i <=n ; i *=2) {
			System.out.println(i);
			if(i == n) {
				return true;
			}
		}	
		return false;	
	}

	public static  boolean isPowerOfTwo(int n) {
		long i = 1;
		while( i < n) {
			i *= 2;
		}
		return i == n;
	}


}
