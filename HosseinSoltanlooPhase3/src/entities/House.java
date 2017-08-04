package entities;

import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class House {
	private String _name;
	private School _school;
	private Vector<Student> _students;
	private Professor _headTeacher;
	private ArrayList<String> _qualities;
	private Map<Integer, Student> _prefects;
}
