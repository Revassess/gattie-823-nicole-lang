package com.revature.tier1;

import java.util.Arrays;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String strNum = num + "";
		int numLength = strNum.length();
		System.out.println(numLength);
		long sum = 0;
		long[] digits = new long[numLength];
		for(int i = 0; i < numLength; i++)
		{
			digits[i] = Long.parseLong(strNum.charAt(i) + "");
			digits[i] = (long) Math.pow(digits[i], numLength);

			System.out.println(digits[i]);
			sum += digits[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("next case");
		if(sum == num)
			return true;
		else
			return false;
	}
}
