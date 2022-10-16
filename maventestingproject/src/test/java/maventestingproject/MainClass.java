package maventestingproject;
import java.nio.channels.NetworkChannel;
import java.util.*;
import static org.junit.Assert.assertArrayEquals;
import java.util.List;
import org.junit.Test;


public class MainClass {

	DatabaseDAO database;
	NetworkChannel network;

	//Setters and getters

	public boolean save(String fileName)
	{
		database.save(fileName);
		System.out.println("Saved in database in Main class");

		((MainClass) network).save(fileName);
		System.out.println("Saved in network in Main class");

		return true;
	}
}


