package sort.controller;

import java.util.ArrayList;




import sort.model.Sort;
import sort.model.SortingMachine;
import sort.model.Weapon;


public class SortController
{

	private int [] integers;
	private String [] rpsWins;
	private double [] reals;
	private String [] words;
	private Weapon[] myWeapon;
	
	private ArrayList<Integer> intArrayList;
	private long startTime;
	private long endTime;
	private long sortTime;
	private SortingMachine baseController;
	
	
	
	public SortController()
	{
		baseController = new SortingMachine();
		
		intArrayList = new ArrayList<Integer>();
	}
	
	public void start()
	{
		
//		/**
//		 * fills the different array that we want to sort (size of int array, randomization of int array)
//		 */
//		// 1: size of int array, 2: from 0 to XXXX of randomization in the int array, 3: size of double array
//		// 4: size of the word array, 5: size of the weapons array 
//		// 6: size of the Rock Paper Scissors victory chart array (currently unused)
//		fillTheArrays(5000, 2000, 100, 1000, 10000, 1000);
//		
//		/**
//		 * prints the numbers inside the number array
//		 */
//		System.out.println(baseController.displayTheArray(integers));
//		/**
//		 * sorts the integer array
//		 */
//		startTime = System.currentTimeMillis();
//		baseController.quickSort(integers, 0, integers.length-1);
//		/**
//		 * prints the newly sorted array
//		 */
//		System.out.println(baseController.displayTheArray(integers));
//		endTime= System.currentTimeMillis();
//		sortTime = endTime-startTime;
//		System.out.println("quicksort");
//		System.out.println(baseController.sortingTime(sortTime));
//		/**
//		 * tells the time it took to sort the array
//		 */
		fillTheArrays(100, 100, 100, 100, 100, 100);
		
//		fillIntArraysWithSame();
//		
//		System.out.println(baseController.displayTheArray(integers));
//		System.out.println(baseController.displayTheArray(intArrayList));
//		baseController.selectionSort(integers);
//		baseController.selectionSort(intArrayList);
//		
//		fillIntArraysWithSame();
//		
//		System.out.println(baseController.displayTheArray(integers));
//		System.out.println(baseController.displayTheArray(intArrayList));
//		startTime = System.currentTimeMillis();
//		baseController.quickSort(integers,0,integers.length-1);
//		endTime= System.currentTimeMillis();
//		sortTime = endTime-startTime;
//		System.out.println("int array");
//		System.out.println(baseController.sortingTime(sortTime));
//		
//		startTime = System.currentTimeMillis();
//		baseController.quickSort(intArrayList,0,intArrayList.size()-1);
//		endTime= System.currentTimeMillis();
//		sortTime = endTime-startTime;
//		System.out.println("int array list");
//		System.out.println(baseController.sortingTime(sortTime));
		
//		System.out.println(baseController.displayTheArray(integers));
//		System.out.println(baseController.displayTheArray(intArrayList));
//		
//		/**
//		 * prints the numbers inside the number array
//		 */
//		System.out.println(baseController.displayTheArray(integers));
//		/**
//		 * sorts the integer array
//		 */
//		startTime = System.currentTimeMillis();
//		baseController.quickSort(integers, 0, integers.length-1);
//		/**
//		 * prints the newly sorted array
//		 */
//		System.out.println(baseController.displayTheArray(integers));
//		endTime= System.currentTimeMillis();
//		sortTime = endTime-startTime;
//		System.out.println("select sort");
//		System.out.println(baseController.sortingTime(sortTime));
//		
//		System.out.println(baseController.displayTheWeaponArray(myWeapon));
//		/**
//		 * sorts the integer array
//		 */
//		startTime = System.currentTimeMillis();
//		baseController.quickSort(myWeapon, 0, myWeapon.length-1);
//		/**
//		 * prints the newly sorted array
//		 */
//		System.out.println(baseController.displayTheWeaponArray(myWeapon));
//		endTime= System.currentTimeMillis();
//		sortTime = endTime-startTime;
//		System.out.println("quicksort");
//		System.out.println(baseController.sortingTime(sortTime));
		
//		
//		System.out.println(baseController.displayTheWeaponArray(myWeapon));
//		baseController.selectionSort(myWeapon);
//		System.out.println(baseController.displayTheWeaponArray(myWeapon));
//		System.out.println(baseController.displayTheWordArray(words));
//		baseController.selectionSort(words);
//		System.out.println(baseController.displayTheWordArray(words));
//
//		System.out.println(baseController.displayTheDoubleArray(reals));
//		baseController.selectionSort(reals);
//		System.out.println(baseController.displayTheDoubleArray(reals));
	}

