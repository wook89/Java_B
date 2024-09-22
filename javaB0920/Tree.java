package javaB0920;

public class Tree implements Countable{
	String name;
	int num;
	
	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}
	public void ripen() {
		System.out.println(num+"그루 "+name+"에 열매가 잘 익었다.");
	}
	@Override
	public void count() {
		System.out.println(name+"가 "+num+"그루 있다.");
	}
}
