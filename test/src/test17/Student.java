package test17;

public class Student {
	public String name;
	public int point;
	
	public Student(String name, int point) {
		this.name = name;
		this.point = point;
	}
	public String toString() {
		return "Student [name=" + name + ",point= "+point+" ]";
	}
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("전승현",80);
		students[1] = new Student("강민우",60);
		students[2] = new Student("조현경",70);
		
		for ( int i=0; i<students.length;i++) {
			for ( int j=i+1; j<students.length;j++) {
				if(students[i].point<students[j].point) {
					int tmp =students[i].point;
					students[i].point=students[j].point;
					students[j].point=tmp;
					
				}
			}
		}
		for(int i = 0; i< students.length;i++) {
			System.out.println(students[i]);
		}
	}

}
