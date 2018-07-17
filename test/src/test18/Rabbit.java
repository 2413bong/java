package test18;

public class Rabbit {

	public int rank;
	public String name;

	Rabbit(String name, int rank) {
		this.name = name;
		this.rank = rank;

	}
	static void random(Rabbit[] r) {
		for (int i = 0; i < r.length; i++) {
			int rank = (int) (Math.random() * 10) + 1;
			r[i] = new Rabbit(i + "등토끼", rank);
		}
	}

	static void up(Rabbit[] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = i + 1; j < r.length; j++) {
				if (r[i].rank < r[j].rank) {
					int tmp = r[i].rank;
					r[i].rank = r[j].rank;
					r[j].rank = tmp;
				}
			}
		}

	}

	static void down(Rabbit[] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = i + 1; j < r.length; j++) {
				if (r[i].rank > r[j].rank) {
					int tmp = r[i].rank;
					r[i].rank = r[j].rank;
					r[j].rank = tmp;
				}
			}
		}
	}
	public String toString() {
		return "Rabbit [rabbitName=" + name + ", rank=" + rank + "]";
	}

	static void printArr(Rabbit[] r) {
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i]);
		}
	}
		

	public static void main(String[] args) {
		Rabbit[] r = new Rabbit[10];
		

			random(r);
			up(r);
			printArr(r);
			down(r);
			printArr(r);
			

		}
	}

