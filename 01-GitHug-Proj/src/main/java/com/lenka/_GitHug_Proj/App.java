package com.lenka._GitHug_Proj;

public class App 
{
    public static void main( String[] args )
    {
        int a=25;
        int b=13;
        System.out.println("Addition :: "+sum(a, b));
        System.out.println("Substraction :: "+sub(a, b));
    }
    public static int sum(int a,int b) {
    	return a+b;
    }
    public static int sub(int a,int b) {
    	return a-b;
    }
}
