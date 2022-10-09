package com.student;

	import java.util.TreeSet;

	public class Test {

		public static void main(String[] args) {

			Student s1 = new Student(75, "Smit");
			Student s2 = new Student(88, "Rani");
			Student s3 = new Student(79, "Varsha");
			Student s4 = new Student(60, "Pooja");

			TreeSet ts = new TreeSet ();

			ts.add(s2);
			ts.add(s1);
			ts.add(s4);
			ts.add(s3);


			System.out.println(ts);
		}


}
