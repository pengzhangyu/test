package test;

public class Cell {
//	 private final int id;
	private int id;
	 public Cell(int id) {
	  this.id = id;
	 }
	 public void updateId(int id) {
	  this.id = id;
	 }
	 public static void main(String[] args) {
	  Cell cell = new Cell(1001);
	  cell.updateId(1002);
	  System.out.println(cell.id);
	 }
	}