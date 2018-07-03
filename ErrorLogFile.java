package com.nucleus.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorLogFile {
	public void SaveLog(String line)
	{
		FileWriter fileWriter;
		PrintWriter printWriter;
		try{
			fileWriter=new FileWriter("D:\\app\\Brd1\\errorlog.txt",true);
			printWriter=new PrintWriter(fileWriter);
			printWriter.write(line+ "\n");
			printWriter.flush();
		} catch (IOException e) {

			e.printStackTrace();
		}
		}
		
	}


