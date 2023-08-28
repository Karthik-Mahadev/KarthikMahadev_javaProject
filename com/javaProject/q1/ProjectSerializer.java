package com.javaProject.q1;

import java.io.*;
import java.util.*;

import com.javaProject.q1.Employee;
import com.javaProject.q1.Project;

public class ProjectSerializer {

	public void serializeProjectDetails(Map<Project, List<Employee>> projectMap) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("project_data.ser"))) {
			oos.writeObject(projectMap);
			System.out.println("Project details serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
