package chapter_3;

public class Animal implements Comparable{
int id;
@Override
public String toString() {
	
	return "Un Animal id : "+this.id;
}

public Animal(int id) {

	this.id = id;
}

public Animal() {

}

@Override
public boolean equals(Object obj) {
	Animal temp = (Animal)obj;
    return this.id == temp.id;
}

@Override
public int compareTo(Object o) {
	Animal temp = (Animal)o;
	return this.id - temp.id;
}
}
