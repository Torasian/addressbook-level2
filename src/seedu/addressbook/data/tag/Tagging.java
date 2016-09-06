package seedu.addressbook.data.tag;

import java.util.ArrayList;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;

public class Tagging {
	private Name name;
	private String command;
	private Tag tag;
	private String tagString;
	
	private ArrayList<String> taggingLists;
	
	public Tagging(Person person, String command, Tag tag){
		name = person.getName();
		tagString = tag.toString();
		if(command.equals("add")){
			command = "+";
		}
		else{
			command = "-";
		}
		taggingLists.add(command + " " + name + " " + tagString);
	}
}
