package samplepackage;

import com.actitime.generic.ExcelData;

public class PrintContentOfSheetInTableFormat extends ExcelData
{
public static void main(String[] args) 
{
	int n=3; 
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i<=j||i>j)
			{
			String	data= ExcelData.getData("./data/input.xlsx","Sheet1", i,j);
			System.out.print(data+" ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}
}