	private void fillIntArraysWithSame()
	{

		
		startTime = System.currentTimeMillis();
//		String displayInt = "";
		integers = new int [10000];
		int randomAdded = 0;
		for(int start = 0 ; start < integers.length; start++)
		{
			randomAdded = (int) (Math.random() * 500);
			integers[start] = randomAdded;
			intArrayList.add(randomAdded);
//			displayInt += "" +integers[start]+ ", ";
			
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
	}

//	private void fillArrayList()
//	{
//		fillIntArrayList();
//		
//	}
//
//	private void fillIntArrayList()
//	{
//		
//		
//	}

	/**
	 * fills all of the arrays
	 */
	public void fillTheArrays(int sizeOfIntArray, int randomizationOfIntArray, int doubleArraySize, int wordArraySize, int weaponArraySize, int rpsArraySize)
	{
		fillTheIntArray(sizeOfIntArray, randomizationOfIntArray);
		fillTheDoubleArray(doubleArraySize);
		fillTheStringArray(wordArraySize);
		fillTheWeaponArray(weaponArraySize);
//		fillTheRPSArray(rpsArraySize);
		
	}
	
//	private void fillTheRPSArray(int size)
//	{
//		startTime = System.currentTimeMillis();
////		String displayInt = "";
//		rpsWins = new String [size];
//		int playerComputer = (int) (Math.random() * 3);
//		int enemyComputer = (int) (Math.random() * 3);
//		for(int start = 0 ; start < integers.length; start++)
//		{
//			playerComputer = (int) (Math.random() * 3);
//			enemyComputer = (int) (Math.random() * 3);
//			
////			displayInt += "" +integers[start]+ ", ";
//			
//		}
//		endTime = System.currentTimeMillis();
//		sortTime = endTime - startTime;
////		System.out.println(displayInt);
//		
//	}

	private void fillTheStringArray(int arraySize)
	{
		words = new String [arraySize];
		int randomStartSyllable;
		int randomVowel;
		int randomEndSyllable;
		StringBuilder addedWord = new StringBuilder("");
		for(int row = 0; row<words.length; row++)
		{
			addedWord = new StringBuilder("");
			randomStartSyllable = (int) (Math.random() * 14);
			switch(randomStartSyllable)
			{
				case 0:addedWord.append("ch"); break;
				case 1:addedWord.append("c"); break;
				case 2:addedWord.append("fr"); break;
				case 3:addedWord.append("fl"); break;
				case 4:addedWord.append("sh"); break;
				case 5:addedWord.append("th"); break;
				case 6:addedWord.append("tr"); break;
				case 7:addedWord.append("k"); break;
				case 8:addedWord.append("l"); break;
				case 9:addedWord.append("r"); break;
				case 10:addedWord.append("m"); break;
				case 11:addedWord.append("n"); break;
				case 12:addedWord.append("f"); break;
				case 13:addedWord.append(""); break;
			}
			randomVowel = (int) (Math.random() * 8);
			switch(randomVowel)
			{
				case 0:addedWord.append("u"); break;
				case 1:addedWord.append("oo"); break;
				case 2:addedWord.append("ee"); break;
				case 3:addedWord.append("i"); break;
				case 4:addedWord.append("oi"); break;
				case 5:addedWord.append("a"); break;
				case 6:addedWord.append("ey"); break;
				case 7:addedWord.append(""); break;
			}
			randomEndSyllable = (int) (Math.random() * 10);
			switch(randomEndSyllable)
			{
				case 0:addedWord.append("ck"); break;
				case 1:addedWord.append("el"); break;
				case 2:addedWord.append("t"); break;
				case 3:addedWord.append("ty"); break;
				case 4:addedWord.append("lly"); break;
				case 5:addedWord.append("th"); break;
				case 6:addedWord.append("f"); break;
				case 7:addedWord.append("ch"); break;
				case 8:addedWord.append("tion"); break;
				case 12:addedWord.append(""); break;
			}
			words[row] = "" +addedWord+ "";
		}
		
	
	}

	private void fillTheDoubleArray(int arraySize)
	{
		
//		String displayInt = "";
		reals = new double [arraySize];
		for(int start = 0 ; start < reals.length; start++)
		{
			reals[start] = (Math.random() * 3000);
			
//			displayInt += "" +integers[start]+ ", ";
			
		}
		
//		System.out.println(displayInt);
		
	}
	private void fillTheWeaponArray(int arraySize)
	{
		myWeapon = new Weapon [arraySize];
		for(int row = 0; row<myWeapon.length; row++)
		{
			
				String name = "" + row +  " Weapon";
				int damage = (int) (((Math.random() * 20)+55));
				boolean canTakeHeads = (damage % 2 == 0);
				int fireRate = (int) ((Math.random() * 3));
				if(fireRate == 0)
				{
					if(canTakeHeads == false)
					{
						damage = 0;
						int criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						
					}
					else
					{
						damage = 0;
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						
					}
				}
				else if(fireRate == 1)
				{
					if(canTakeHeads == false)
					{
						damage = 0;
						int criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
					}
					else
					{
						damage = 0;
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						
					}
				}
				else if(fireRate == 2)
				{
					if(canTakeHeads == false)
					{
						damage = 0;
						int criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
						damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
						criticalBonus = (int) (Math.random() * 100);
						if(criticalBonus <= 15)
						{
							damage += (int) (((Math.random() * 20)+55)*3);
						}
						else
						{
							damage += (int) (((Math.random() * 20)+55));
						}
					}
					else
					{
						damage = 0;
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
						damage += (int) ((Math.random() * 20)+55);
					}
				}
				
				
				myWeapon[row] = new Weapon(name, damage, canTakeHeads, fireRate);
			}
		
	}
/**
 * fills the int array specifically with (size) amount of random ints any where from 0-(randomization value)
 */
	private void fillTheIntArray(int size, int randomization)
	{
		startTime = System.currentTimeMillis();
//		String displayInt = "";
		integers = new int [size];
		for(int start = 0 ; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random() * randomization);
			
//			displayInt += "" +integers[start]+ ", ";
			
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
//		System.out.println(displayInt);
	}

	public int[] getIntegers()
	{
		return integers;
	}

	public void setIntegers(int[] integers)
	{
		this.integers = integers;
	}

	public String[] getRpsWins()
	{
		return rpsWins;
	}

	public double[] getReals()
	{
		return reals;
	}

	public String[] getWords()
	{
		return words;
	}

	public Weapon[] getMyWeapon()
	{
		return myWeapon;
	}

	public void setRpsWins(String[] rpsWins)
	{
		this.rpsWins = rpsWins;
	}

	public void setReals(double[] reals)
	{
		this.reals = reals;
	}

	public void setWords(String[] words)
	{
		this.words = words;
	}

	public void setMyWeapon(Weapon[] myWeapon)
	{
		this.myWeapon = myWeapon;
	}
	
	
	
	
	
	
	
}